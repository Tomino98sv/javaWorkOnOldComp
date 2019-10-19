import java.util.Random;

public class Vlakno implements Runnable{

    private Thread t;
    private String name;

    public Vlakno(String name) {
        this.name = name;
        System.out.println(name + " has been created!");
    }

    @Override
    public void run() {
        System.out.println("thread " + this.name +" is running");
        try {
            for(int i = 1; i<=5; i++){
                int vypis = getTimeMs();
                System.out.println(vypis);
                Thread.sleep(vypis);
                System.out.println(name+ " count " + i);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name+ " finished");
    }

    public void startXXX(){
        System.out.println(this.name + " started");
        if(t ==null){
            t = new Thread(this, this.name);
            t.start();
        }

    }

    public int getTimeMs(){
        Random random = new Random();
        return random.nextInt(4000)+1000;
    }
}
