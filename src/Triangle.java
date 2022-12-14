public class Triangle {
    private final TriangleConfig triangleConf;

    Triangle(TriangleConfig triangleConf) {
        this.triangleConf = triangleConf;
    }

    public double getAreaUseAllSides() {
        double p = getPerimeterAllSides() / 2;
        return Math.sqrt(p * (p - triangleConf.getSideA()) * (p - triangleConf.getSideB()) * (p - triangleConf.getSideC()));
    }

    public double getPerimeterAllSides() {

        return triangleConf.getSideA() + triangleConf.getSideB() + triangleConf.getSideC();
    }


}
