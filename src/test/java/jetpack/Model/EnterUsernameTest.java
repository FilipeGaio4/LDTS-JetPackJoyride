package jetpack.Model;

import jetpack.Model.EnterUsername.EnterUsername;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EnterUsernameTest {

    @Test
    void testGetEnterUsername() {
        EnterUsername enterUsername = new EnterUsername();
        assertNotNull(enterUsername.getEnterUsername());
    }

    @Test
    void testGetAlphabet() {
        EnterUsername enterUsername = new EnterUsername();
        assertNotNull(enterUsername.getAlphabet());
        assertFalse(enterUsername.getAlphabet().isEmpty());
    }

    @Test
    void testGetInsertIntoScreen() {
        EnterUsername enterUsername = new EnterUsername();
        assertNotNull(enterUsername.getInsertIntoScreen());
        assertTrue(enterUsername.getInsertIntoScreen().isEmpty());

        enterUsername.setInsertIntoScreen(List.of("Sample1", "Sample2"));
        assertEquals(List.of("Sample1", "Sample2"), enterUsername.getInsertIntoScreen());
    }

    @Test
    void testGetInsertedUsername() {
        EnterUsername enterUsername = new EnterUsername();
        assertNotNull(enterUsername.getInsertedUsername());
        assertTrue(enterUsername.getInsertedUsername().isEmpty());

        enterUsername.setInsertedUsername(List.of('a', 'b', 'c'));
        assertEquals(List.of('a', 'b', 'c'), enterUsername.getInsertedUsername());
    }

    @Test
    void testGettersAndSetters() {
        EnterUsername enterUsername = new EnterUsername();

        assertNotNull(enterUsername.getEnterUsername());

        assertNotNull(enterUsername.getAlphabet());
        assertFalse(enterUsername.getAlphabet().isEmpty());

        enterUsername.setInsertIntoScreen(List.of("Test1", "Test2"));
        assertEquals(List.of("Test1", "Test2"), enterUsername.getInsertIntoScreen());

        enterUsername.setInsertedUsername(List.of('x', 'y', 'z'));
        assertEquals(List.of('x', 'y', 'z'), enterUsername.getInsertedUsername());
    }
}