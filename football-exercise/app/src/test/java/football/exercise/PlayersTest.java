package football.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayersTest {
    @Test
    public void createNewPlayer() {
        Player player = new Player("Charlotte", "Henry", "Striker", "Chelsea");
        assertEquals("Charlotte Henry", player.playerDetails());
    }

//    @Test
//    public void GivenATeam_CreateAPlayer_WhenGivenAListOfPlayers() {
//        String[] newPlayer = new String[]{"Thiago Silva", "Defender", "Chelsea"};
//        Player player = new Player(newPlayer);
//        assertEquals("Thiago Silva", player.playerDetails());
//
//    }
}
