/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package football.exercise;

import java.util.*;


public class App {
    private static final List<Leagues> footballLeagues = new ArrayList<>();
    private static final List<Games> footballGames = new ArrayList<>();
    private static final List<Results> footballResults = new ArrayList<>();
    private static final List<Table> footballTable = new ArrayList<>();
    private static final String[] clubs = {
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
        "Nottingham",
        "Southampton",
        "Tottenham",
        "West Ham", 
        "Wolves"
    };      

    public static void main(String[] args) {  
        createGames(clubs); 
        createResults(footballGames);
        generateTable();       

        footballTable.sort(new FootballTableSortingComparator());
        
        Collections.reverse(footballTable);

        Integer i = 1;
        for (Table table: footballTable){
            System.out.println(i + table.toString());
            i++;
        }

        for (Games games: footballGames){
                 if(Objects.equals(games.getHomeTeam(), footballTable.get(0).getTeam()) || Objects.equals(games.getAwayTeam(), footballTable.get(0).getTeam())){
                     System.out.println(games.getMatchResults());
                 }
             }
    }
    
    public static Integer randomInt(){
        Random r = new Random();     
        return r.nextInt(5);    
      }

    public static List<Leagues> createLeagues(){
        // Create a League
        Leagues league = new Leagues("English Premiership", "England");
        Leagues league2 = new Leagues("SkyBet Championship", "England");

        footballLeagues.add(league);
        footballLeagues.add(league2);

        return footballLeagues;
    }


    public static void createGames(String[] clubs){
        // Create {awayTeam=Arsenal, homeTeam=Bournemouth, homeGoals=1, yellowCards=0, awayGoals=2, redCards=1}
        int i = 0;
        for (String homeTeam: clubs){
            for (String awayTeam: clubs){
                if(Objects.equals(homeTeam, awayTeam)) continue;
                footballGames.add(new Games(i, homeTeam, awayTeam, randomInt(), randomInt(), randomInt(), randomInt()));
                i++;
            }

            }
    }


    public static void createResults(List<Games> footballGames){
        // Create {goalsFor=0, lost=1, won=0, team=Bournemouth, drawn=0, goalsAgainst=1, played=1, goalDifference=-1, points=0}
        int won;
        int drawn;
        int points;
        int lost;

        for (Games game:footballGames){
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

    public static void generateTable(){

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

  }



