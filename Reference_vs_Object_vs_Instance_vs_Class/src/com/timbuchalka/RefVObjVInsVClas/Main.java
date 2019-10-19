package com.timbuchalka.RefVObjVInsVClas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        House bluehouse = new House("blue","Detached house",4,1);
        House anotherhouse = bluehouse;

        System.out.println("BLUEHOUSE:");
        System.out.println("\n\t\tColor:"+bluehouse.getColor()
                          +"\n\t\tType:"+bluehouse.getType()
                          +"\n\t\tDoors:"+bluehouse.getDoors()
                          +"\n\t\tWindows:"+bluehouse.getWindows());
        System.out.println("ANOTHERHOUSE:");
        System.out.println("\n\t\tColor:"+anotherhouse.getColor()
                          +"\n\t\tType:"+anotherhouse.getType()
                          +"\n\t\tDoors:"+anotherhouse.getDoors()
                          +"\n\t\tWindows:"+anotherhouse.getWindows());

        anotherhouse.setColor("red");
        anotherhouse.setType("Apartment building");
        anotherhouse.setDoors(2);
        anotherhouse.setWindows(25);

        System.out.println("BLUEHOUSE:");
        System.out.println("\n\t\tColor:"+bluehouse.getColor()
                +"\n\t\tType:"+bluehouse.getType()
                +"\n\t\tDoors:"+bluehouse.getDoors()
                +"\n\t\tWindows:"+bluehouse.getWindows());
        System.out.println("ANOTHERHOUSE:");
        System.out.println("\n\t\tColor:"+anotherhouse.getColor()
                +"\n\t\tType:"+anotherhouse.getType()
                +"\n\t\tDoors:"+anotherhouse.getDoors()
                +"\n\t\tWindows:"+anotherhouse.getWindows());


        House greenhouse = new House("green","Villa",6,3);
        anotherhouse = greenhouse;

        System.out.println("BLUEHOUSE:");
        System.out.println("\n\t\tColor:"+bluehouse.getColor()
                +"\n\t\tType:"+bluehouse.getType()
                +"\n\t\tDoors:"+bluehouse.getDoors()
                +"\n\t\tWindows:"+bluehouse.getWindows());
        System.out.println("ANOTHERHOUSE:");
        System.out.println("\n\t\tColor:"+anotherhouse.getColor()
                +"\n\t\tType:"+anotherhouse.getType()
                +"\n\t\tDoors:"+anotherhouse.getDoors()
                +"\n\t\tWindows:"+anotherhouse.getWindows());
        System.out.println("GREENHOUSE:");
        System.out.println("\n\t\tColor:"+greenhouse.getColor()
                +"\n\t\tType:"+greenhouse.getType()
                +"\n\t\tDoors:"+greenhouse.getDoors()
                +"\n\t\tWindows:"+greenhouse.getWindows());

    }
}
