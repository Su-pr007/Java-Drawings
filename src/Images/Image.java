package Images;

public abstract class Image {
    public abstract char getSymbol(int x, int y);

    public int getWidth() {
        return 20;
    }

    public int getHeight() {
        return 20;
    }

    public void draw() {
        int width = getWidth();
        int height = getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(getSymbol(x, y));
            }

            // Перенос строки
            System.out.println();
        }
    }
}
