package football.exercise;

import java.util.HashMap;
import java.util.Map;

public class Stats {
    private final Integer id;
    private Integer homeGoals= 0;
    private Integer awayGoals= 0;
    private Integer redCards = 0;
    private Integer yellowCards = 0;
    

    public Stats(
        Integer id,
        Integer homeGoals,
        Integer awayGoals,
        Integer redCards,
        Integer yellowCards
        ){
        this.id = id;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.redCards = redCards;
        this.yellowCards = yellowCards;
    }

    public Integer getHomeGoals(){
        return this.homeGoals;
    }

    public Map<String, String> gameResults(){
        //Function to create the results based on the statistics provided
        //return an ArrayList
        HashMap<String, String> integerData = new HashMap<>();
        integerData.put("gameId",this.id.toString());
        integerData.put("homeGoals",this.homeGoals.toString());
        integerData.put("awayGoals",this.awayGoals.toString());
        integerData.put("redCards",this.redCards.toString());
        integerData.put("yellowCards",this.yellowCards.toString());

        return integerData;
    }

    public Integer getId() {
        return id;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }
}
