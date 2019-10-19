package com.company.vehicles;


public class Trolybus extends Bus {
    public int voltage;

    public Trolybus(String id,int capacity,int voltage) {
        super(id,capacity);
        this.voltage=voltage;
    }

    public Trolybus(String id){
        super(id);
        this.voltage=750;
    }


}
