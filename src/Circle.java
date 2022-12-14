public class Circle {
    private CircleConfig circleConfig;

   public Circle(CircleConfig circleConfig) {
       this.circleConfig= circleConfig;
    }
    private final double pi = 3.14;

    public double getArea() {
        return pi * square(circleConfig.getRadius());
    }

    public double getPerimeter() {
        return 2 * pi * circleConfig.getRadius();
    }


    public double square(double a) {
        return a * a;
    }


}
