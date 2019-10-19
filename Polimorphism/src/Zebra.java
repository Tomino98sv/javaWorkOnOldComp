public class Zebra extends Zvierata{
    public Zebra(int legs, double weight) {
        super(legs, weight);
    }


    @Override
    public void move(int speed){
        System.out.println("This zebra moving fast "+speed);
    }

    @Override
    public int order(){
        return super.order();
    }
}
