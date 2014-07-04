package hu.tewe.letslearnlol.datagatherer.leagueversion;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author: tewe
 */
public class LeagueVersionDao {

    public static final String EUW_REALM_JSON_URL = "http://ddragon.leagueoflegends.com/realms/euw.json";
    private ObjectMapper objectMapper;
    private URL url;
    private Logger logger = LoggerFactory.getLogger(LeagueVersionDao.class);

    public LeagueVersionDao(final ObjectMapper objectMapper) {
        Assert.notNull(objectMapper, "Parameter 'objectMapper' should not be null");
        this.objectMapper = objectMapper;
        try {
            url = new URL(EUW_REALM_JSON_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public LeagueVersion getLeagueVersion() {
        LeagueVersion leagueVersion;

        try {
            leagueVersion = objectMapper.readValue(url, LeagueVersion.class);
        } catch (IOException e) {
            logger.error("Couldn't access URL {}, cause: {}", url, e.getMessage());
            leagueVersion = new LeagueVersion();
        }

        return leagueVersion;
    }
}
