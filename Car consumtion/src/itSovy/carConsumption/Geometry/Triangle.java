package itSovy.carConsumption.Geometry;

import itSovy.carConsumption.projectmath.Dot;
import itSovy.carConsumption.projectmath.Methods;

public class Triangle implements Methods {

    private Dot a;
    private Dot b;
    private Dot c;

    public Triangle(Dot a, Dot b, Dot c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int xa, int ya, int xb, int yb, int xc, int yc) {
        a = new Dot(xa, ya, 'A');
        b = new Dot(xb, yb, 'B');
        c = new Dot(xc, yc, 'C');
    }

    @Override
    public double getArea() {
        double s = 0;
        s = (getLineA() + getLineC() + getLineB()) / 2;

        return Math.sqrt(s * (s - getLineA()) * (s - getLineB()) * (s - getLineC()));
    }

    @Override
    public double getPerimeter() {

        return getLineA() + getLineB() + getLineC();//spocitat strany
    }

    public double getAlpha() {
        double alpha = Math.acos((Math.pow(getLineB(), 2) + Math.pow(getLineC(), 2) - Math.pow(getLineA(), 2)) / (2 * getLineB() * getLineC()));
        alpha = Math.toDegrees(alpha);
        return alpha;
    }

    public double getLineA() {
        return b.distance(c);
    }

    public double getLineB() {
        return a.distance(c);
    }

    public double getLineC() {
        return b.distance(a);
    }

}
