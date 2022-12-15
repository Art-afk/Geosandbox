public class Rectangle {

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

    public double getAreaUseLengthAndWidth() {

        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

}
