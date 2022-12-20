public class Triangle {

    private final String name;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    Triangle(String name, double sideA, double sideB, double sideC ) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.name = name;
    }

    public double getSideA(){
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {return sideC; }

    public String getName() {
        return name;
    }
    public double getAreaUseAllSides() {
        double p = getPerimeterAllSides() / 2;
        return Math.sqrt(p * (p - getSideA()) * (p - getSideB()) * (p - getSideC()));
    }
    public double getPerimeterAllSides() {

        return getSideA() + getSideB() + getSideC();
    }


}
