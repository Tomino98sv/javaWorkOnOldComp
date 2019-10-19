public class Data {

    private String packetNumb; //current data work with
    private boolean controller = true; //true for sender starting first and receiver waiting

    //controller TRUE receiver waitting for sender to send message
    //controller FALSE sender waitting for receiver to receive message

    public synchronized void send(String packetNumb){
        while (!controller){
            try {
                wait(); //Sender waitting
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted");
                System.out.println(e.getMessage());
            }
        }

        controller = false;
        this.packetNumb = packetNumb;
        notifyAll();
    }

    public synchronized  String receive(){
        while (controller){
            try {
                wait(); //Receiver waitting
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted ");
                System.out.println(e.getMessage());
            }
        }

        controller = true;

        notifyAll();
        return packetNumb;
    }




}
