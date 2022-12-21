import java.util.Scanner;

public class GeosandboxApp {
    GeosandboxApp() {

    }

    public void request() {
        Boolean repeat = true;
        while (repeat) {
            String keyinput = firstChose().toLowerCase();
            ShapeType shapeType = ShapeType.valueOf(Integer.parseInt(keyinput));
            switch (shapeType) {
                case TRIANGLE: // triangle
                    triangleSetup();
                    break;
                case RECTANGLE: //Rectangl
                    rectangleSetup();
                    break;
                case CIRCLE: //Circle
                    circleSetup();
                    break;
                case EXIT:
                    System.exit(0);
                default:
                    System.out.println("pls write correct");

                    break;
            }//switch
        }
    }

    private void circleSetup() {
        CircleBuilder circleBuilder = new CircleBuilder();
        Circle circle = circleBuilder.bulidCircle();
        printArea(circle.getArea());
        printPerimeter(circle.getPerimeter());
    }

    private void rectangleSetup() {
        RectangleBuilder rectangleBuilder = new RectangleBuilder();
        Rectangle rectangle = rectangleBuilder.buildRectangle();
        printArea(rectangle.getAreaUseLengthAndWidth());
        printPerimeter(rectangle.getPerimeter());
        printName(rectangle.getName());
    }

    private void triangleSetup() {
        TriangleBuilder triangleBuilder = new TriangleBuilder();
        Triangle triangle = triangleBuilder.buildTriangle();
        printArea(triangle.getAreaUseAllSides());
        printPerimeter(triangle.getPerimeterAllSides());
    }

    private String firstChose() {
        System.out.println("pls write what u want: Triangle(1) Rectangle(2) Circle(3)");
        System.out.println("or 'List' for show all create figure or 'Exit' for exit");
        Scanner src = new Scanner(System.in);
        String keyinput = src.nextLine();
        return keyinput;
    }

    private Rectangle getDataFomUserForRectangle() {
        Scanner src = new Scanner(System.in);
        double lenght = 0;
        double width = 0;
        String name = "";
        System.out.println("pls write name of figure");
        if (src.hasNextLine()) {
            name = src.nextLine();
        } else {
            name = "rectangle";
        }
        System.out.println("pls write  lenght ");
        if (src.hasNextInt()) lenght = src.nextInt();
        else if (src.hasNextDouble()) lenght = src.nextDouble();
        System.out.println("pls write  width ");
        if (src.hasNextInt()) width = src.nextInt();
        else if (src.hasNextDouble()) width = src.nextDouble();
        return new Rectangle(name, lenght, width);
    }




    private void printArea(double area) {
        System.out.println("Area : " + area);

    }

    private void printPerimeter(double perm) {
        System.out.println("Perm: " + perm);
    }

    private void printName(String name) {
        System.out.println("Name figure: " + name);
    }
}
