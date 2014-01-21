package hu.tewe.letslearnlol.datagatherer.leagueversion;

import org.codehaus.jackson.annotate.JsonProperty;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;

/**
 * @author: tewe
 */
public class LeagueVersionDetailsTest {

    @Test
    public void testInit() throws Exception {
        LeagueVersionDetails leagueVersionDetails = new LeagueVersionDetails();
        leagueVersionDetails.setItem("4.1.2");
        leagueVersionDetails.setRune("4.1.2");
        leagueVersionDetails.setMastery("4.1.2");
        leagueVersionDetails.setSummoner("4.1.2");
        leagueVersionDetails.setChampion("4.1.2");
        leagueVersionDetails.setProfileIcon("4.1.2");
        leagueVersionDetails.setLanguage("3.14.41");

        Assert.assertEquals(leagueVersionDetails.toString(),
                "item=4.1.2, rune=4.1.2, mastery=4.1.2, summoner=4.1.2, champion=4.1.2, profileIcon=4.1.2, language=3.14.41");
    }

    @Test
    public void testLeagueVersionDetailsShouldHaveJsonAnnotations() throws Exception {
        Class<?> classToVerify = LeagueVersionDetails.class;
        Field field = classToVerify.getDeclaredField("profileIcon");
        Assert.assertEquals(field.getAnnotation(JsonProperty.class).value(), "profileicon");
    }
}
