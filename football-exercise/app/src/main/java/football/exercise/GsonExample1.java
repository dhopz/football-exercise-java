package football.exercise;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class GsonExample1 {
    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("/Users/davidhoupapa/Code/football-exercise/app/src/main/java/football/exercise/data/staff.json")) {

            // Convert JSON File to Java Object
            Staff staff = gson.fromJson(reader, Staff.class);
			
			// print staff
            System.out.println(staff.skills);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
