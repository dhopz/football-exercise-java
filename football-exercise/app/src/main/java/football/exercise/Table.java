package football.exercise;

import java.util.ArrayList;

public class Table extends Results{

    private String team;
    private Integer played;
    private Integer won;
    private Integer drawn;
    private Integer lost;
    private Integer goalsFor;
    private Integer goalsAgainst;
    private Integer goalDifference;
    private Integer points;
    private ArrayList<String> lastFive;


    private Integer rank;

    public Table(String team, Integer played, Integer won, Integer drawn, Integer lost, Integer goalsFor,
            Integer goalsAgainst, Integer goalDifference, Integer points, ArrayList<String> lastFive) {
        super(team, played, won, drawn, lost, goalsFor, goalsAgainst, goalDifference, points);
        //TODO Auto-generated constructor stub
        this.team = team;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalDifference = goalDifference;
        this.points = points;
        this.lastFive = lastFive;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Integer getWon() {
        return won;
    }

    public void setWon(Integer won) {
        this.won = won;
    }

    public Integer getDrawn() {
        return drawn;
    }

    public void setDrawn(Integer drawn) {
        this.drawn = drawn;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Integer getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public Integer getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(Integer goalDifference) {
        this.goalDifference = goalDifference;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public ArrayList<String> getLastFive() {
        return lastFive;
    }

    public void setLastFive(ArrayList<String> lastFive) {
        this.lastFive = lastFive;
    }


    public void getPosition(){
        System.out.printf("Team=%s, played=%d, won=%d, drawn=%d, lost=%d, goalsFor=%d, goalsAgainst=%d, goalDifference=%d, points=%d %n",team,played,won,drawn,lost,goalsFor,goalsAgainst,goalDifference,points); 
    }
    
    @Override
    public String toString(){               
        return String.format(" Rank=%s Team=%s Played=%d won=%d drawn=%d lost=%d goalsFor=%d goalsAgainst=%d goalDifference=%d points=%d lastFive=%s",
                rank,
                team,
                played,
                won,
                drawn,
                lost,
                goalsFor,
                goalsAgainst,
                goalDifference,
                points,
                lastFive.subList(lastFive.size() - 5, lastFive.size()));

    }
    
}
