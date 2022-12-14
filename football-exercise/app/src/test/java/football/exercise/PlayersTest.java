package football.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayersTest {
    @Test
    public void createNewPlayer() {
        Player player = new Player("Charlotte", "Henry", "Forward", "Chelsea");
        assertEquals("Charlotte Henry", player.playerDetails());
        assertEquals("Forward",player.getPosition());
        assertEquals("Chelsea",player.getClub());
    }
    @Test
    public void createNewPlayer_ChangeClubAndPositions() {
        Player player = new Player("Charlotte", "Henry", "Forward", "Chelsea");
        player.setClub("Arsenal");
        player.setPosition("Midfield");
        assertEquals("Charlotte Henry", player.playerDetails());
        assertEquals("Midfield",player.getPosition());
        assertEquals("Arsenal",player.getClub());
    }

//    @Test
//    public void GivenATeam_CreateAPlayer_WhenGivenAListOfPlayers() {
//        String[] newPlayer = new String[]{"Thiago Silva", "Defender", "Chelsea"};
//        Player player = new Player(newPlayer);
//        assertEquals("Thiago Silva", player.playerDetails());
//
//    }
}
