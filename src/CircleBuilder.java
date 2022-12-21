import java.util.Scanner;

public class CircleBuilder {


    public Circle bulidCircle(){
        Scanner src = new Scanner(System.in);
        System.out.println("pls write with space name of figure, radius ");
        String line = src.nextLine();
        String[] circleParm = line.split(" ");
        return new Circle(circleParm[0],Double.parseDouble(circleParm[1]));
    }
}
