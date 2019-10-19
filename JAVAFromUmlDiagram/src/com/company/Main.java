package com.company;

import com.company.vehicles.Bus;
import com.company.vehicles.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Vehicle vehicle = new Car("IS_1235",500,-2);
        System.out.println(" "+ ((Car) vehicle).getMaxSpeed());
        System.out.println(" "+ ((Car) vehicle).getConsumption());
    }
}
