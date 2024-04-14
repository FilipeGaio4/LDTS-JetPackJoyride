package jetpack.GUI;

import com.googlecode.lanterna.TextColor;
import jetpack.Model.Position;

import java.io.IOException;
import java.util.ArrayList;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawBackground(int meters);

    void changeBackgroundColor(int metros);
    void linesdraw(int meters);

    void drawPlayer(Position position, boolean boost, ArrayList<Position> body);

    void drawCoins(Position position);

    void drawLazer(Position position, Position end, int type);

    void drawText(Position position, String text, TextColor.ANSI Fcolor, TextColor.ANSI Bcolor);

    void drawTextfromCSV(Position position, String file, TextColor.ANSI color);
    void drawNum(char num, int pos);
    void drawNum(String num, Position pos);
    void drawLine(Position p1, Position p2);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    void drawNumCoin(char c, int i);

    void drawBorders();

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT, BOOST, DELETE, UNDERSCORE, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, ZERO}
}
