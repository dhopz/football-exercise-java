package football.exercise;

import java.util.HashMap;

public class Stats {
    public Integer id;
    public Integer homeGoals= 0;
    public Integer awayGoals= 0;
    public Integer redCards = 0;
    public Integer yellowCards = 0;
    

    public Stats(
        Integer id,
        Integer homeGoals,
        Integer awayGoals,
        Integer redCards,
        Integer yellowCards
        ){
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.redCards = redCards;
        this.yellowCards = yellowCards;
    }

    public Integer getHomeGoals(){
        return this.homeGoals;
    }

    public HashMap<String, String> gameResults(){
        //Function to create the results based on the statistics provided
        //return an ArrayList
        HashMap<String, String> integerData = new HashMap<>();
        integerData.put("homeGoals",this.homeGoals.toString());
        integerData.put("awayGoals",this.awayGoals.toString());
        integerData.put("redCards",this.redCards.toString());
        integerData.put("yellowCards",this.yellowCards.toString());

        return integerData;
    }
    
}
