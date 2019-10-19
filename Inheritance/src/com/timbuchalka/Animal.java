package com.timbuchalka;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String thname,int thbrain,int thbody,int thsize,int thweight){
        this.name = thname;
        this.brain = thbrain;
        this.body = thbody;
        this.size = thsize;
        this.weight = thweight;
    }

    public void move(int speed){
        System.out.println("Animal is moving at "+speed);
    }

    public void eat(){
        System.out.println("animal.eat() method called");
    }

    public String getName(){
        return name;
    }

    public int getBrain(){
        return brain;
    }

    public int getBody(){
        return body;
    }

    public int getSize(){
        return size;
    }

    public int getWeight(){
        return weight;
    }

}
