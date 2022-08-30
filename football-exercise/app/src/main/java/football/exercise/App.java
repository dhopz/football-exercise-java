/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package football.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class App {
    public static ArrayList<Leagues> footballLeagues = new ArrayList<Leagues>();
    public static ArrayList<Games> footballGames = new ArrayList<Games>();
    public static ArrayList<Results> footballResults = new ArrayList<Results>();
    public static ArrayList<Table> footballTable = new ArrayList<Table>();
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
        generateTable();       

        Collections.sort(footballTable,new FootballTableSortingComparator());
        
        Collections.reverse(footballTable);

        Integer i = 1;
        for (Table table: footballTable){
            System.out.println(i + table.toString());
            i++;
        }  
        
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

        Integer won, drawn, points, lost;

        for (Games game:footballGames){
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
            footballResults.add(new Results(game.awayTeam, 1, won, drawn, lost, game.stats.awayGoals, game.stats.homeGoals, game.stats.awayGoals - game.stats.homeGoals, points));
            
        }        

    }

    public static void generateTable(){

        for (String club:clubs){

            Integer played = 0;
            Integer won = 0;
            Integer drawn= 0;
            Integer lost= 0;
            Integer goalsFor= 0;
            Integer goalsAgainst= 0;
            Integer goalDifference= 0;
            Integer points= 0;

            for (Results result: footballResults){            

                if(result.getTeam()==club){
                    points = points + result.getPoints();
                    played = played + result.getPlayed();
                    won = won + result.getWon();
                    drawn= drawn + result.getDrawn();
                    lost= lost + result.getLost();
                    goalsFor= goalsFor + result.getGoalsFor();
                    goalsAgainst= goalsAgainst + result.getGoalsAgainst();
                    goalDifference= goalDifference + result.getGoalDifference();          
                }                              
            }
            footballTable.add(new Table(club, played, won, drawn, lost, goalsFor, goalsAgainst, goalDifference, points));
        }
    }

  }



