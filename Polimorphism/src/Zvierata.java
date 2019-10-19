public class Zvierata {

    private int legs;
    private double weight;
    private static int count =0;

    public Zvierata(int legs, double weight) {
        this.legs = legs;
        this.weight = weight;
        count++;
    }

    public void move(int speed){
        System.out.println("moving with "+speed+" fast");
    }

    public int order(){
        return count;
    }
}
