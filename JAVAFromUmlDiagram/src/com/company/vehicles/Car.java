package com.company.vehicles;

import com.company.Vehicle;

public class Car extends Vehicle {
    private int maxSpeed;
    protected double consumption;

    public Car(String id,int maxSpeed, double consumption) {
        super(id);
        if (maxSpeed<0){maxSpeed=0;}
        if (maxSpeed>270){maxSpeed=270;}
        if (consumption<0){ consumption=0;}
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
    }

    public Car(String id){
        super(id);
        this.maxSpeed = 100;
        this.consumption = 5.1;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed<0){maxSpeed=0;}
        if (maxSpeed>270){maxSpeed=270;}
        this.maxSpeed = maxSpeed;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        if (consumption<0){ consumption=0;}
        this.consumption = consumption;
    }
}
