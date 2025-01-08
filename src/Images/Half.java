package Images;

public class Half extends Image {
    @Override
    public char getSymbol(int x, int y) {
        return y < getHeight() / 2 ? '=' : '-';
    }
}
