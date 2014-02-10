package hu.tewe.letslearnlol.datagatherer.leaguechampion;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author: tewe
 */
public class LeagueChampionDetails {
    private String id;
    private String key;
    private String name;
    @JsonProperty("partype")
    private String parType;

    public void setId(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ahri";
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setParType(final String parType) {
        this.parType = parType;
    }

    public String getParType() {
        return parType;
    }
}
