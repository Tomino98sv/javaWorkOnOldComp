package itSovy.carConsumption.Geometry;


import itSovy.carConsumption.projectmath.Dot;
import itSovy.carConsumption.projectmath.Methods;

public class Square implements Methods {

    private Dot a;
    private Dot b;
    private Dot c;
    private Dot d;

    public Square(Dot a, Dot b, Dot c, Dot d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Square(int xa, int ya, int xb, int yb, int xc, int yc, int xd, int yd) {
        a = new Dot(xa, ya, 'A');
        b = new Dot(xb, yb, 'B');
        c = new Dot(xc, yc, 'C');
        d = new Dot(xd, yd, 'D');
    }

    @Override
    public double getArea() {
        return Math.pow(getLine(), 2);
    }

    @Override
    public double getPerimeter() {
        return getLine() * 4;
    }


    public double getLine() {
        return a.distance(b);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(getLine(), 2) + Math.pow(getLine(), 2));
    }




}
