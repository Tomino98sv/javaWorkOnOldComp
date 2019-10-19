package itSovy.carConsumption.projectmath;

public class Angle {

    private Dot A;
    private Dot B;
    private Dot C;

    public Angle(Dot A,Dot B,Dot C){
        this.A=A;
        this.B=B;
        this.C=C;
    }

    public Angle(int xa,int ya,int xb,int yb,int xc,int yc){
        this.A=new Dot(xa,ya);
        this.B=new Dot(xb,yb);
        this.C=new Dot(xc,yc);
    }

    public double getLineA() {
        return B.distance(C);
    }

    public double getLineB() {
        return A.distance(C);
    }

    public double getLineC() {
        return B.distance(A);
    }

    public double getAlpha() {
        double alpha = Math.acos((Math.pow(getLineA(), 2) + Math.pow(getLineC(), 2) - Math.pow(getLineB(), 2)) / (2 * getLineA() * getLineC()));
        alpha = Math.toDegrees(alpha);
        return alpha;
    }





}
