package classes;

import interfaces.InterfaceOne;

public class D extends C {
    public D(){
        System.out.println("Constructor D");
    }

    @Override
    public void Hello() {
        System.out.println("I am class D ");
    }
}
