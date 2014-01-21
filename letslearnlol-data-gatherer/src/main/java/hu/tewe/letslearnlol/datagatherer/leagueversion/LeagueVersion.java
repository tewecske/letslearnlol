package hu.tewe.letslearnlol.datagatherer.leagueversion;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Locale;

/**
 * @author: tewe
 */
public class LeagueVersion {
    @JsonProperty("v")
    private String version;
    @JsonProperty("l")
    private Locale locale;
    @JsonProperty("cdn")
    private String cdnUrl;
    private String dd;
    private String lg;
    private String css;
    @JsonProperty("profileiconmax")
    private Integer profileIconMax;
    private String store;
    private LeagueVersionDetails leagueVersionDetails;

    public void setVersion(final String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "version=" + version +
               ", locale=" + locale;
    }

    public void setLocale(final Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setCdnUrl(final String cdnUrl) {
        this.cdnUrl = cdnUrl;
    }

    public String getCdnUrl() {
        return cdnUrl;
    }

    public void setDd(final String dd) {
        this.dd = dd;
    }

    public String getDd() {
        return dd;
    }

    public void setLg(final String lg) {
        this.lg = lg;
    }

    public String getLg() {
        return lg;
    }

    public void setCss(final String css) {
        this.css = css;
    }

    public String getCss() {
        return css;
    }

    public void setProfileIconMax(final Integer profileIconMax) {
        this.profileIconMax = profileIconMax;
    }

    public Integer getProfileIconMax() {
        return profileIconMax;
    }

    public void setStore(final String store) {
        this.store = store;
    }

    public String getStore() {
        return store;
    }

    public void setLeagueVersionDetails(final LeagueVersionDetails leagueVersionDetails) {
        this.leagueVersionDetails = leagueVersionDetails;
    }

    public LeagueVersionDetails getLeagueVersionDetails() {
        return leagueVersionDetails;
    }
}
