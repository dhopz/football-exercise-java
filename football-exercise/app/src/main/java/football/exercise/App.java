/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package football.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class App {
    public static ArrayList<Leagues> footballLeagues = new ArrayList<Leagues>();
    public static ArrayList<Games> footballGames = new ArrayList<Games>();
    public static ArrayList<Results> footballResults = new ArrayList<Results>();
    public static String[] clubs = {
        "Bournemouth",
        "Arsenal",
        "Aston Villa",
        "Brentford",
        "Brighton",
        "Chelsea",
        "Crystal Palace", 
        "Everton",
        "Fulham",
        "Leeds", 
        "Leicester City", 
        "Liverpool", 
        "Man City", 
        "Man United",
        "Newcastle",
        "Nottingham Forest", 
        "Southampton",
        "Tottenham",
        "West Ham", 
        "Wolves"
    };      

    public static void main(String[] args) {  
        createGames(clubs); 
        createResults(footballGames);

        for (Results result: footballResults){
            System.out.println(result.resultEntry());
        }
        System.out.println(footballResults.size());

        
    }

    public static Integer randomInt(){
        Random r = new Random();     
        return r.nextInt(5);    
      }

    public static ArrayList<Leagues> createLeagues(){
        // Create a League
        Leagues league = new Leagues("English Premiership", "England");
        Leagues league2 = new Leagues("SkyBet Championship", "England");

        footballLeagues.add(league);
        footballLeagues.add(league2);

        return footballLeagues;
    }

    public static void createGames(String[] clubs){
        
        for (String homeTeam: clubs){

            for (String awayTeam: clubs){
                Integer i = 0;
                if(homeTeam == awayTeam) continue;
                footballGames.add(new Games(i, homeTeam, awayTeam, randomInt(), randomInt(), randomInt(), randomInt()));
                i++;
                }

            }
    }

  
    
    public static void createResults(ArrayList<Games> footballGames){
          // take in footballgames ArrayList and create table
        // {awayTeam=Chelsea, homeTeam=Wolves, homeGoals=4, yellowCards=0, awayGoals=1, redCards=3}

        Integer won, drawn, points, lost;

        for (Games game:footballGames){
            // System.out.println(game.getMatchResults());
            if(game.stats.homeGoals > game.stats.awayGoals){
                won = 1;
                drawn = 0;
                lost = 0;
                points = 3;
            } else if(game.stats.homeGoals < game.stats.awayGoals){
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

            footballResults.add(new Results(game.homeTeam, 1, won, drawn, lost, game.stats.homeGoals, game.stats.awayGoals, game.stats.homeGoals - game.stats.awayGoals, points));
        }

        

        // Results result = new Results(team, played, won, drawn, lost, goalsFor, goalsAgainst, goalDifference, points)
        System.out.println("Amount of results :"  + footballResults.size());
        

    }



  }



