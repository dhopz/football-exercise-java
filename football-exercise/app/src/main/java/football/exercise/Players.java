package football.exercise;

public class Players {
    public String firstName;
    public String lastName;
    public String position;
    public String teamName;

    public Players(String firstName, String lastName, String position){
        this.firstName = firstName;
        this.lastName =lastName;
        this.position = position;
    }

    public String playerDetails(){
        return this.lastName + this.firstName;
    }
    
}
