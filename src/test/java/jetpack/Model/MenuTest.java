package jetpack.Model;

import jetpack.Model.Menu.Menu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenuTest {

    @Test
    void testNextChoice() {
        Menu menu = new Menu();

        // Test if initially choice is -1
        assertEquals(-1, menu.getChoice());

        // Test if nextChoice() updates the choice as expected
        menu.nextChoice();
        assertEquals(0, menu.getChoice());

        menu.nextChoice();
        assertEquals(1, menu.getChoice());

        menu.nextChoice();
        assertEquals(2, menu.getChoice());

        // Test if nextChoice() wraps around correctly
        menu.nextChoice();
        assertEquals(0, menu.getChoice());
    }

    @Test
    void testPreviousChoice() {
        Menu menu = new Menu();

        assertEquals(-1, menu.getChoice());

        menu.previousChoice();
        assertEquals(0, menu.getChoice());

        menu.previousChoice();
        assertEquals(2, menu.getChoice());

        menu.previousChoice();
        assertEquals(1, menu.getChoice());

        menu.previousChoice();
        assertEquals(0, menu.getChoice());
    }

    @Test
    void testJetpackJoyride() {
        Menu menu = new Menu();
        assertNotNull(menu.getJetpackJoyride());
    }

    @Test
    void testGetEntry() {
        Menu menu = new Menu();


        assertNotNull(menu.getEntry(0));
        assertNotNull(menu.getEntry(1));
        assertNotNull(menu.getEntry(2));
    }

    @Test
    void testNumberEntries() {
        Menu menu = new Menu();
        assertEquals(3, menu.getNumberEntries());
    }

    @Test
    void testIsSelected() {
        Menu menu = new Menu();

        assertFalse(menu.isSelectedStart());
        assertFalse(menu.isSelectedExit());
        assertFalse(menu.isSelected(2));

        menu.nextChoice();
        assertTrue(menu.isSelected(0));
        assertTrue(menu.isSelectedStart());
    }
}