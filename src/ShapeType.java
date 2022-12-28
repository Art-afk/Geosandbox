import java.util.HashMap;
import java.util.Map;

public enum ShapeType {
    UNKNOWN(0), TRIANGLE(1), RECTANGLE(2), CIRCLE(3);
    private final int value;
    private static Map map = new HashMap<>();

    private ShapeType(int value) {
        this.value = value;
    }

    static {
        for (ShapeType shapeType : ShapeType.values()) {
            map.put(shapeType.value, shapeType);
        }
    }

    public static ShapeType valueOf(int shapeType) {
        return (ShapeType) map.get(shapeType);
    }

    public int getValue() {
        return value;
    }
}
