package football.exercise;

public class Stats {
    private Integer goals = 0;
    public Integer redCards = 0;
    public Integer yellowCards = 0;
    public Double possesion;
    public Integer shotsOnTarget;
    public Integer shots;
    public Integer touches;
    public Integer passes;
    public Integer tackles;
    public Integer clearances;
    public Integer corners;
    public Integer offsides;
    public Integer foulsConceded;

    public Stats(Integer id){
        // this.goals = 0; 
        // this.redCards = 0;

    }

    public Integer getGoals(){
        return this.goals;
    }

    public static void gameResults(){
        //Function to create the results based on the statistics provided
        //return an ArrayList
    }
    
}
