import java.util.Scanner;

public class TriangleBuilder {

    public Triangle buildTriangle() {
        Scanner src = new Scanner(System.in);
        System.out.println("pls write with space name of figure, sideA, sideB, sideC ");
        String line = src.nextLine();
        String[] triangleParm = line.split(" ");
        return new Triangle(triangleParm[0], Integer.parseInt(triangleParm[1]), Integer.parseInt(triangleParm[2]), Integer.parseInt(triangleParm[3]));
    }

}
