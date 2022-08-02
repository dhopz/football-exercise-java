package football.exercise;

import java.util.ArrayList;
import java.util.Date;

public class Games {
    public Integer id;
    public String homeTeam;
    public String awayTeam;
    public String location;
    public Date dateOfGame;
    public Date season; // as in 2020/2021
    public Stats stats;

    public Games(
        Integer id, 
        String homeTeam, 
        String awayTeam, 
        String location,
        Integer homeGoals,
        Integer awayGoals,
        Integer redCards,
        Integer yellowCards
        )
        {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.location = location;
        this.stats = new Stats(
            id, 
            homeGoals, 
            awayGoals, 
            redCards, 
            yellowCards);
    }

    public ArrayList<Games> getMatchStatitics() {
        ArrayList<Games> games = new ArrayList<Games>();
        //Create a function for each game, get the statistics of the match
        return games;
        
    }

    
}
  