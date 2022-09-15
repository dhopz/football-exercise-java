package football.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayersTest {
    @Test public void createNewPlayer(){
        Players player = new Players("Charlotte", "Henry", "Striker");
        assertEquals("HenryCharlotte", player.playerDetails());
    }
    
}
