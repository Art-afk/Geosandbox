public class Triangle {

    Triangle() {

    }

    public double getAreaUseTwoSideAndAngle(double sideA, double sideB, double angle) {
        return 0.5 * sideA * sideB * Math.sin(angle);
    }

    public double getAreaUseBaseSideAndHight(double base, double hight) {
        return 0.5 * base * hight;
    }

    public double getAreaUseRadiusAndAllSides(double radius, double sideA, double sideB, double sideC) {
        return (sideA * sideB * sideC) / (4 * radius);
    }

    public double getAreaUseOneSideAndTwoAngle(double sideA, double angleA, double angleB) {

        return square(sideA) * (Math.sin(angleA) * Math.sin(angleB) / 2 * Math.sin(angleA + angleB));
    }

    public double getAreaUseSemiPerimeterAndRadius(double sPerim, double radius) {
        return radius * sPerim;
    }
    public double getAreaUseAllSides(double sideA, double sideB, double sideC){
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p *(p -sideA) * (p -sideB) * (p - sideC));
    }

    private double square(double a) {
        return a * a;
    }
}
