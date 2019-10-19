package com.timbuchalka.OverloadingAndOverriding;

public class BurgerFactory{


    public Burger createBurger(String meatKind, String sauce, int meat, int salad, int roll, int onion, int tomato, int pickle){
        return new Burger(meatKind,sauce,meat,salad,roll,onion,tomato,pickle);
    }


}
