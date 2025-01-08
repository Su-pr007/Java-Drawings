import Images.Image;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static HashMap<String, Image> images = ImagesList.getList();

    public static void main(String[] args) {
        Image image;
        try {
            image = chooseImage();
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return;
        }

        image.draw();
    }

    public static Image chooseImage() {
        System.out.println("Images list:");
        for (String key : images.keySet()) {
            System.out.println(key);
        }

        System.out.println("Choose an image:");
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.nextLine();

        return images.get(choose);
    }
}