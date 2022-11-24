public class Rectangle {

    Rectangle() {

    }
    private final double pi = 3.14;


    public double getAreaUseLengthAndWidth(double lenght, double width){
        return lenght* width;
   }
   public double getAreaUseDiagonalAndCorner(double diagonal, double corner){
        return 0.5 * square(diagonal) * Math.sin(corner);
   }

   public double getAreaUseDiagonalAndAnySide(double diagonal, double side){
        return side*(Math.sqrt(square(diagonal) - square(side)));
   }
   public  double getPerimeter(double sideA, double sideB){
        return 2*(sideA+sideB);
   }

    public double square(double a) {
        return a * a;
    }
}
