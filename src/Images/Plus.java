package Images;

public class Plus extends Image {
    public int getWidth() {
        return 50;
    }

    public int getHeight() {
        return 14;
    }

    @Override
    public char getSymbol(int x, int y) {
        int width = getWidth();
        int height = getHeight();

        return (x == (width / 2)) || (y == (height / 2))
                ? '0'
                : '-';
    }
}
