package jetpack.Model;

//Classe criada para facilitar os atributos de todos os elementos que precisem de guardar a sua posição
public class Position {
    private int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Position(Position position){
        this.x = position.x;
        this.y = position.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(Position position) {
        x = position.x;
        y = position.y;
    }
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Verifica se tem a mesma posição (Necessta ser melhor implementada e testada)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() == o.getClass()) return false;
        Position p = (Position) o;
        return x == p.getX() && y == p.getY();
    }
}
