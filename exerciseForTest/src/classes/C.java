package classes;

public class C extends B{

    public C(){
        System.out.println("Constructor C");
    }

    public void Hello(){
        System.out.println("I am class C ");
        super.Hello();
}

    @Override
    public void print() {
        super.print();
        System.out.println("I am print method from C class");
    }

    @Override
    public String message(String mess) {
        System.out.println("Sending mess from C class");
        return super.message(mess);
    }

    public void methodC(){
        System.out.println("Method C");
    }

}
