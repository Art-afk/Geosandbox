public class RectangleConfig {

    private final String name;

    private final double length;
    private final double width;

    RectangleConfig(String name, double length, double width){
        this.length = length;
        this.width = width;
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getName() {
        return name;
    }
}
