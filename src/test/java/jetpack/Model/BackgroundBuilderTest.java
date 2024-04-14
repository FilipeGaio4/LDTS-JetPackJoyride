package jetpack.Model;

import jetpack.Model.Game.background.Background;
import jetpack.Model.Game.background.BackgroundBuilder;
import jetpack.Model.Game.elements.Coin;
import jetpack.Model.Game.elements.Lazer;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackgroundBuilderTest {

    @Test
    void testCreateBackground() {
        BackgroundBuilder backgroundBuilder = new BackgroundBuilder();

        String username = "TestUser";
        Background background = backgroundBuilder.createBackground(username);
        assertEquals(username, background.getUsername());

        int meters = 50;
        int coins = 10;
        background = backgroundBuilder.createBackground(username, meters, coins);
        assertEquals(username, background.getUsername());

        List<Lazer> lazers = background.getLazers();
        List<Coin> coinsList = background.getCoins();

        assertEquals(10, lazers.size());
        assertEquals(10, coinsList.size());

    }

}