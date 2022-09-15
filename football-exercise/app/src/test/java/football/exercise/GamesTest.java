package football.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GamesTest {
    @Test
    public void toStringGameDataCreateNewGameReturnString(){
        Games game = new Games(1,"Home Team","Away Team",1,2,1,1);
        assertEquals("Games{id=1, homeTeam='Home Team', awayTeam='Away Team'}",game.toString());
    }
}
