package hu.tewe.letslearnlol.datagatherer.leagueversion;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author: tewe
 */
public class LeagueVersionMappingIntegrationTest {

    @Test
    public void testLeagueVersionMapping() throws Exception {

        String jsonString = "{\"n\":{\"item\":\"4.1.2\",\"rune\":\"4.1.2\",\"mastery\":\"4.1.2\",\"summoner\":\"4.1.2\",\"champion\":\"4.1.2\",\"profileicon\":\"4.1.2\",\"language\":\"3.14.41\"},\"v\":\"4.1.2\",\"l\":\"en_US\",\"cdn\":\"http:\\/\\/ddragon.leagueoflegends.com\\/cdn\",\"dd\":\"3.14.41\",\"lg\":\"0.152.55\",\"css\":\"0.152.55\",\"profileiconmax\":28,\"store\":null,\"unknownProperty\":\"value\"}";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        LeagueVersion leagueVersion = objectMapper.readValue(jsonString, LeagueVersion.class);

        Assert.assertEquals(leagueVersion.toString(), "version=4.1.2, locale=en_us");

    }
}
