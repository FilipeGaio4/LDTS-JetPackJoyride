package jetpack.Model.Game.NoCoins;

public class NoCoins {

    public String getAtual() {
        return atual;
    }

    private String atual;

    public int getNum() {
        return num;
    }

    private int num;

    public int getSize() {
        return size;
    }

    private int size;
    public NoCoins(int noCoins) {
        atual = String.valueOf(noCoins);
        size = atual.length();
    }
}
