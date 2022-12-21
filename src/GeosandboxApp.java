import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GeosandboxApp {
    private ArrayList<Shape> shapeApp = new ArrayList<Shape>();

    GeosandboxApp() {

    }

    public void request() {
        Boolean repeat = true;
        while (repeat) {
            String keyinput = firstChose().toLowerCase();
            ShapeType shapeType = ShapeType.valueOf(Integer.parseInt(keyinput));
            switch (shapeType) {
                case TRIANGLE: // triangle
                    Triangle triangle = triangleSetup();
                    shapeApp.add(triangle);
                    break;
                case RECTANGLE: //Rectangl
                    Rectangle rectangle = rectangleSetup();
                    shapeApp.add(rectangle);
                    break;
                case CIRCLE: //Circle
                    Circle circle = circleSetup();
                    shapeApp.add(circle);
                    break;
                case EXIT:
                    System.exit(0);
                case LIST:
                    pringAllShape();
                    break;

                default:
                    System.out.println("pls write correct");

                    break;
            }//switch
        }
    }

    public void pringAllShape() {
        System.out.println(shapeApp.toString());
    }

    private Circle circleSetup() {
        CircleBuilder circleBuilder = new CircleBuilder();
        Circle circle = circleBuilder.bulidCircle();
        return circle;
//        printArea(circle.getArea());
//        printPerimeter(circle.getPerimeter());
    }

    private Rectangle rectangleSetup() {
        RectangleBuilder rectangleBuilder = new RectangleBuilder();
        Rectangle rectangle = rectangleBuilder.buildRectangle();
        return rectangle;
//        printArea(rectangle.getAreaUseLengthAndWidth());
//        printPerimeter(rectangle.getPerimeter());
//        printName(rectangle.getName());
    }

    private Triangle triangleSetup() {
        TriangleBuilder triangleBuilder = new TriangleBuilder();
        Triangle triangle = triangleBuilder.buildTriangle();
        return triangle;
//        printArea(triangle.getAreaUseAllSides());
//        printPerimeter(triangle.getPerimeterAllSides());
    }

    private String firstChose() {
        System.out.println("pls write what u want: Triangle(1) Rectangle(2) Circle(3)");
        System.out.println("or List(4) for show all create figure or Exit(0) for exit");
        Scanner src = new Scanner(System.in);
        String keyinput = src.nextLine();
        return keyinput;
    }

}
