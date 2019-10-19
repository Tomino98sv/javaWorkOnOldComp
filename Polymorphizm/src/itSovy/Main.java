package itSovy;

public class Main {

    public static void main(String[] args) {

        Animal vlciak = new Dog("Rex");
        System.out.println("Meno psa je: "+vlciak.getName());
        ((Dog) vlciak).aport();
        vlciak.getSound();

        Animal egyptska = new Cat("Cica");
        System.out.println("Meno macky je: "+egyptska.getName());
        ((Cat) egyptska).catchMouse();
        egyptska.getSound();

    }

}
