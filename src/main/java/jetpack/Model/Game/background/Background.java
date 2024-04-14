package jetpack.Model.Game.background;

import jetpack.Model.Game.elements.Coin;
import jetpack.Model.Game.elements.Lazer;
import jetpack.Model.Game.elements.Player;

import java.util.List;

public class Background {
    private List<Lazer> lazers;
    private List<Lazer> activeLazers;
    private List<Coin> activeCoins;
    private List<Coin> coins;
    private int collectedCoins = 0;

    private String username;
    private Player player;

    private int width,height;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCollectedCoins() {
        return collectedCoins;
    }

    public void setCollectedCoins(int collectedCoins) {
        this.collectedCoins = collectedCoins;
    }


    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }


    public List<Coin> getActiveCoins() {
        return activeCoins;
    }

    public void setActiveCoins(List<Coin> activeCoins) {
        this.activeCoins = activeCoins;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public List<Lazer> getLazers() {
        return lazers;
    }
    public List<Lazer> getActiveLazers() {
        return activeLazers;
    }

    public void setLazers(List<Lazer> lazers) {
        this.lazers = lazers;
    }
    public void setActiveLazers(List<Lazer> lazers) {
        this.activeLazers = lazers;
    }

    public Background(int width, int height)
    {
        this.width=width;
        this.height=height;
    }

}
