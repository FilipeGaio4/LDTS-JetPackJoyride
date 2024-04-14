package jetpack.Model;

import jetpack.Model.Instructions.Instructions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InstructionsTest {

    @Test
    void testGetTime() {
        Instructions instructions = new Instructions();
        assertEquals(0, instructions.getTime());
    }

    @Test
    void testGetTicks() {
        Instructions instructions = new Instructions();
        assertEquals(0, instructions.getTicks());
    }

    @Test
    void testIncreaseTicks() {
        Instructions instructions = new Instructions();
        assertEquals(0, instructions.getTicks());

        for (int i = 1; i <= 101; i++) {
            instructions.increaseTicks();
            assertEquals(i % 100, instructions.getTicks()%100);
        }
    }

    @Test
    void testGetMaxIndex() {
        Instructions instructions = new Instructions();
        assertEquals(100, instructions.getMaxIndex());
    }

    @Test
    void testGetIndex() {
        Instructions instructions = new Instructions();
        assertEquals(0, instructions.getIndex());
    }

    @Test
    void testSetIndex() {
        Instructions instructions = new Instructions();
        instructions.setIndex(10);
        assertEquals(10, instructions.getIndex());
    }

    @Test
    void testDownIndex() {
        Instructions instructions = new Instructions();
        instructions.setIndex(10);
        instructions.downIndex();
        assertEquals(9, instructions.getIndex());
    }

    @Test
    void testUpIndex() {
        Instructions instructions = new Instructions();
        instructions.setIndex(10);
        instructions.upIndex();
        assertEquals(11, instructions.getIndex());
    }
    @Test
    void testGetInstructionsTitle() {
        Instructions instructions = new Instructions();
        assertNotNull(instructions.getInstructionsTitle());
    }

    @Test
    void testGetScoreTitle() {
        Instructions instructions = new Instructions();
        assertNotNull(instructions.getScoreTitle());
    }

    @Test
    void testGetDevTitle() {
        Instructions instructions = new Instructions();
        assertNotNull(instructions.getDevTitle());
    }
}