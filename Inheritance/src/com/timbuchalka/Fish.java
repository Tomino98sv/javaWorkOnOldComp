package com.timbuchalka;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String thname,int thsize, int thweight, int gills, int eyes, int fins) {

        super(thname, 1, 1, thsize, thweight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFinn(){

    }

    private void swim(int  speed){
        moveMuscles();
        moveBackFinn();
        super.move(speed);
    }


}
