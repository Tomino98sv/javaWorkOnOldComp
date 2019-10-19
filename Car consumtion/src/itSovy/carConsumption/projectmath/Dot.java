package itSovy.carConsumption.projectmath;

import itSovy.carConsumption.Geometry.Quadrant;

public class Dot {
    private int x;
    private int y;
    private char name;
    private Quadrant quant;

    public Dot(int x, int y, char name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
        this.name = 'D';
    }

    public Dot(int x) {
        this.x = x;
        this.y = x;
        this.name = 'A';
    }

    public Dot() {
        this.x = 0;
        this.y = 0;
        this.name = 'A';
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public Quadrant getQuant() {
        if (x > 0 || y > 0) {
            if (x > 0 && y > 0) {
                this.quant = Quadrant.I;
            }
            if (x < 0 && y > 0) {
                this.quant = Quadrant.II;
            }
            if (x < 0 && y < 0) {
                this.quant = Quadrant.III;
            }
            if (x > 0 && y < 0) {
                this.quant = Quadrant.IV;
            }
        } else {
            this.quant = Quadrant.NONE;
        }

        return quant;
    }

    public void flip(char z) {
        if (z == 'x' || z == 'X') {
            this.y = -y;
        } else if (z == 'y' || z == 'Y') {
            this.x = -x;
        }
    }

    public void print() {
        System.out.println("Dot name: " + name + " [ " + x + ", " + y + " ]" + "in Quandrant " + getQuant());
    }

    public static void about(String date) {
        System.out.println("Author: Tomas moje meno je");
        System.out.println("Date:");
        System.out.println(date);

    }

    public double distance(Dot bod) {

        return Math.sqrt(Math.pow(x - bod.getX(), 2) + Math.pow(y - bod.getY(), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(char name) {
        this.name = name;
    }


}
