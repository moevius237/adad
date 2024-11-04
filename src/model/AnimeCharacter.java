package model;

public class AnimeCharacter {
    private int id;
    private String name;
    private String specialPower;
    private int popularityLevel;
    private String originSeries;

    public AnimeCharacter() {
    }

    @Override
    public String toString() {
        return "AnimeCharacter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialPower='" + specialPower + '\'' +
                ", popularityLevel=" + popularityLevel +
                ", originSeries='" + originSeries + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public int getPopularityLevel() {
        return popularityLevel;
    }

    public void setPopularityLevel(int popularityLevel) {
        this.popularityLevel = popularityLevel;
    }

    public String getOriginSeries() {
        return originSeries;
    }

    public void setOriginSeries(String originSeries) {
        this.originSeries = originSeries;
    }
}
