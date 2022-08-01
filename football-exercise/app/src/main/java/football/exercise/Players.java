package football.exercise;

import java.util.Date;

public class Players {
    public String firstName;
    public String lastName;
    public String position;
    public String teamName;
    public String height;
    public String weight;
    public Date dob;

    public Players(String firstName, String lastName, String position){
        this.firstName = firstName;
        this.lastName =lastName;
        this.position = position;
    }

    public String playerDetails(){
        return this.lastName + this.firstName;
    }
    
}
