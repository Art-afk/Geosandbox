import java.util.Scanner;

public class GeosandboxLogic {
    GeosandboxLogic() {

    }

    public void request() {
        Scanner src = new Scanner(System.in);
        String figure = firstChose().toLowerCase();
        while (!"exit".equals(figure)) {
            switch (Integer.parseInt(figure)) {
                case (1): // triangle
                    TriangleConfig triangleConfig = getDataFromUserForTriangle();
                    Triangle tr = new Triangle(triangleConfig);
                    printArea(tr.getAreaUseAllSides());
                    printPerimeter(tr.getPerimeterAllSides());
                    figure = firstChose();

                    break;
                case (2): //Rectangle
                    RectangleConfig rectangleConfig = getDataFomUserForRectangle();
                    Rectangle re = new Rectangle(rectangleConfig);
                    printArea(re.getAreaUseLengthAndWidth());
                    printPerimeter(re.getPerimeter());
                    printName(rectangleConfig.getName());
                    figure = firstChose();

                    break;
                case (3): //Circle
                    CircleConfig circleConfig = getDataFromUserForCircle();
                    Circle cr = new Circle(circleConfig);
                    printArea(cr.getArea());
                    printPerimeter(cr.getPerimeter());
                    figure = firstChose();
                    break;
                default:
                    System.out.println("pls write correct");
                    figure = firstChose();
                    break;
            }//switch
        }
    }
private String firstChose (){
    System.out.println("pls write what u want: Triangle(1) Rectangle(2) Circle(3)");
    System.out.println("or 'List' for show all create figure or 'Exit' for exit");
    Scanner src = new Scanner(System.in);
    String figure = src.nextLine();
   return figure;
}
    private RectangleConfig getDataFomUserForRectangle() {
        Scanner src = new Scanner(System.in);
        double lenght = 0;
        double width = 0;
        String name = "";
        System.out.println("pls write name of figure");
        if(src.hasNextLine()){name = src.nextLine();
        }else {name = "rectangle";}

        System.out.println("pls write  lenght ");
        if (src.hasNextInt()) lenght = src.nextInt();
        else if (src.hasNextDouble()) lenght = src.nextDouble();
        System.out.println("pls write  width ");
        if (src.hasNextInt()) width = src.nextInt();
        else if (src.hasNextDouble()) width = src.nextDouble();
        RectangleConfig rectangleConfig = new RectangleConfig(name,lenght, width);
        return rectangleConfig;

    }

    private CircleConfig getDataFromUserForCircle() {
        Scanner src = new Scanner(System.in);
        double radius = 0;
        String name = "";
        System.out.println("pls write name of figure");
        name = src.nextLine();
        System.out.println("pls write  radius ");
        if (src.hasNextInt()) radius = src.nextInt();
        else if (src.hasNextDouble()) radius = src.nextDouble();
        CircleConfig config = new CircleConfig(name, radius);
        return config;

    }

    private TriangleConfig getDataFromUserForTriangle() {
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
        TriangleConfig triangle = new TriangleConfig(name,sideA, sideB, sideC);
        return triangle;
    }


    private void printArea(double area) {
        System.out.println("Area : " + area);

    }

    private void printPerimeter(double perm) {
        System.out.println("Perm: " + perm);
    }
    private  void  printName(String name){
        System.out.println("Name figure: " + name);
    }
}
