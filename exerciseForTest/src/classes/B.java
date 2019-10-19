package classes;

import interfaces.InterfaceThree;
import interfaces.InterfaceTwo;

public abstract class B extends A implements InterfaceTwo, InterfaceThree {

    public B(){
        System.out.println("Constructor B");
    }

    public void Hello(){
        System.out.println("I am class B ");
    }

    public void showB(){
        System.out.println("I am show method");
    }

    @Override
    public void print(){
        super.print();
        System.out.println("I am print method from B class");
    }

    public String message(String mess) {
        System.out.println("Sending mess from B class");
        return super.message(mess);
    }

    public void methodB(){
        System.out.println("Method B");
    }
}
