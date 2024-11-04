package model;

public class CharacterTeam {
    private int teamId;
    private int characterId;
    private String roleInteam;
    private int yearsInTeam;

    @Override
    public String toString() {
        return "CharacterTeam{" +
                "teamId=" + teamId +
                ", characterId=" + characterId +
                ", roleInteam='" + roleInteam + '\'' +
                ", yearsInTeam=" + yearsInTeam +
                '}';
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getRoleInteam() {
        return roleInteam;
    }

    public void setRoleInteam(String roleInteam) {
        this.roleInteam = roleInteam;
    }

    public int getYearsInTeam() {
        return yearsInTeam;
    }

    public void setYearsInTeam(int yearsInTeam) {
        this.yearsInTeam = yearsInTeam;
    }
}
