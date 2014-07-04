package hu.tewe.letslearnlol.datagatherer.leaguechampion;

/**
 * @author: tewe
 */
public class ChampionDetailsInfo {

    private Integer attack;
    private Integer defense;
    private Integer magic;
    private Integer difficulty;

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(final Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(final Integer defense) {
        this.defense = defense;
    }

    public Integer getMagic() {
        return magic;
    }

    public void setMagic(final Integer magic) {
        this.magic = magic;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(final Integer difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "ChampionDetailsInfo{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", magic=" + magic +
                ", difficulty=" + difficulty +
                '}';
    }
}
