package hu.tewe.letslearnlol.spikes.jsonparser;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author: tewe
 */
public class LeagueVersionDetail {

    private String item;
    private String rune;
    private String mastery;
    private String summoner;
    private String champion;
    @JsonProperty("profileicon")
    private String profileIcon;
    private String language;

    public String getItem() {
        return item;
    }

    public void setItem(final String item) {
        this.item = item;
    }

    public String getRune() {
        return rune;
    }

    public void setRune(final String rune) {
        this.rune = rune;
    }

    public String getMastery() {
        return mastery;
    }

    public void setMastery(final String mastery) {
        this.mastery = mastery;
    }

    public String getSummoner() {
        return summoner;
    }

    public void setSummoner(final String summoner) {
        this.summoner = summoner;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(final String champion) {
        this.champion = champion;
    }

    public String getProfileIcon() {
        return profileIcon;
    }

    public void setProfileIcon(final String profileIcon) {
        this.profileIcon = profileIcon;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "LeagueVersionDetail{" +
                "item='" + item + '\'' +
                ", rune='" + rune + '\'' +
                ", mastery='" + mastery + '\'' +
                ", summoner='" + summoner + '\'' +
                ", champion='" + champion + '\'' +
                ", profileIcon='" + profileIcon + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
