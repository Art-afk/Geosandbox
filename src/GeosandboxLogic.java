import java.util.Scanner;

public class GeosandboxLogic {
    GeosandboxLogic() {

    }

    public void request() {
        Scanner src = new Scanner(System.in);
        System.out.println("pls write what u want: Triangle Rectangle Circle or 0 for exit");
        String figure = src.nextLine();
        switch (figure.toLowerCase()) {
            case ("triangle"):
                getDataFromUserForTriangle();
                break;
            case ("rectangle"):

            case ("circle"):

            default:
        }

    }

    private void getDataFromUserForTriangle() {
        Scanner src = new Scanner(System.in);
        Triangle triangle = new Triangle();
        String tempScaner = "";
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;
        double height = 0;
        double base = 0;
        double radius = 0;
        double angle = 0;
        double angleB = 0;
        double perimetr = 0;
        System.out.println("pls put data what u know");

        System.out.println("Do u know base and height? yes or not (Default NO)");
        if (src.nextLine().equals("Yes")) {
            System.out.println("pls write height:");
            if (src.hasNextInt()) height = src.nextInt();
            else if (src.hasNextDouble()) height = src.nextDouble();
            System.out.println("now write Base side:");
            if (src.hasNextInt()) base = src.nextInt();
            else if (src.hasNextDouble()) base = src.nextDouble();
            perimetr = triangle.getAreaUseBaseSideAndHight(base, height);
            System.out.println("Perimeter Triangle: " + perimetr);
        } else {
            System.out.println("Do u know all sides? yes or not (Default NO)");
            if (src.nextLine().equals("Yes")) {
                System.out.println("pls write  sideA ");
                if (src.hasNextInt()) sideA = src.nextInt();
                else if (src.hasNextDouble()) sideA = src.nextDouble();
                System.out.println("pls write  SideB ");
                if (src.hasNextInt()) sideB = src.nextInt();
                else if (src.hasNextDouble()) sideB = src.nextDouble();
                System.out.println("pls write  SideC ");
                if (src.hasNextInt()) sideC = src.nextInt();
                else if (src.hasNextDouble()) sideC = src.nextDouble();

                perimetr = triangle.getAreaUseAllSides(sideA, sideB, sideC);
                System.out.println("Perimeter Triangle: " + perimetr);
            } else {
                System.out.println("Do u know two sides and the angle between them? yes or not (Default NO)");
                if (src.nextLine().equals("Yes")) {
                    System.out.println("pls write first sideA ");
                    if (src.hasNextInt()) sideA = src.nextInt();
                    else if (src.hasNextDouble()) sideA = src.nextDouble();

                    System.out.println("pls write second SideB ");
                    if (src.hasNextInt()) sideB = src.nextInt();
                    else if (src.hasNextDouble()) sideB = src.nextDouble();

                    System.out.println("pls write angle ");
                    if (src.hasNextInt()) angle = src.nextInt();
                    else if (src.hasNextDouble()) angle = src.nextDouble();
                    perimetr = triangle.getAreaUseTwoSideAndAngle(sideA, sideB, angle);
                    System.out.println("Perimeter Triangle: " + perimetr);
                } else {
                    System.out.println("Do u know one side and two angle? yes or not (Default NO)");
                    if (src.nextLine().toLowerCase().equals("yes")) {
                        System.out.println("pls write first sideA ");
                        if (src.hasNextInt()) sideA = src.nextInt();
                        else if (src.hasNextDouble()) sideA = src.nextDouble();
                        System.out.println("pls write angle A ");
                        if (src.hasNextInt()) angle = src.nextInt();
                        else if (src.hasNextDouble()) angle = src.nextDouble();
                        System.out.println("pls write angle B ");
                        if (src.hasNextInt()) angleB = src.nextInt();
                        else if (src.hasNextDouble()) angleB = src.nextDouble();
                        perimetr = triangle.getAreaUseOneSideAndTwoAngle(sideA, angle, angleB);
                        System.out.println("Perimeter Triangle: " + perimetr);
                    } else {
                        System.out.println("Do u know Semi-Perimeter and Radius? yes or not (Default NO)");
                        if (src.nextLine().equals("Yes")) {
                            System.out.println("pls write  Semi-Perimeter ");
                            if (src.hasNextInt()) sideA = src.nextInt();
                            else if (src.hasNextDouble()) sideA = src.nextDouble();

                            System.out.println("pls write  radius ");
                            if (src.hasNextInt()) perimetr = src.nextInt();
                            else if (src.hasNextDouble()) perimetr = src.nextDouble();
                            perimetr = triangle.getAreaUseSemiPerimeterAndRadius(perimetr, radius);
                            System.out.println("Perimeter Triangle: " + perimetr);
                        } else {
                            System.out.println("Do u know circumscribed circle and all sides? yes or not (Default NO)");
                            if (src.nextLine().equals("Yes")) {
                                System.out.println("pls write  sideA ");
                                if (src.hasNextInt()) sideA = src.nextInt();
                                else if (src.hasNextDouble()) sideA = src.nextDouble();

                                System.out.println("pls write  SideB ");
                                if (src.hasNextInt()) sideB = src.nextInt();
                                else if (src.hasNextDouble()) sideB = src.nextDouble();

                                System.out.println("pls write  SideC ");
                                if (src.hasNextInt()) sideC = src.nextInt();
                                else if (src.hasNextDouble()) sideC = src.nextDouble();

                                System.out.println("pls write  Radius ");
                                if (src.hasNextInt()) radius = src.nextInt();
                                else if (src.hasNextDouble()) radius = src.nextDouble();
                                perimetr = triangle.getAreaUseRadiusAndAllSides(radius, sideA, sideB, sideC);
                                System.out.println("Perimeter Triangle: " + perimetr);

                            }else {
                                System.out.println("you don't know anything, we can't help you");
                            }
                        }

                    }
                }

            }


        }
    }
}
