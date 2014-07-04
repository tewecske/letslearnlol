package hu.tewe.letslearnlol.datagatherer.leaguechampion;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author: tewe
 */
public class LeagueChampionDetails {
    private String id;
    private String key;
    private String name;
    @JsonProperty("partype")
    private String parType;
    private ChampionDetailsInfo info;

    public void setId(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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

    public ChampionDetailsInfo getInfo() {
        return info;
    }

    public void setInfo(final ChampionDetailsInfo info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "LeagueChampionDetails{" +
                "id='" + id + '\'' +
                ", key='" + key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
