package football.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatsTest {
    /**
     * 
     */
    @Test public void settingUpGoals(){
        Stats stat = new Stats();
        assertEquals(Integer.valueOf(0), stat.getGoals());
        // assertEquals(Integer.valueOf(0), stat.goals);
        assertEquals(Integer.valueOf(0), stat.redCards);
        assertEquals(Integer.valueOf(0), stat.yellowCards);

    }
}
