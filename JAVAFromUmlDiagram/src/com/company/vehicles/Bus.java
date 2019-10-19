package com.company.vehicles;

import com.company.I1;
import com.company.Vehicle;

public class Bus extends Vehicle  implements I1 {
    private int capacity;

    public Bus(String id,int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public Bus(String id){
        super(id);
        this.capacity=100;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String about() {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }
}
