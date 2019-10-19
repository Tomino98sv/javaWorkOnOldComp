import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable{
    private Data data;

    public Sender(Data data){
        this.data=data;
    }

    @Override
    public void run() {
        String packets[] = randomNumber();

        for (String number : packets){
            data.send(number);

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String[] randomNumber(){
        String[] result= new String[11];
        Random random = new Random();
        for (int a=0;a<10;a++){
            result[a]=String.valueOf(a+1);
        }
        result[10]="End";

        for (int a=0;a<30;a++){
            int index1 = random.nextInt(10);
            int index2 = random.nextInt(10);
            String temp = result[index1];
            result[index1] = result[index2];
            result[index2] = temp;
        }

        return result;
    }
}
