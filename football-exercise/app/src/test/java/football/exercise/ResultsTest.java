package football.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ResultsTest {

    @Test
    public void GivenARandomGameResult_WhenThatThereAreNoEntries_ThenReturnAGoalInteger() {
        Results result = new Results("Chelsea",1,1,0,0,1,0,0,3);
        assertTrue(result.getGoalsFor() >= 1);
        assertEquals(Integer.valueOf(3),result.getPoints());
        assertEquals(Integer.valueOf(1),result.getPlayed());
        assertEquals(Integer.valueOf(0), result.getGoalDifference());
        assertEquals(Integer.valueOf(1),result.getWon());
        assertEquals(Integer.valueOf(0),result.getDrawn());
        assertEquals(Integer.valueOf(0),result.getLost());
        assertEquals(Integer.valueOf(0),result.getGoalsAgainst());
    }


}
