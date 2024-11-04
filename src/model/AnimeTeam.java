package model;

import java.time.LocalDateTime;

public class AnimeTeam {
    private int id;
    private String teamName;
    private String originSeries;
    private LocalDateTime formationDate;

    public AnimeTeam() {
    }

    @Override
    public String toString() {
        return "AnimeTeam{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", originSeries='" + originSeries + '\'' +
                ", formationDate=" + formationDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getOriginSeries() {
        return originSeries;
    }

    public void setOriginSeries(String originSeries) {
        this.originSeries = originSeries;
    }

    public LocalDateTime getFormationDate() {
        return formationDate;
    }

    public void setFormationDate(LocalDateTime formationDate) {
        this.formationDate = formationDate;
    }
}
