package itSovy.carConsumption.projectmath;

import itSovy.carConsumption.Geometry.Quadrant;

public class Dot3D extends Dot {

    private int z;

    public Dot3D(int x, int y, int z, char name) {
        super(x, y, name); //PRVY NEPRAZDNY RIADOK V CONSTRUKTORE MUSI BYT SUPER
        this.z = z; //ak by sa z inac volalo napr m tak netreba this
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public Quadrant getQuant() {
        return Quadrant.NONE;
    }

    @Override
    public void print() {
        System.out.println("Dot name: " + getName() + " [ " + getX() + ", " + getY() + " , " + z + " ] ");

    }

    @Override
    public double distance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(z, 2) + Math.pow(getY(), 2));
    }
}
