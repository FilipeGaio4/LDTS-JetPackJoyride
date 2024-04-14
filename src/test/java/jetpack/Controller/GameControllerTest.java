package jetpack.Controller;

import jetpack.Controller.Game.CoinController;
import jetpack.Controller.Game.LazerController;
import jetpack.Controller.Game.PlayerController;
import jetpack.Model.Game.background.Background;
import jetpack.Controller.Game.BackgroundController;
import jetpack.Model.Game.background.BackgroundBuilder;
import jetpack.Model.Game.elements.Coin;
import jetpack.Model.Game.elements.Lazer;
import jetpack.JetpackJoyride;
import jetpack.GUI.GUI;
import jetpack.Model.Game.elements.Player;
import jetpack.States.PauseState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GameControllerTest {
    private BackgroundController backgroundController;
    private Background mockedBackground;
    private Player p;
    private PlayerController playerController;
    private LazerController lazerController;
    private CoinController coinController;
    private BackgroundBuilder backgroundBuilder;

    @BeforeEach
    void setUp() {
        List<Lazer> lazerList = new ArrayList<>();
        Lazer lazer1 = new Lazer(0, 0, 5, 5);
        Lazer lazer2 = new Lazer(3, 3, 7, 7);
        lazerList.add(lazer1);
        lazerList.add(lazer2);

        List<Coin> coinList = new ArrayList<>();
        Coin coin1 = new Coin(2, 3);
        Coin coin2 = new Coin(5, 7);
        coinList.add(coin1);
        coinList.add(coin2);

        mockedBackground = mock(Background.class); // Initialize mockedBackground as a mock

        when(mockedBackground.getPlayer()).thenReturn(Player.getInstance(10, 100));
        when(mockedBackground.getActiveLazers()).thenReturn(lazerList);
        when(mockedBackground.getLazers()).thenReturn(lazerList);
        when(mockedBackground.getActiveCoins()).thenReturn(coinList);
        when(mockedBackground.getCoins()).thenReturn(coinList);
        playerController = new PlayerController(mockedBackground);
        lazerController = new LazerController(mockedBackground);
        coinController = new CoinController(mockedBackground);

        backgroundBuilder = mock(BackgroundBuilder.class);

        when(backgroundBuilder.createBackground("EG")).thenReturn(mockedBackground);

        backgroundController = new BackgroundController(mockedBackground); // Initialize BackgroundController with mockedBackground
    }


    @Test
    void stepActionPauseState() throws IOException {
        JetpackJoyride app = mock(JetpackJoyride.class);
        GUI.ACTION action = GUI.ACTION.p;
        int meters = 100;

        backgroundController.step(app, action, meters);

        verify(app).setState(any(PauseState.class));
    }

    @Test
    void stepActionNotPauseState() throws IOException {
        JetpackJoyride app = mock(JetpackJoyride.class);
        GUI.ACTION action = GUI.ACTION.RIGHT;
        int meters = 100;

        backgroundController.step(app, action, meters);

        verify(app, never()).setState(any(PauseState.class));
    }

    @Test
    void coinCalculateAddsCoinToActiveCoins() throws IOException {
        int meters = 66;

        List<Coin> coins = mockedBackground.getCoins();
        coins.add(new Coin(1, 1)); // Add a coin to the model
        when(mockedBackground.getCoins()).thenReturn(coins);

        backgroundController.step(mock(JetpackJoyride.class), GUI.ACTION.RIGHT, meters);

        List<Coin> activeCoins = mockedBackground.getActiveCoins();
        assertEquals(3, activeCoins.size()); // Expect one coin to be added to activeCoins
    }
    @Test
    void CoinMove() throws IOException {
        List<Coin> coins = mockedBackground.getActiveCoins();
        int eq = coins.get(0).getX();
        int meters = 0;
        backgroundController.step(mock(JetpackJoyride.class), GUI.ACTION.RIGHT, meters);
        assertEquals(eq-1, mockedBackground.getActiveCoins().get(0).getX());
    }

    @Test
    void lazerCalculateAddsLazerToActiveLazers() throws IOException {
        int meters = 20;

        List<Lazer> lazers = mockedBackground.getLazers();
        lazers.add(new Lazer(1,1,2,2)); // Add a lazer to the model
        when(mockedBackground.getLazers()).thenReturn(lazers);

        backgroundController.step(mock(JetpackJoyride.class), GUI.ACTION.RIGHT, meters);

        List<Lazer> activeLazers = mockedBackground.getActiveLazers();
        assertEquals(3, activeLazers.size()); // Expect one lazer to be added to activeLazers
    }
    @Test
    void LaserMove() throws IOException {
        List<Lazer> lazers = mockedBackground.getActiveLazers();
        int eq = lazers.get(0).getX();
        int meters = 0;
        backgroundController.step(mock(JetpackJoyride.class), GUI.ACTION.RIGHT, meters);
        assertEquals(eq-1, mockedBackground.getActiveLazers().get(0).getX());
    }

    @Test
    void testBoost() throws IOException {
        playerController.step(mock(JetpackJoyride.class), GUI.ACTION.BOOST, 100);
        assertTrue(playerController.getModel().getPlayer().isBoost());
    }

    @Test
    void testPlayerMoveUp() {
        assertTrue(playerController.moveUp(10));
        assertEquals(90, playerController.getModel().getPlayer().getY());
    }
    @Test
    void testPlayerMoveDown() {
        assertTrue(playerController.moveDown(4));
        assertEquals(104, playerController.getModel().getPlayer().getY());
    }

    @Test
    void testPlayerDoesntMoveDown() {
        assertFalse(playerController.moveDown(10));
        assertEquals(100, playerController.getModel().getPlayer().getY());
    }
    @Test
    void testPlayerDoesntMoveUp() {
        assertFalse(playerController.moveUp(200));
        assertEquals(100, playerController.getModel().getPlayer().getY());
    }
    @Test
    void CollisionCoin() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //List<Coin> coins = new ArrayList<Coin>();
//        coins.add(coin);
//        mockedBackground.setActiveCoins(coins);
//        when(mockedBackground.getActiveCoins()).thenReturn(coins);
        Coin coin = new Coin(10,100);
        Method method = CoinController.class.getDeclaredMethod("collidesWithPlayer", Coin.class);
        method.setAccessible(true);
        boolean result = (boolean) method.invoke(coinController, coin);
        assertTrue(result);
    }
    @Test
    void CollisionLazerType0() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Lazer lazer = new Lazer(10, 10, 10, 100);
        Method method = LazerController.class.getDeclaredMethod("collidesWithPlayer", Lazer.class);
        method.setAccessible(true);
        boolean result = (boolean) method.invoke(lazerController, lazer);
        assertTrue(result);
    }
    @Test
    void CollisionLazerType1() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Lazer lazer = new Lazer(0, 110, 20, 90);
        Method method = LazerController.class.getDeclaredMethod("collidesWithPlayer", Lazer.class);
        method.setAccessible(true);
        boolean result = (boolean) method.invoke(lazerController, lazer);
        assertTrue(result);
    }
    @Test
    void CollisionLazerType2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Lazer lazer = new Lazer(0, 90, 20, 110);
        Method method = LazerController.class.getDeclaredMethod("collidesWithPlayer", Lazer.class);
        method.setAccessible(true);
        boolean result = (boolean) method.invoke(lazerController, lazer);
        assertTrue(result);
    }
    @Test
    void CollisionLazerType3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Lazer lazer = new Lazer(0, 101, 20, 101);
        Method method = LazerController.class.getDeclaredMethod("collidesWithPlayer", Lazer.class);
        method.setAccessible(true);
        boolean result = (boolean) method.invoke(lazerController, lazer);
        assertTrue(result);
    }
}

