public class Main {

    public static void main(String[] args) {

        rectangle obdlznik = new rectangle(10.0,5.0);
        squarre stvorec = new squarre(10.0);

       Geometry vsetkoG[] = {obdlznik, stvorec};
        for (Geometry g:vsetkoG) {
            System.out.println(g.obsah()+" "+g.obvod());

        }
	// write your code here
    }
}

abstract class Geometry{
    abstract double obsah();
    abstract double obvod();
}


class rectangle extends  Geometry{

    private double a;
    private double b;

    public rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    @Override
    double obsah() {
        return a*b;
    }

    @Override
    double obvod() {
        return 2*(a+b);
    }

}

class squarre extends Geometry{

    private double a;

    public  squarre(double a){
        this.a=a;
    }

    public double getA(){
        return a;
    }

    @Override
    double obsah() {
        return a*a;
    }

    @Override
    double obvod() {
        return 4*a;
    }


}