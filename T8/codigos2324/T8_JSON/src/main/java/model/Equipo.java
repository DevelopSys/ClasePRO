package model;

public class Equipo {
    private String idTeam, intRank, strTeam, intFormedYear, strTeamBadge, intPoints, intGoalsFor, intGoalsAgainst;

    public Equipo(String idTeam, String intRank, String strTeam, String intFormedYear, String strTeamBadge, String intPoints, String intGoalsFor, String intGoalsAgainst) {
        this.idTeam = idTeam;
        this.intRank = intRank;
        this.strTeam = strTeam;
        this.intFormedYear = intFormedYear;
        this.strTeamBadge = strTeamBadge;
        this.intPoints = intPoints;
        this.intGoalsFor = intGoalsFor;
        this.intGoalsAgainst = intGoalsAgainst;
    }

    public Equipo() {
    }

    public String getIntRank() {
        return intRank;
    }

    public void setIntRank(String intRank) {
        this.intRank = intRank;
    }

    public String getIntPoints() {
        return intPoints;
    }

    public void setIntPoints(String intPoints) {
        this.intPoints = intPoints;
    }

    public String getIntGoalsFor() {
        return intGoalsFor;
    }

    public void setIntGoalsFor(String intGoalsFor) {
        this.intGoalsFor = intGoalsFor;
    }

    public String getIntGoalsAgainst() {
        return intGoalsAgainst;
    }

    public void setIntGoalsAgainst(String intGoalsAgainst) {
        this.intGoalsAgainst = intGoalsAgainst;
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
