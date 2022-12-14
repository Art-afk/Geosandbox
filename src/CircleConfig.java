public class CircleConfig {
    private final double radius;
    private final String name;

    CircleConfig(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }
}
