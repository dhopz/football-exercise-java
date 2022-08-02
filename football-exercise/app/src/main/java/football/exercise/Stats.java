package football.exercise;

public class Stats {
    public Integer id;
    private Integer homeGoals= 0;
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

    public static void gameResults(){
        //Function to create the results based on the statistics provided
        //return an ArrayList
    }
    
}
