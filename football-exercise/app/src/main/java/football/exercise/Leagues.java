package football.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Leagues {

    private final String league;
    private final String country;
    private final List<Games> footballGames = new ArrayList<>();
    private final List<Results> footballResults = new ArrayList<>();

    public Leagues(String league, String country){
        this.league = league;
        this.country = country;
    }

    public List<Games> getFootballGames() {
        return footballGames;
    }

    public List<Results> getFootballResults() {
        return footballResults;
    }
    public static Integer randomInt(){
        Random r = new Random();
        return r.nextInt(5);
    }

    public void createGames(String[] clubs){
        int i = 0;
        for (String homeTeam: clubs){
            for (String awayTeam: clubs){
                if(Objects.equals(homeTeam, awayTeam)) continue;
                footballGames.add(new Games(i, homeTeam, awayTeam, randomInt(), randomInt(), randomInt(), randomInt()));
                i++;
            }
        }

    }

   public void createResults(){
       // Create {goalsFor=0, lost=1, won=0, team=Bournemouth, drawn=0, goalsAgainst=1, played=1, goalDifference=-1, points=0}
       int won;
       int drawn;
       int points;
       int lost;

       for (Games game: footballGames){
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

   }

    @Override
    public String toString() {
        return "Leagues{" +
                "league='" + league + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}