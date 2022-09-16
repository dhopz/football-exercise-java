//package football.exercise;
//
//import java.util.ArrayList;
//
//public class Datasetup {
//    public ArrayList<Leagues> footballLeagues = new ArrayList<>();
//    public ArrayList<Games> footballGames = new ArrayList<>();
//    public ArrayList<Teams> footballTeams = new ArrayList<>();
//    public ArrayList<Stats> footballStats = new ArrayList<>();
//
//    public ArrayList<Leagues> createLeagues(){
//        // Create a League
//        Leagues league = new Leagues("English Premiership", "England");
//        Leagues league2 = new Leagues("SkyBet Championship", "England");
//
//        footballLeagues.add(league);
//        footballLeagues.add(league2);
//
//        return footballLeagues;
//    }
//
//    public ArrayList<Games> createGames(){
//        Games game = new Games(1, "Chelsea","Aresnal", 2, 1, 0, 3);
//        Games game2 = new Games(2, "Liverpool", "Everton",  3, 2, 0, 1);
//        // Games game3 = new Games()
//
//        footballGames.add(game);
//        footballGames.add(game2);
//
//        return footballGames;
//    }
//
//    public ArrayList<Teams> createTeams(){
//        Teams team = new Teams("CHE","Chelsea");
//        Teams teama = new Teams("ARS","Aresnal");
//        Teams teamb = new Teams("LIV","Liverpool");
//        Teams teamc = new Teams("EVE","Everton");
//
//        footballTeams.add(team);
//        footballTeams.add(teama);
//        footballTeams.add(teamb);
//        footballTeams.add(teamc);
//
//        return footballTeams;
//
//    }
//
//    public ArrayList<Stats> createStats(){
//        Stats stat = new Stats(1, 2, 1, 0, 3);
//        Stats stata = new Stats(2, 2, 1, 0, 3);
//
//        footballStats.add(stat);
//        footballStats.add(stata);
//
//        return footballStats;
//
//    }
//
//}
