public class TriangleConfig {

    private final double catetA;
    private final double catetB;
    private final double hypotenuse;
    private final double height;
    private final double actureAngle;
    private final double angle;

    TriangleConfig(double catetA, double catetB, double hypotenuse, double height, double actureAngle, double angle ) {
        this.catetA = catetA;
        this.catetB = catetB;
        this.hypotenuse = hypotenuse;
        this.height = height;
        this.actureAngle = actureAngle;
        this.angle = angle;

    }
    public double getCatetA(){
        return catetA;
    }

    public double getActureAngle() {
        return actureAngle;
    }

    public double getCatetB() {
        return catetB;
    }

    public double getAngle() {
        return angle;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }
}
