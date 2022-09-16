package football.exercise;

import java.util.HashMap;
import java.util.Map;

public class Results {
    private String team;
    private Integer played;
    private Integer won;
    private Integer drawn;
    private Integer lost;
    private Integer goalsFor;
    private Integer goalsAgainst;
    private Integer goalDifference;
    private Integer points;
    

    public Results(
        String team,
        Integer played,
        Integer won,
        Integer drawn,
        Integer lost,
        Integer goalsFor,
        Integer goalsAgainst,
        Integer goalDifference,
        Integer points
        )
        {
        this.team = team;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalDifference = goalDifference;
        this.points = points;
       
        // {team=Chelsea, played=38,won=x,drawn=x,lost=x,GF=x,GA=x,GD=x,points=x}
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

    public Map<String,Object> resultEntry(){
        HashMap<String, Object> results = new HashMap<>();
        results.put("team",this.team);
        results.put("played",this.played);
        results.put("won",this.won);
        results.put("drawn",this.drawn);
        results.put("lost",this.lost);
        results.put("goalsFor",this.goalsFor);
        results.put("goalsAgainst",this.goalsAgainst);
        results.put("goalDifference",this.goalDifference);
        results.put("points",this.points);

        return results;
    }

}