package Images;

public class Square extends Image {
    @Override
    public char getSymbol(int x, int y) {
        int width = getWidth();
        int height = getHeight();

        return x == 0 || x == width - 1 || y == 0 || y == height - 1
                ? '*'
                : ' ';
    }
}
