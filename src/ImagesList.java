import Images.*;

import java.util.HashMap;

public class ImagesList {
    public static HashMap<String, Image> getList() {
        HashMap<String, Image> map = new HashMap<>();
        map.put("plus", new Plus());
        map.put("cross", new Cross());
        map.put("square", new Square());
        map.put("half", new Half());
        map.put("chess", new Chess());
        map.put("diagonal", new Diagonal());
        map.put("circle", new Circle());
        map.put("rhombus", new Rhombus());

        return map;
    }
}
