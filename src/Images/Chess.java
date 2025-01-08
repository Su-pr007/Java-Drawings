package Images;

public class Chess extends Image {
    public int getHeight() {
        return 10;
    }

    public char getSymbol(int x, int y) {
        return (x + (y % 2)) % 2 == 0
                ? '-'
                : '=';
    }
}
