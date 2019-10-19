package itSovy;

public class Animal {

    private String name;

    public Animal(String name){

        this.name=name;
    }

    public void getSound(){
        System.out.println("neviem aky zvuk bo neznam co to za kreatura je");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
