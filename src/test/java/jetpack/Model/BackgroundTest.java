package jetpack.Model;

import jetpack.Model.Game.background.Background;
import jetpack.Model.Game.elements.Coin;
import jetpack.Model.Game.elements.Player;
import jetpack.Model.Game.elements.Lazer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

public class BackgroundTest {

    private Background background;

    @BeforeEach
    void setUp() {
        int width = 100;
        int height = 50;
        background = new Background(width, height);
    }

    @Test
    void testUsername() {
        background.setUsername("TestUser");
        assertEquals("TestUser", background.getUsername());
    }

    @Test
    void testCollectedCoins() {
        background.setCollectedCoins(10);
        assertEquals(10, background.getCollectedCoins());
    }

    @Test
    void testCoins() {
        List<Coin> coins = new ArrayList<>();
        coins.add(new Coin(10, 20));
        background.setCoins(coins);
        assertEquals(coins, background.getCoins());
    }

    @Test
    void testPlayer() {
        Player player = Player.getInstance(10,100);
        background.setPlayer(player);
        assertEquals(player, background.getPlayer());
    }

    @Test
    void testLazers() {
        List<Lazer> lazers = new ArrayList<>();
        lazers.add(new Lazer(5, 10, 15, 20));
        background.setLazers(lazers);
        assertEquals(lazers, background.getLazers());
    }

    @Test
    void testActiveLazersInitiallyNull() {
        assertNull(background.getActiveLazers());
    }
}