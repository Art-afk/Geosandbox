import java.util.ArrayList;
import java.util.Scanner;

public class GeosandboxApp {
    private ArrayList<Shape> shapeApp = new ArrayList<Shape>();
    private CircleBuilder circleBuilder = new CircleBuilder();
    private RectangleBuilder rectangleBuilder = new RectangleBuilder();
    private TriangleBuilder triangleBuilder = new TriangleBuilder();


    GeosandboxApp() {

    }

    public void displayMainMenu(){
        Boolean repeat = true;

        while (repeat){
            int keyinput = printMainMenu();
            MainDialog mainDialog = MainDialog.valueOf(keyinput);
            switch (mainDialog){
                case LIST:
                    printAllShape();
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                case CREATESHAPE:
                    displayShapeMenuSelection();
                default:
                    System.out.println("pls check what u chose");
                    break;
            }

        }
    }
    private int printMainMenu(){
        System.out.println("pls write what u want: Create Shape(2), List(1), Exit(0) or press any key to create figure");
        Scanner src = new Scanner(System.in);
        String keyinput = src.nextLine();
        if(keyinput == "")
            keyinput = "-0";
        return Integer.parseInt(keyinput);
    }


    private void displayShapeMenuSelection() {
        Boolean repeat = true;
        while (repeat) {
            int keyinput = printShapeMenu();
            ShapeType shapeType = ShapeType.valueOf(keyinput);
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
                default:
                    repeat=false;
                    break;
            }//switch
        }
    }

    private void printAllShape() {
        if(shapeApp.isEmpty())
            System.out.println("please create shape");
        else {
            for(Shape key : shapeApp){
                System.out.println(key.getName() + " Perimeter: " + key.getPerimeter() + " Area: " + key.getArea());
                System.out.println("-----------");
            }
        }
    }

    private Circle circleSetup() {
        Circle circle = circleBuilder.bulidCircle();
        return circle;

    }

    private Rectangle rectangleSetup() {
        Rectangle rectangle = rectangleBuilder.buildRectangle();
        return rectangle;

    }

    private Triangle triangleSetup() {
        Triangle triangle = triangleBuilder.buildTriangle();
        return triangle;

    }

    private Integer printShapeMenu() {
        System.out.println("pls write what u want: Triangle(1) Rectangle(2) Circle(3)");
        System.out.println("or Exit(0) for exit to Main menu");
        Scanner src = new Scanner(System.in);
        String keyinput = src.nextLine();
        if(keyinput == "")
            keyinput = "-0";
        return Integer.parseInt(keyinput);
    }

}
