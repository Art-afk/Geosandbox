public class TriangleConfig {

    private final String name;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    TriangleConfig(String name, double sideA, double sideB, double sideC ) {
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
}
