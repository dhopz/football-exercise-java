package football.exercise;

import java.util.Date;
import java.util.HashMap;

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

    public HashMap<String, String> getMatchResults() {
        //Create a function for each game, get the statistics of the match
        //{location:Stamford Bridge,hometeam:Chelsea,homeGoals:2,awayTeam:Arsenal,awayGoals:1,redCards:0,yellowCards:2}
        HashMap<String, String> stringData = new HashMap<>();
        stringData.put("location",this.location);
        stringData.put("homeTeam",this.homeTeam);
        stringData.put("awayTeam",this.awayTeam);
        
        HashMap<String,String> intergerData = stats.gameResults();

        stringData.putAll(intergerData);
        
        return stringData;
        
    }

    
}
  