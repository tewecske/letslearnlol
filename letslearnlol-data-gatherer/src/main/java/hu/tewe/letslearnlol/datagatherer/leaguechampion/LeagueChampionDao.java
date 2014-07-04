package hu.tewe.letslearnlol.datagatherer.leaguechampion;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author: tewe
 */
public class LeagueChampionDao {
    private final static Logger logger = LoggerFactory.getLogger(LeagueChampionDao.class);
    private final String url;
    private final ObjectMapper mapper;

    public LeagueChampionDao(final String url, final ObjectMapper mapper) {
        this.url = url;
        this.mapper = mapper;
    }

    public LeagueChampionDetails queryChampion(String name) {
        LeagueChampionDetails leagueChampionDetails = new LeagueChampionDetails();
        try {
            String championUrl = this.url + name + ".json";
            logger.info("Champion {} url {}", name, championUrl);
            URL url = new URL(championUrl);
            JsonNode jsonNode = mapper.readTree(url);
            JsonNode championNode = jsonNode.findValue(name);
            leagueChampionDetails= mapper.treeToValue(championNode, LeagueChampionDetails.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return leagueChampionDetails;
    }


}
