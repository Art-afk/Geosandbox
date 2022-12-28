import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Scanner;

public class GeosandboxApp {
    private ArrayList<Shape> shapeApp = new ArrayList<Shape>();
    private CircleBuilder circleBuilder = new CircleBuilder();
    private RectangleBuilder rectangleBuilder = new RectangleBuilder();
    private TriangleBuilder triangleBuilder = new TriangleBuilder();


    GeosandboxApp() {

    }

    public void displayMainMenu() {
        Boolean repeat = true;

        while (repeat) {
            int keyinput = printMainMenuDialog();
            MainDialog mainDialog = MainDialog.valueOf(keyinput);
            switch (mainDialog) {
                case EXIT:
                    System.exit(0);
                    break;
                case SHAPE_MANAGER:
                    shapeManagerBuilderMenu();
                    break;
                case CREATE_SHAPE:
                    displayShapeMenuSelection();
                    break;
                default:
                    System.out.println("pls check what u chose");
                    break;
            }
        }
    }

    private void displayShapeManagerMenuSelection() {

        boolean repeat = true;
        while (repeat) {


        }
    }

    private void displayShapeMenuSelection() {
        boolean repeat = true;
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
                    repeat = false;
                    break;
            }//switch
        }
    }

    private Integer printMainMenuDialog() {
        System.out.println("pls write what u want:  Exit(0), Shape Manager(1), Create Shape(2) or press any key to create figure");
        Scanner src = new Scanner(System.in);
        Integer keyinput = src.nextInt();
        if (keyinput == null) keyinput = -1;
        return keyinput;
    }

    private void shapeManagerBuilderMenu() {
        boolean repeat = true;
        while (repeat) {
            Scanner src = new Scanner(System.in);
            System.out.println("pls write chose what u want: \"exit\" to previous menu, \"List\", \"Show <name>\"");
            String line = src.nextLine();
            String[] shapeArgs = line.split(" ");
            switch (ShapeManagerDialog.valueOf(shapeArgs[0].toUpperCase())) {
                case SHOW:
                    if (shapeArgs.length != 2) {
                        System.out.println("show args incorrect. pls write \"shape <name>\" ");
                        break;
                    } else printShape(shapeArgs[1]);
                    break;
                case LIST:
                    printAllShape();
                    break;
                case EXIT:
                    repeat = false;
                    break;
                default:
                    System.out.println("pls check what u chose");
                    break;
            }
        }
    }

    private void printShape(String name) {
        if (shapeApp.isEmpty()) System.out.println("please create shape");
        else {
            for (Shape key : shapeApp) {
                if (key.getName().toLowerCase().equals(name.toLowerCase())) {
                    String[] shape = key.toString().split("@");
                    System.out.println("Type: " + shape[0] + " \nName: " + key.getName() + "\n" + key.getSettings());
                }
            }
        }
    }

    private void printAllShape() {
        if (shapeApp.isEmpty()) System.out.println("please create shape");
        else {
            for (Shape key : shapeApp) {
                System.out.println(key.getName() + " Parameters: " + key.getParam());
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
        if (keyinput == "") keyinput = "-1";
        return Integer.parseInt(keyinput);
    }

}
