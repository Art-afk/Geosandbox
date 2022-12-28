public class Rectangle extends Shape {

    private final String name;

    private final double length;
    private final double width;


    public Rectangle(String name, double length, double width) {

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

    @Override
    public String getParam() {
        String param = "Length: " + getLength() + " Width: " + getWidth();
        return param;
    }

    @Override
    public double getArea() {

        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String getSettings() {
        String param = "Length: " + getLength() + " Width: " + getWidth() +
                "\nDiagonal: " + getDiagonalRectangle() +
                "\nIs a rectangle a square: " + getRectangleOrSqr();
        return param;
    }

    private double getDiagonalRectangle() {
        return Math.sqrt(pow(getLength()) + pow(getWidth()));
    }

    private Double pow(Double a) {
        return a * a;
    }

    private boolean getRectangleOrSqr() {
        return getWidth() == getLength();
    }

}
