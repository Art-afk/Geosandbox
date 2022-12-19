import java.util.Scanner;

public class GeosandboxLogic {
    GeosandboxLogic() {

    }

    public void request() {
        String keyinput = firstChose().toLowerCase();
         ShapeType shapeType = ShapeType.valueOf(Integer.parseInt(keyinput));
//        int shapeTypeTriangle = shapeType.getValue();
//        int shapeTypeRectangle = ShapeType.RECTANGLE.getValue();
//        int shapeTypeCircle = ShapeType.CIRCLE.getValue();

        while (!"exit".equals(keyinput)) {
            switch (shapeType) {
                case TRIANGLE: // triangle
                    createTriangle();
                    keyinput = firstChose();
                    break;
                case RECTANGLE: //Rectangl
                    createRectangle();
                    keyinput = firstChose();

                    break;
                case CIRCLE: //Circle
                    createCircle();
                    keyinput = firstChose();
                    break;
                default:
                    System.out.println("pls write correct");
                    keyinput = firstChose();
                    break;
            }//switch
        }
    }

    private void createCircle() {
        Circle circle = getDataFromUserForCircle();
        printArea(circle.getArea());
        printPerimeter(circle.getPerimeter());
    }

    private void createRectangle() {
        Rectangle rectangle = getDataFomUserForRectangle();
        printArea(rectangle.getAreaUseLengthAndWidth());
        printPerimeter(rectangle.getPerimeter());
        printName(rectangle.getName());
    }

    private void createTriangle() {
        Triangle triangle = getDataFromUserForTriangle();
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

    private Circle getDataFromUserForCircle() {
        Scanner src = new Scanner(System.in);
        double radius = 0;
        String name = "";
        System.out.println("pls write name of figure");
        name = src.nextLine();
        System.out.println("pls write  radius ");
        if (src.hasNextInt()) radius = src.nextInt();
        else if (src.hasNextDouble()) radius = src.nextDouble();
        return new Circle(name, radius);

    }

    private Triangle getDataFromUserForTriangle() {
        Scanner src = new Scanner(System.in);
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;
        String name = "";
        System.out.println("pls write name of figure");
        name = src.nextLine();
        System.out.println("pls write  sideA ");
        if (src.hasNextInt()) sideA = src.nextInt();
        else if (src.hasNextDouble()) sideA = src.nextDouble();
        System.out.println("pls write  SideB ");
        if (src.hasNextInt()) sideB = src.nextInt();
        else if (src.hasNextDouble()) sideB = src.nextDouble();
        System.out.println("pls write  SideC ");
        if (src.hasNextInt()) sideC = src.nextInt();
        else if (src.hasNextDouble()) sideC = src.nextDouble();
        return new Triangle(name, sideA, sideB, sideC);
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
