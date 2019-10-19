package com.timbuchalka.OverloadingAndOverriding;

public class HealthyBurgerFactory extends BurgerFactory{

    @Override
    public Burger createBurger(String meatKind, String sauce, int meat, int salad, int roll, int onion, int tomato, int pickle){
        return new Burger("Tofu",sauce,meat,salad,roll,onion,tomato,pickle);
    }
}
