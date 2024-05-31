package prototype.cached;

import prototype.shapes.Circle;
import prototype.shapes.Rectangle;
import prototype.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private final Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 8;
        rectangle.color = "Blue";

        put("Big green circle", circle);
        put("Medium blue rectangle", rectangle);
    }

    public void put(String key, Shape shape) {
        cache.put(key, shape);
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
