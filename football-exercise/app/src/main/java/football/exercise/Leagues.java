package football.exercise;

public class Leagues {

    private String league;
    private String country;

    public Leagues(String league, String country){
        this.league = league;
        this.country = country;
    }
    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void createTable(){
        //Function to create Table as in 38 games, GF,GA, points etc
        //HashMap<String, Integer[0..8]> capitalCities = new HashMap<String, String>();
    }
    
}