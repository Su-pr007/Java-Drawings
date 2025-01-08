package Images;

public class Rhombus extends Image {
    public char getSymbol(int x, int y) {
        int width = getWidth();
        int height = getHeight();

        int radius = (width / 2) - 1;
        int centerX = width / 2;
        int centerY = height / 2;

        int length = Math.abs(x - centerX) + Math.abs(y - centerY);

        return length == radius ? '=' : '0';
    }
}
