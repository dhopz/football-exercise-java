package football.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Leagues {

    private final String league;
    private final String country;
    private final String[] clubs;
    private final List<Games> footballGames = new ArrayList<>();
    private final List<Results> footballResults = new ArrayList<>();
    private final List<Table> footballTable = new ArrayList<>();

    public Leagues(String league, String country, String[] clubs){
        this.league = league;
        this.country = country;
        this.clubs = clubs;
    }

    public List<Games> getFootballGames() {
        return footballGames;
    }
    public List<Results> getFootballResults() {
        return footballResults;
    }
    public List<Table> getFootballTable() {
        return footballTable;
    }
    public static Integer randomInt(){
        Random r = new Random();
        return r.nextInt(5);
    }

    public List<Games> createGames(){
        int i = 0;
        for (String homeTeam: clubs){
            for (String awayTeam: clubs){
                if(Objects.equals(homeTeam, awayTeam)) continue;
                footballGames.add(new Games(i, homeTeam, awayTeam, randomInt(), randomInt(), randomInt(), randomInt()));
                i++;
            }
        }
        return this.footballGames;
    }

   public List<Results> createResults(){
       // Create {goalsFor=0, lost=1, won=0, team=Bournemouth, drawn=0, goalsAgainst=1, played=1, goalDifference=-1, points=0}
       int won;
       int drawn;
       int points;
       int lost;

       for (Games game: createGames()){
           if(game.getStats().getHomeGoals() > game.getStats().getAwayGoals()){
               won = 1;
               drawn = 0;
               lost = 0;
               points = 3;
           } else if(game.getStats().getHomeGoals() < game.getStats().getAwayGoals()){
               won = 0;
               drawn = 0;
               lost = 1;
               points = 0;
           } else {
               won = 0;
               drawn = 1;
               lost = 0;
               points = 1;
           }

           footballResults.add(new Results(game.getHomeTeam(), 1, won, drawn, lost, game.getStats().getHomeGoals(), game.getStats().getAwayGoals(), game.getStats().getHomeGoals() - game.getStats().getAwayGoals(), points));
           footballResults.add(new Results(game.getAwayTeam(), 1, won, drawn, lost, game.getStats().getAwayGoals(), game.getStats().getHomeGoals(), game.getStats().getAwayGoals() - game.getStats().getHomeGoals(), points));
       }
       return this.footballResults;
   }
   public void generateTable(String[] clubs){
       for (String club:clubs){

           int played = 0;
           int won = 0;
           int drawn= 0;
           int lost= 0;
           int goalsFor= 0;
           int goalsAgainst= 0;
           int goalDifference= 0;
           int points= 0;
           ArrayList<String> lastFive = new ArrayList<>();

           for (Results result: footballResults){

               if(Objects.equals(result.getTeam(), club)){
                   points = points + result.getPoints();
                   played = played + result.getPlayed();
                   won = won + result.getWon();
                   drawn= drawn + result.getDrawn();
                   lost= lost + result.getLost();
                   goalsFor= goalsFor + result.getGoalsFor();
                   goalsAgainst= goalsAgainst + result.getGoalsAgainst();
                   goalDifference= goalDifference + result.getGoalDifference();

                   if (result.getWon() == 1){
                       lastFive.add("W");
                   }
                   else if (result.getLost()== 1){
                       lastFive.add("L");
                   }
                   else {
                       lastFive.add("D");
                   }

               }
           }
           footballTable.add(new Table(club, played, won, drawn, lost, goalsFor, goalsAgainst, goalDifference, points, lastFive));
       }
   }

    @Override
    public String toString() {
        return "Leagues{" +
                "league='" + league + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}