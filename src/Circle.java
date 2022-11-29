public class Circle {

   public Circle() {

    }

    private final double pi = 3.14;

    public double getArea(double radius) {
        return pi * square(radius);
    }

    public double getAreaUseDiametre(double diameter) {
        return square(diameter) / 4 * pi;
    }

    public double getAreaUseCircle(double circle) {
        return square(circle) / (4 * pi);
    }

    public double getPerimeter(double radius) {
        return 2 * pi * radius;
    }

    public double getPerimeterUseDiameter(double diameter) {
        return diameter * pi;
    }

    public double square(double a) {
        return a * a;
    }


}
