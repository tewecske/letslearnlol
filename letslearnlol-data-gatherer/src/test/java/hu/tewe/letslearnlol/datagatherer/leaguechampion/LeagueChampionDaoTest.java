package hu.tewe.letslearnlol.datagatherer.leaguechampion;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.mockito.Mock;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * @author: tewe
 */
public class LeagueChampionDaoTest {

    @Mock
    private ObjectMapper objectMapper;

    @BeforeClass
    public void beforeClass() throws Exception {
        initMocks(this);
    }

    @Test
    public void testInit() throws Exception {
        LeagueChampionDao leagueChampionDao = new LeagueChampionDao(
                "http://ddragon.leagueoflegends.com/cdn/4.11.3/data/en_US/champion/", objectMapper);
        LeagueChampionDetails expectedLeagueChampionDetails = new LeagueChampionDetails();
        expectedLeagueChampionDetails.setId("123");
        when(objectMapper.readValue(isA(URL.class), isA(Class.class))).thenReturn(expectedLeagueChampionDetails);

        LeagueChampionDetails leagueChampionDetails = leagueChampionDao.queryChampion("Ahri");

        Assert.assertEquals(leagueChampionDetails, expectedLeagueChampionDetails);

    }
}
