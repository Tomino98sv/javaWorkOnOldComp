package itSovy;

public class Dog extends Animal {


    public Dog( String name) {
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
        System.out.println("haf haf");
    }

    public void aport(){
        System.out.println("I AM RUNNING FOR A BALL");
    }
}
