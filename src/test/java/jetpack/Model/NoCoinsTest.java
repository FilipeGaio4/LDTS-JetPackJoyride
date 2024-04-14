package jetpack.Model;

import jetpack.Model.Game.NoCoins.NoCoins;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoCoinsTest {

    @Test
    void testNoCoins() {
        int noCoins = 10;
        NoCoins noCoinsInstance = new NoCoins(noCoins);
        assertEquals("10", noCoinsInstance.getAtual());

        noCoins = 5;
        noCoinsInstance = new NoCoins(noCoins);
        assertEquals("5", noCoinsInstance.getAtual());

        noCoins = 100;
        noCoinsInstance = new NoCoins(noCoins);
        assertEquals(3, noCoinsInstance.getSize());

    }
}