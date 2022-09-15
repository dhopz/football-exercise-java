package football.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class LeagueTest {
    private boolean areEqual(Map<String, String> first, Map<String, String> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> e.getValue().equals(second.get(e.getKey())));
    }
    @Test
    public void toStringLeagueNameStringCountryStringNewLeagueCreatedReturnString(){
        Leagues league = new Leagues("New League","New Country");
        assertEquals("Leagues{league='New League', country='New Country'}", league.toString());
    }
    @Test
    public void createGamesInputClubsArrayReturnListOfGames(){
        Leagues league = new Leagues("New League","New Country");
        String[] clubs = new String[]{"Bournemouth","Arsenal"};
        league.createGames(clubs);

        List<Games> footballGames = new ArrayList<>();
        Games game = new Games(0,"Bournemouth","Arsenal",1,1,1,1);
        Games game1 = new Games(1,"Arsenal","Bournemouth",1,2,1,1);
        footballGames.add(game);
        footballGames.add(game1);


        assertArrayEquals(league.getFootballGames().toArray(),footballGames.toArray());

//        assertNotEquals(footballGames, league.getFootballGames());
    }

}
