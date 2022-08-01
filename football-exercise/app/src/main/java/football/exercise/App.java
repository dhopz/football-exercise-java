/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package football.exercise;

import java.io.InputStream;
import java.io.InputStreamReader;
// import java.io.FileReader;
// import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

// import java.time.LocalDate;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // getTableResultsForLeague(league);
        // getMatchStatitics(homeTeam, awayTeam);
        
        getAllLeagues();
        // getSomeLeagues();
    }

    static void getTableResultsForLeague(String league){
        // create Table of Results given the league parameter
    }

    static void getMatchStatitics(String homeTeam, String awayTeam){
        // given 2 parameters, get the statistics for the game
    }

    public static void getAllLeagues(){
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("/Users/davidhoupapa/Code/football-exercise/app/src/main/java/football/exercise/data/leagues.json"));
        
            // convert JSON array to list of leagues
            List<Leagues> leagueList = new Gson().fromJson(reader, new TypeToken<List<Leagues>>() {}.getType());    
            System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(leagueList));        
            leagueList.forEach(System.out::println);       
            reader.close();
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void getSomeLeagues(){
        
    }

  }



