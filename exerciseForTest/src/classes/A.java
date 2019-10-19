package classes;

import interfaces.InterfaceOne;
import interfaces.InterfaceTwo;

public class A implements InterfaceOne, InterfaceTwo {

    public A(){
        System.out.println("Constructor A");
    }

    public void Hello(){
        System.out.println("I am class A ");
    }

    public void aboutA(){
        System.out.println("I am about method");
    }

    @Override
    public void print() {
        System.out.println("I am print method from A class");
    }

    @Override
    public String message(String mess) {
        System.out.println("I am returning mess from A class");
        return mess;
    }

    public void methodA(){
        System.out.println("Method A");
    }
}
