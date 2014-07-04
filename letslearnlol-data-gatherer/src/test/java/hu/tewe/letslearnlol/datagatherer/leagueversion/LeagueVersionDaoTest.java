package hu.tewe.letslearnlol.datagatherer.leagueversion;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import uk.org.lidalia.slf4jtest.TestLogger;
import uk.org.lidalia.slf4jtest.TestLoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.when;
import static uk.org.lidalia.slf4jtest.LoggingEvent.error;

/**
 * @author: tewe
 */
public class LeagueVersionDaoTest {

    public static final String EUW_REALM_JSON_URL = "http://ddragon.leagueoflegends.com/realms/euw.json";
    public static final String ERROR_READING_VALUE = "Error reading value";
    private TestLogger logger = TestLoggerFactory.getTestLogger(LeagueVersionDao.class);

    @Mock
    private ObjectMapper objectMapper;
    private URL url;

    @BeforeClass
    public void beforeClass() throws Exception {
        url = new URL(EUW_REALM_JSON_URL);
    }

    @BeforeMethod(alwaysRun=true)
    public void beforeMethod() {
        MockitoAnnotations.initMocks(this);
        TestLoggerFactory.clear();
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Parameter 'objectMapper' should not be null")
    public void testShouldThrowExceptionWhenObjectMapperIsNull() throws Exception {
        new LeagueVersionDao(null);
    }

    @Test(dataProvider = "leagueVersionProvider")
    public void testGetLeagueVersion(String version, Locale locale) throws Exception {
        LeagueVersionDao leagueVersionDao = new LeagueVersionDao(objectMapper);
        final LeagueVersion expectedLeagueVersion = new LeagueVersion();
        expectedLeagueVersion.setVersion(version);
        expectedLeagueVersion.setLocale(locale.toString());
        when(objectMapper.readValue(url, LeagueVersion.class)).thenReturn(expectedLeagueVersion);

        LeagueVersion leagueVersion = leagueVersionDao.getLeagueVersion();

        Assert.assertEquals(leagueVersion, expectedLeagueVersion);
    }

    @DataProvider
    public Object[][] leagueVersionProvider() {
        return new Object[][]{{"4.1.2", Locale.US}, {"3.14.41", Locale.US}};
    }

    @Test
    public void testShouldLogError() throws Exception {
        LeagueVersionDao leagueVersionDao = new LeagueVersionDao(objectMapper);
        when(objectMapper.readValue(url, LeagueVersion.class)).thenThrow(new IOException(ERROR_READING_VALUE));

        leagueVersionDao.getLeagueVersion();

        Assert.assertEquals(logger.getLoggingEvents(), asList(error("Couldn't access URL {}, cause: {}", url, ERROR_READING_VALUE)));
    }
}
