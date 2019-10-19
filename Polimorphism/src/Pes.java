public class Pes extends Zvierata{

    public Pes(int legs, double weight) {
        super(legs, weight);
    }

    @Override
    public void move(int speed){
        System.out.println("This dog fast "+speed);
    }

    @Override
    public int order(){
        return super.order();
    }
}