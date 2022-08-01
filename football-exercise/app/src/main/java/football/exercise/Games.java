package football.exercise;

import java.util.Date;

public class Games {
    public String homeTeam;
    public String awayTeam;
    public String location;
    public String duration;
    public Date dateOfGame;
    public Date season; // as in 2020/2021

    public Games(String homeTeam, String awayTeam, String location){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.location = location;

    }
    
}
