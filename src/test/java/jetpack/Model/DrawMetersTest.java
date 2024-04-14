package jetpack.Model;

import jetpack.Model.Game.DrawMeters.DrawMeters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawMetersTest {

    @Test
    void testDrawMeters() {

        int meters = 100;
        DrawMeters drawMeters = new DrawMeters(meters);
        assertEquals("5", drawMeters.getAtual());

        meters = 60;
        drawMeters = new DrawMeters(meters);
        assertEquals("3", drawMeters.getAtual());

        meters = 80;
        drawMeters = new DrawMeters(meters);
        assertEquals(1, drawMeters.getSize());

    }
}