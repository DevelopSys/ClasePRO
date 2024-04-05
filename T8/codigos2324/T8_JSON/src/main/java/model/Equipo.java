package model;

public class Equipo {
    private String idTeam, strTeam, intFormedYear, strTeamBadge;

    public Equipo(String idTeam, String strTeam, String intFormedYear, String strTeamBadge) {
        this.idTeam = idTeam;
        this.strTeam = strTeam;
        this.intFormedYear = intFormedYear;
        this.strTeamBadge = strTeamBadge;
    }

    public Equipo() {
    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public String getIntFormedYear() {
        return intFormedYear;
    }

    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }
}
