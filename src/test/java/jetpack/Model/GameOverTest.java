package jetpack.Model;

import jetpack.Model.GameOver.GameOver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GameOverTest {

    @Test
    void testGetters() {
        GameOver gameOver = new GameOver("TestUser", 200, 10);

        assertEquals("TestUser", gameOver.getUsername());
        assertNotNull(gameOver.getMetersString());
        assertNotNull(gameOver.getMeters_());
        assertNotNull(gameOver.getMetersToShow());
        assertTrue(gameOver.getMetersToShow().isEmpty());

        assertNotNull(gameOver.getCoinsString());
        assertNotNull(gameOver.getCoinsCollectedToShow());
        assertTrue(gameOver.getCoinsCollectedToShow().isEmpty());
        assertEquals("10", gameOver.getCollectedCoins());

        assertNotNull(gameOver.getGameOver());
        assertNotNull(gameOver.getEntries());
        assertFalse(gameOver.getEntries().isEmpty());

        assertNotNull(gameOver.getTotalString());
        assertNotNull(gameOver.getTotalToShow());
        assertTrue(gameOver.getTotalToShow().isEmpty());
        assertEquals("110", gameOver.getTotal());

        assertNotNull(gameOver.getDigits());
        assertFalse(gameOver.getDigits().isEmpty());
    }

    @Test
    void testChoiceNavigation() {
        GameOver gameOver = new GameOver("TestUser", 200, 10);

        assertEquals(0, gameOver.getChoice());
        assertTrue(gameOver.isSelected(0));
        assertFalse(gameOver.isSelected(1));

        gameOver.nextChoice();
        assertEquals(1, gameOver.getChoice());
        assertFalse(gameOver.isSelected(0));
        assertTrue(gameOver.isSelected(1));

        gameOver.previousChoice();
        assertEquals(0, gameOver.getChoice());
        assertTrue(gameOver.isSelected(0));
        assertFalse(gameOver.isSelected(1));
    }

    @Test
    void testGetEntry() {
        GameOver gameOver = new GameOver("TestUser", 200, 10);

        assertEquals(" ____  ____  ___  ____   __    ____  ____ \n" +
                "(  _ \\( ___)/ __)(_  _) /__\\  (  _ \\(_  _)\n" +
                " )   / )__) \\__ \\  )(  /(__)\\  )   /  )(  \n" +
                "(_)\\_)(____)(___/ (__)(__)(__)(_)\\_) (__) \n" +
                "\n", gameOver.getEntry(0));

        assertEquals(" _____  __  __  ____  ____ \n" +
                "(  _  )(  )(  )(_  _)(_  _)\n" +
                " )(_)(  )(__)(  _)(_   )(  \n" +
                "(___/\\\\(______)(____) (__) \n" +
                "\n", gameOver.getEntry(1));
    }

    @Test
    void testGetNumberEntries() {
        GameOver gameOver = new GameOver("TestUser", 200, 10);
        assertEquals(2, gameOver.getNumberEntries());
    }
}