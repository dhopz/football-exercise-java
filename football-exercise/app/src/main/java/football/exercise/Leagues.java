package football.exercise;

public class Leagues {

    private String league;
    private String country;

    public Leagues(String league, String country){
        this.league = league;
        this.country = country;
    }
   public void createTable(){
        //Function to create Table as in 38 games, GF,GA, points etc
        //HashMap<String, Integer[0..8]> capitalCities = new HashMap<String, String>();
    }

    @Override
    public String toString() {
        return "Leagues{" +
                "league='" + league + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}