package hu.tewe.letslearnlol.datagatherer;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import hu.tewe.letslearnlol.datagatherer.leaguechampion.LeagueChampionDao;
import hu.tewe.letslearnlol.datagatherer.leaguechampion.LeagueChampionDetails;
import hu.tewe.letslearnlol.datagatherer.leagueversion.LeagueVersion;
import hu.tewe.letslearnlol.datagatherer.leagueversion.LeagueVersionDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: tewe
 */
public class LolTester {

    private final static Logger logger = LoggerFactory.getLogger(LolTester.class);

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        LeagueVersionDao leagueVersionDao = new LeagueVersionDao(objectMapper);

        LeagueVersion leagueVersion = leagueVersionDao.getLeagueVersion();

        logger.info("Version: " + leagueVersion);
        logger.info("CDN: " + leagueVersion.getCdnUrl());
        logger.info("DD: " + leagueVersion.getDd());
        logger.info("LG: " + leagueVersion.getLg());
        logger.info("Store: " + leagueVersion.getStore());
        logger.info("CSS: " + leagueVersion.getCss());
        logger.info("Details: " + leagueVersion.getLeagueVersionDetails());

        // http://ddragon.leagueoflegends.com/cdn/4.10.7/data/en_US/champion/Ahri.json
        LeagueChampionDao leagueChampionDao = new LeagueChampionDao(leagueVersion.getCdnUrl()
                + "/" + leagueVersion.getLeagueVersionDetails().getChampion()
        + "/data/" + leagueVersion.getLocale()
        + "/champion/", objectMapper);
        LeagueChampionDetails ahri = leagueChampionDao.queryChampion("Ahri");

        logger.info("Ahri: " + ahri);
        logger.info("Info: " + ahri.getInfo());

    }

}
