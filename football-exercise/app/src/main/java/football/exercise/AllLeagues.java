package football.exercise;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class AllLeagues {
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
}
