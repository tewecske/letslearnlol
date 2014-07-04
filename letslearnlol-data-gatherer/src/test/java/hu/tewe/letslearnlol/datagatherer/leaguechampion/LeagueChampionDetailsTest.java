package hu.tewe.letslearnlol.datagatherer.leaguechampion;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;

/**
 * @author: tewe
 */
public class LeagueChampionDetailsTest {

    @Test
    public void testInit() throws Exception {
        LeagueChampionDetails leagueChampionDetails = new LeagueChampionDetails();
        leagueChampionDetails.setId("Ahri");
        leagueChampionDetails.setKey("103");
        leagueChampionDetails.setName("Ahri");
        leagueChampionDetails.setParType("Mana");

        Assert.assertEquals(leagueChampionDetails.toString(), "LeagueChampionDetails{id='Ahri', key='103', name='Ahri'}");
    }

    @Test
    public void testLeagueChampionDetailsShouldHaveJsonAnnotations() throws Exception {
        Class<?> classToVerify = LeagueChampionDetails.class;
        Field field = classToVerify.getDeclaredField("parType");
        Assert.assertEquals(field.getAnnotation(JsonProperty.class).value(), "partype");
    }

}
