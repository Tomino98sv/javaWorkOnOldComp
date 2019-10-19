package itSovy.carConsumption.projectmath;

public class Circle implements Methods {

    private Dot S;
    private Dot R;
    private double r;
    private static int count=0;

    public Circle(Dot S, double r) {
        this.S = S;
        this.r = r;
        count++;
    }

    public Circle(int xS, int yS, double r) {
        S = new Dot(xS, yS, 'S');
        this.r = r;
        count++;
    }

    public Circle(int xS, int yS, int xR, int yR) {
        S = new Dot(xS, yS, 'S');
        R = new Dot(xR, yR, 'R');
        this.r = 0;
        if (r == 0) {
            this.r = getRadius();
        }
        count++;
    }

    public double getRadius() {
        return S.distance(R);
    }


    @Override
    public double getArea() {
        if (r == 0) {
            return Math.PI * getRadius() * getRadius();
        } else {
            return Math.PI * r * r;
        }
    }

    @Override
    public double getPerimeter() {
        if (r == 0) {
            return 2 * getRadius() * Math.PI;
        } else {
            return 2 * r * Math.PI;
        }
    }

    public boolean isDotInCircle(Dot N) {
        if (S.distance(N) <= r) {
            return true;
        } else {
            return false;
        }
    }

    public void print(){
        System.out.println("S: "+" [ y: "+S.getY()+" ] x: "+S.getX()+" ] "+"r: "+r);
    }

    public Dot getS(){
        return S;
    }

    public double getr(){
        return r;
    }

    public static void printCount(){
        System.out.println("Number of circles: "+count);
    }


}
