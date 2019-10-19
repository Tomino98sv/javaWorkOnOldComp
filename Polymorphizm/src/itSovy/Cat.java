package itSovy;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void getSound(){
        System.out.println("mnau mnau");
    }

    public void catchMouse(){
        System.out.println("I hunting that beast");
    }
}
