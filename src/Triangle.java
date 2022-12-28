import java.util.ArrayList;
import java.util.Collections;

public class Triangle extends Shape {

    private final String name;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    Triangle(String name, double sideA, double sideB, double sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = name;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }

    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public String getParam() {
        String param = "SideA: " + getSideA() + " SideB: " + getSideB() + " SideC: " + getSideC();
        return param;
    }

    @Override
    public String getSettings() {
        String param = "SideA: " + getSideA() + " SideB: " + getSideB() + " SideC: " + getSideC() +
                "\nAngel Between A B: " + getAngelsBetweenAB() +
                "\nAngel Between B C: " + getAngelsBetweenBC() +
                "\nAngel Between C A: " + getAngelsBetweenCA() +
                "\nArea : " + getArea() +
                "\nPerimeter: " + getPerimeter() +
                "\nRightTriangle: " + getRightTriangle() +
                "\nEquilateral Triangle: " + getEquilateralTriangle();

        return param;
    }

    private Double pow(Double a) {
        return a * a;
    }

    private Double getAngelsBetweenAB() {
        Double angels = (Math.pow(getSideA(), 2) + Math.pow(getSideC(), 2) - Math.pow(getSideB(), 2)) / (2 * getSideA() * getSideC());
        return Math.toDegrees(Math.cos(angels));
    }

    private double getAngelsBetweenBC() {
        Double angels = (Math.pow(getSideA(), 2) + Math.pow(getSideB(), 2) - Math.pow(getSideC(), 2)) / (2 * getSideA() * getSideB());
        return Math.toDegrees(Math.cos(angels));
    }

    private Double getAngelsBetweenCA() {
        Double angels = (Math.pow(getSideB(), 2) + Math.pow(getSideC(), 2) - Math.pow(getSideA(), 2)) / (2 * getSideC() * getSideB());
        return Math.toDegrees(Math.cos(angels));
    }

    private boolean getRightTriangle() {
        ArrayList<Double> Sides = new ArrayList<Double>();
        Sides.add(getSideA());
        Sides.add(getSideB());
        Sides.add(getSideC());
        Collections.sort(Sides);

        return pow(Sides.get(2)).equals(pow(Sides.get(0)) + pow(Sides.get(1)));
    }

    private boolean getEquilateralTriangle() {
        return getSideA() == getSideB() && getSideB() == getSideC();
    }


}
