package football.exercise;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class DeserializationExample {
    public static void main(final String[] args) {
    
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("/Users/davidhoupapa/Code/football-exercise/app/src/main/java/football/exercise/data/users.json"));
        
            // convert JSON array to list of users
            List<User> users = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());

            // System.out.print(users);
            System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(users));
        
            // print users
            users.forEach(System.out::println);
        
            // close reader
            reader.close();
        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
      }

}
