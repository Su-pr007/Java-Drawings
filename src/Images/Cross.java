package Images;

public class Cross extends Image {
    public int getWidth() {
        return 15;
    }

    public int getHeight() {
        return 15;
    }

    @Override
    public char getSymbol(int x, int y) {
        int width = getWidth();

        return x == y || y == (width - 1) - x ? '0' : '-';
    }
}
