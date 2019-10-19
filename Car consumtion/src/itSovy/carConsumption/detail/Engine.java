package itSovy.carConsumption.detail;

public class Engine {

    public int engineCylinder;
    public int power;
    public int volume;      //objem valca
    public char fuel;       //typ paliva

    public Engine(int engineCylinder, int power, int volume, char fuel) {
        this.engineCylinder = engineCylinder;
        this.power = power;
        this.volume = volume;
        this.fuel = fuel;
    }

    public int getEngineCylinder() {
        return engineCylinder;
    }

    public int getPower() {
        return power;
    }

    public int getVolume() {
        return volume;
    }

    public char getFuel() {
        return fuel;
    }
}
