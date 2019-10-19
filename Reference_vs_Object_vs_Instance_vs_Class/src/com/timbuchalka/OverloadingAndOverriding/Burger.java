package com.timbuchalka.OverloadingAndOverriding;

public class Burger {

    private String meatKind;
    private String sauce;
    private int meat;
    private int salad;
    private int roll;
    private int onion;
    private int tomato;
    private int pickle;

    public Burger(
            String meatKind,
            String sauce,
            int meat,
            int salad,
            int roll,
            int onion,
            int tomato,
            int pickle
            ){
        this.meatKind = meatKind;
        this.sauce = sauce;
        this.meat = meat;
        this.salad = salad;
        this.roll = roll;
        this.onion = onion;
        this.tomato = tomato;
        this.pickle = pickle;
    }

    public String getMeatKind() {
        return meatKind;
    }

    public String getSauce() {
        return sauce;
    }

    public int getMeat() {
        return meat;
    }

    public int getSalad() {
        return salad;
    }

    public int getRoll() {
        return roll;
    }

    public int getOnion() {
        return onion;
    }

    public int getTomato() {
        return tomato;
    }

    public int getPickle() {
        return pickle;
    }

    public String Details(){
        String content="\nMeat kind: "+getMeatKind()+" "+
                "\nMeat count: "+getMeat()+" "+
                "\nSauce: "+getSauce()+" "+
                "\nSalad count: "+getSalad()+" "+
                "\nRoll count: "+getRoll()+" "+
                "\nOnion count: "+getOnion()+" "+
                "\nTomato count: "+getTomato()+" "+
                "\nPickle count: "+getPickle();
        return content;
    }

}