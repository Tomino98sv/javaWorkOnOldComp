import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        Zvierata zvery[] = new Zvierata[3];

        zvery[0] = new Pes(4,25);
        zvery[1] = new Slon(4,102);
        zvery[2] = new Zebra(4,65);

        for (Zvierata zver: zvery) {
            zver.move(25);
            System.out.println("order is "+zver.order());
        }

    }
}
