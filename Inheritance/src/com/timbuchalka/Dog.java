package com.timbuchalka;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String thname, int thsize, int thweight, int thAeyes, int thAlegs, int thAtail, int thAteeth, String thAcoat) {

        super(thname, 1, 1, thsize, thweight);
        this.eyes = thAeyes;
        this.legs = thAlegs;
        this.tail = thAtail;
        this.teeth = thAteeth;
        this.coat = thAcoat;
    }

    private void chew(){
        System.out.println("dog.chew() method called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() method called");
        chew();
        super.eat();
    }

    public void run(){
        System.out.println("dog.run() method called");
        move(10);
    }

    public void walk(){
        System.out.println("walk.run() method called");
        super.move(5);
    }

    public void moveLegs(int speed){
        System.out.println("dog.moveLeg() method called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() method called");
        moveLegs(speed);
        super.move(speed);
    }

}
