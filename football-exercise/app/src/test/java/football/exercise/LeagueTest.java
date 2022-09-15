package football.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeagueTest {
    @Test
    public void toStringLeagueNameStringCountryStringNewLeagueCreatedReturnString(){
        Leagues league = new Leagues("New League","New Country");
        assertEquals("Leagues{league='New League', country='New Country'}", league.toString());
    }

}
