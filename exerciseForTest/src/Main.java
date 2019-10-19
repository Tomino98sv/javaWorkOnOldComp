import classes.*;
import genericType.Mobile;
import genericType.Stack;

public class Main {

    public static void main(String[] args) {

        /*


        B b1 = new C(); // print Constructor A, Constructor B, Constructor C
        A a1 = new C(); // print Constructor A, Constructor B, Constructor C   lebo rodic moze vytvorit dieta
        C c2 = (C) new A(); //cast class A to class C print java.lang.ClassCastException: classes.A cannot be cast to classes.C
        C c1 = new C(); // print Constructor A, Constructor B, Constructor C
        c1.print();
        */

//        C c = new D();
//        c.print();
//        c.Hello();
//        c.message("ahoj");
//
        A a = new C();
        C c = (C) a;
        E e = new E();
        a.methodA();
        ((C) a).methodC();

        Object obj = new Object();
        obj.
//        c.Hello();

        Stack<Mobile> stackM = new Stack<>();
        stackM.insert(new Mobile("ASUS",2,"Android",4));
        stackM.insert(new Mobile("IPhone",3,"IOS",4));
        stackM.getFirst();
        stackM.getLast();
    }
}
