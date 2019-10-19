import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.addItem("Daj broskev");
        Box<Double> box2 = new Box<>();
        box2.addItem(25.2);
        Box<Date> box3 = new Box<>();
        box3.addItem(new Date());

        System.out.println("\nbox1="+box1.getItem()+"\nbox2= "+box2.getItem()+"\nbox3= "+box3.getItem());


    }
}
