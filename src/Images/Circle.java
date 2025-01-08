package Images;

public class Circle extends Image {
    public int getWidth() {
        return 40;
    }

    public char getSymbol(int x, int y) {
        int radius = (getWidth() / 4) - 1;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        return Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) <= radius * radius ? '8' : '-';
    }
}
