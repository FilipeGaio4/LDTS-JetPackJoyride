package jetpack.Model.Game.DrawMeters;

import com.googlecode.lanterna.graphics.TextGraphics;

public class DrawMeters {

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
    public DrawMeters(int meters) {
        num = meters / 20;
        atual = ("" + num);
        size = atual.length();
    }
}
