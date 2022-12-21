import java.util.Scanner;

public class RectangleBuilder {

    public Rectangle buildRectangle() {
        Scanner src = new Scanner(System.in);
        System.out.println("pls write with space name of rectangle, lenght, width");
        String line = src.nextLine();
        String[] rectangleParm = line.split(" ");
        return new Rectangle(rectangleParm[0], Double.parseDouble(rectangleParm[1]), Double.parseDouble(rectangleParm[2]));
    }
}
