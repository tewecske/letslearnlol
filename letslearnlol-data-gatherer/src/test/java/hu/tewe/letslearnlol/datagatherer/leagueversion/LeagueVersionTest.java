package hu.tewe.letslearnlol.datagatherer.leagueversion;

import org.codehaus.jackson.annotate.JsonProperty;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.util.Locale;

/**
 * @author: tewe
 */
public class LeagueVersionTest {

    @Test
    public void testInit() throws Exception {
        LeagueVersion leagueVersion = new LeagueVersion();
        leagueVersion.setVersion("4.1.2");
        leagueVersion.setLocale(Locale.US);
        leagueVersion.setCdnUrl("http://ddragon.leagueoflegends.com/cdn");
        leagueVersion.setDd("3.14.41");
        leagueVersion.setLg("0.152.55");
        leagueVersion.setCss("0.152.55");
        leagueVersion.setProfileIconMax(28);
        leagueVersion.setStore(null);
        leagueVersion.setLeagueVersionDetails(new LeagueVersionDetails());

        Assert.assertEquals(leagueVersion.toString(), "version=4.1.2, locale=en_US");
    }

    @Test
    public void testLeagueVersionShouldHaveJsonAnnotations() throws Exception {
        Class<?> classToVerify = LeagueVersion.class;
        Field field = classToVerify.getDeclaredField("version");
        Assert.assertEquals(field.getAnnotation(JsonProperty.class).value(), "v");
        field = classToVerify.getDeclaredField("locale");
        Assert.assertEquals(field.getAnnotation(JsonProperty.class).value(), "l");
        field = classToVerify.getDeclaredField("cdnUrl");
        Assert.assertEquals(field.getAnnotation(JsonProperty.class).value(), "cdn");
        field = classToVerify.getDeclaredField("1profileIconMax");
        Assert.assertEquals(field.getAnnotation(JsonProperty.class).value(), "profileiconmax");
    }
}