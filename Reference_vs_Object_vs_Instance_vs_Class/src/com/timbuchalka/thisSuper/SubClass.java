package com.timbuchalka.thisSuper;

public class SubClass extends SuperClass {

    public void printMethod(){

        super.printMethod();
        System.out.println("Printed in SubClass");
    }
}
