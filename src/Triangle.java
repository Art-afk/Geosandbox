public class Triangle {

    Triangle() {

    }

    public double getAreaOfRightTriangleUseCateLeg(double catetA, double catetB) {
        return 1 / 2 * (catetA * catetB);
    }

    public double getAreaOfRightTriangleUseHypotenuseAndH(double hypo, double h) {
        return 1 / 2 * (hypo * h);
    }

    public double getAreaOfRightTriangleHypotenuseAndAcuteAngle(double hypo, double actureAngle) {
        return hypo * 2 * Math.sin(2 * actureAngle) / 4;

    }

    public double getAreaOfRightTriangleUseCatetAndAngle(double catet, double angle) {
        return 1 / 2 * square(catet) * Math.tan(angle);

    }

    public double getAreaUseRadiusandHypotenuse(double catetA, double catetB, double hypo) {
        double radius = (catetA + catetB - hypo) / 2;
        return radius*(radius+hypo);
    }

    public double square(double a) {
        return a * a;
    }
}
