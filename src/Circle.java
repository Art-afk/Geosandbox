public class Circle {
    private final double radius;
    private final String name;
   public Circle(String name, double radius) {
       this.name = name;
       this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }
    private final double pi = 3.14;

    public double getArea() {
        return pi * square(getRadius());
    }
    public double getPerimeter() {
        return 2 * pi * getRadius();
    }


    public double square(double a) {
        return a * a;
    }


}
