/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package football.exercise;

import java.util.ArrayList;
import java.util.HashMap;


public class App {
    public static ArrayList<Leagues> footballLeagues = new ArrayList<Leagues>();
    public static ArrayList<Games> footballGames = new ArrayList<Games>();
    public static ArrayList<Teams> footballTeams = new ArrayList<Teams>();
    public static ArrayList<Stats> footballStats = new ArrayList<Stats>();

    public static void main(String[] args) {
        // Games game = new Games(1, "Chelsea", "Aresnal", "Stamford Bridge", 2, 1, 0, 3);
        // game.getMatchStatitics();

        // createGames();

        Playlists playlist = new Playlists("");

        
    }

    public static void getTableResultsForLeague(String league){
        // create Table of Results given the league parameter
    }

    public static void getMatchStatistics(String homeTeam, String awayTeam){
        // given 2 parameters, get the statistics for the game
    }

    public static ArrayList<Leagues> createLeagues(){
        // Create a League
        Leagues league = new Leagues("English Premiership", "England");
        Leagues league2 = new Leagues("SkyBet Championship", "England");

        footballLeagues.add(league);
        footballLeagues.add(league2);

        return footballLeagues;
    }

    public static void createGames(){
        String[] clubs = {
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

        System.out.println(clubs.length);

        for (String club: clubs){
            Integer i = 0;
            if(club == clubs[i]) continue;

            System.out.println(club);
            System.out.println(clubs[i]);
            i++;
            }
            
        


        Games game = new Games(1, "Chelsea", "Arsenal", "Stamford Bridge", 2, 1, 0, 3);
        Games game2 = new Games(2, "Liverpool", "Everton", "Anfield", 3, 2, 0, 1);
        Games game3 = new Games(2, "Chelsea", "Everton", "Stamford  Bridge", 4, 2, 0, 1);
        Games game4 = new Games(2, "Liverpool", "Chelsea", "Anfield", 0, 2, 0, 1);


        footballGames.add(game);
        footballGames.add(game2);
        footballGames.add(game3);
        footballGames.add(game4);

        ArrayList<HashMap<String, String>> gameResults = new ArrayList<HashMap<String, String>>();

        String teamToLocate = "Chelsea";

        for (Games footballGame: footballGames){
            if(footballGame.homeTeam==teamToLocate||footballGame.awayTeam==teamToLocate){
                gameResults.add(footballGame.getMatchResults());
            }            
        }

        System.out.println(gameResults);        
        System.out.printf("Amount of Games in Array %d \n",gameResults.size());

        // return footballGames;        
    }

    public static ArrayList<Teams> createTeams(){
        Teams team = new Teams("CHE","Chelsea");
        Teams teama = new Teams("ARS","Arsenal");
        Teams teamb = new Teams("LIV","Liverpool");
        Teams teamc = new Teams("EVE","Everton");

        footballTeams.add(team);
        footballTeams.add(teama);
        footballTeams.add(teamb);
        footballTeams.add(teamc);

        return footballTeams;

    }

    public static ArrayList<Stats> createStats(){
        Stats stat = new Stats(1, 2, 1, 0, 3);
        Stats stata = new Stats(2, 2, 1, 0, 3);

        footballStats.add(stat);
        footballStats.add(stata);
        
        return footballStats;

    }

  }



