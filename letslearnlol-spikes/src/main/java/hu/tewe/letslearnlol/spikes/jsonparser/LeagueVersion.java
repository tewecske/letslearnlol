package hu.tewe.letslearnlol.spikes.jsonparser;

import org.codehaus.jackson.annotate.JsonProperty;

import java.net.URL;
import java.util.Locale;

/**
 * @author: tewe
 */
public class LeagueVersion {

    @JsonProperty("n")
    private LeagueVersionDetail leagueVersionDetail;
    @JsonProperty("v")
    private String version;
    @JsonProperty("l")
    private Locale locale;
    @JsonProperty("cdn")
    private URL cdnUrl;
    @JsonProperty("dd")
    private String dd;
    @JsonProperty("lg")
    private String lg;
    @JsonProperty("css")
    private String css;
    @JsonProperty("profileiconmax")
    private Integer profileIconMax;
    @JsonProperty("store")
    private String store;

    public LeagueVersionDetail getLeagueVersionDetail() {
        return leagueVersionDetail;
    }

    public void setLeagueVersionDetail(final LeagueVersionDetail leagueVersionDetail) {
        this.leagueVersionDetail = leagueVersionDetail;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(final Locale locale) {
        this.locale = locale;
    }

    public URL getCdnUrl() {
        return cdnUrl;
    }

    public void setCdnUrl(final URL cdnUrl) {
        this.cdnUrl = cdnUrl;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(final String dd) {
        this.dd = dd;
    }

    public String getLg() {
        return lg;
    }

    public void setLg(final String lg) {
        this.lg = lg;
    }

    public String getCss() {
        return css;
    }

    public void setCss(final String css) {
        this.css = css;
    }

    public Integer getProfileIconMax() {
        return profileIconMax;
    }

    public void setProfileIconMax(final Integer profileIconMax) {
        this.profileIconMax = profileIconMax;
    }

    public String getStore() {
        return store;
    }

    public void setStore(final String store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "LeagueVersion{" +
                "leagueVersionDetail=" + leagueVersionDetail +
                ", version='" + version + '\'' +
                ", locale=" + locale +
                ", cdnUrl=" + cdnUrl +
                ", dd='" + dd + '\'' +
                ", lg='" + lg + '\'' +
                ", css='" + css + '\'' +
                ", profileIconMax=" + profileIconMax +
                ", store='" + store + '\'' +
                '}';
    }
}
