package jetpack;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import jetpack.Model.Game.background.Background;
import jetpack.Model.Game.elements.Lazer;
import jetpack.Model.Game.elements.Player;
import jetpack.Model.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests {
    /*
    private Player player;
    private Background background;
    private Lazer lazer;
    private List<Lazer> lazers;
    private List<Lazer> activeLazer;
    private Position position;
    @BeforeEach
    void setUp() {
        background = new Background(200, 117);
        player = background.getPlayer(); //(x = 10, y = 105)
        lazers = background.getLazers();
        lazers = background.getActiveLazers();
    }

    @Test
    void movePlayerUpOneUnit() {
        player.moveUp(1);
        assertEquals(104,  player.getY());
    }
    @Test
    void movePlayerUpTwoUnits() {
        player.moveUp(2);
        assertEquals(103,  player.getY());
    }

    @Test
    void movePlayerDownOneUnit() {
        player.setPosition(10, 50);
        player.moveDown(1);
        assertEquals(51,  player.getY());
    }
    @Test
    void movePlayerDownTwoUnits() {
        player.setPosition(10, 50);
        player.moveDown(2);
        assertEquals(52,  player.getY());
    }

    @Test
    void PlayerCannotMoveUp() {
        player.setPosition(10, 3);
        player.moveUp(1);
        assertEquals(3,  player.getY());
    }

    @Test
    void PlayerCannotMoveDown() {
        player.setPosition(10, 104);
        player.moveDown(1);
        assertEquals(104,  player.getY());
    }

    @Test
    void PlayerCollideLaser() {
        Lazer l = new Lazer(10,10,20,20);
        player.setPosition(10, 10);
        assertEquals(true,  l.collidesWithPlayer(player));
    }
    @Test
    void PlayerDoesntCollideLaser() {
        Lazer l = new Lazer(10,10,20,20);
        player.setPosition(10, 7); // Tolerance is 3
        assertEquals(false,  l.collidesWithPlayer(player));
    }

    @Test
    void LaserMoves() {
        Lazer l = new Lazer(10,10,20,20);
        l.move();
        assertEquals(9,  l.getX());
    }

     */
}

