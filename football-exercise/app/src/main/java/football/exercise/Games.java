package football.exercise;

import java.util.Date;
import java.util.HashMap;

public class Games {
    private Integer id;
    private String homeTeam;
    private String awayTeam;
    private Date dateOfGame;
    private Date season; // as in 2020/2021
    private Stats stats;

    public Games(
        Integer id, 
        String homeTeam, 
        String awayTeam,
        Integer homeGoals,
        Integer awayGoals,
        Integer redCards,
        Integer yellowCards
        )
        {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
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
        stringData.put("homeTeam",this.homeTeam);
        stringData.put("awayTeam",this.awayTeam);
        
        HashMap<String,String> resultData = stats.gameResults();

        stringData.putAll(resultData);
        
        return stringData;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Date getDateOfGame() {
        return dateOfGame;
    }

    public void setDateOfGame(Date dateOfGame) {
        this.dateOfGame = dateOfGame;
    }

    public Date getSeason() {
        return season;
    }

    public void setSeason(Date season) {
        this.season = season;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    
}
  