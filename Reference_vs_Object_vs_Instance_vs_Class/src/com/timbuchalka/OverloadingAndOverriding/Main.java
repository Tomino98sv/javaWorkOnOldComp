package com.timbuchalka.OverloadingAndOverriding;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args){

        HealthyBurger order1 = new HealthyBurger("Ketchup",2,3,2,4,3,3);
        Burger order2 = new Burger("Beef","Muster",2,2,2,4,3,4);
        System.out.println(order1.Details());
        System.out.println("\n\n"+order2.Details());
    }

}
