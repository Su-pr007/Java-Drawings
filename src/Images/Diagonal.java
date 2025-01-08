package Images;

public class Diagonal extends Image {
    public int getHeight() {
        return 10;
    }

    public int getWidth() {
        return 10;
    }

    public char getSymbol(int x, int y) {
        return x > (y - 1)  ? '1' : '0';
    }
}
