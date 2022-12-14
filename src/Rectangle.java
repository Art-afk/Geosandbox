public class Rectangle {
    RectangleConfig rectangleConfig;



   public Rectangle(RectangleConfig rectangleConfig) {
this.rectangleConfig = rectangleConfig;
    }


    public double getAreaUseLengthAndWidth() {

        return rectangleConfig.getLength() * rectangleConfig.getWidth();
    }

    public double getPerimeter() {
        return 2 * (rectangleConfig.getLength() + rectangleConfig.getWidth());
    }

}
