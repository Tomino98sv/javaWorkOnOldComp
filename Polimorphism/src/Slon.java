public class Slon extends Zvierata {
    public Slon(int legs, double weight) {
        super(legs, weight);
    }


    @Override
    public void move(int speed){
        System.out.println("This elephant fast "+speed);
    }

    @Override
    public int order(){
        return super.order();
    }
}
