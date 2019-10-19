import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	    try(ServerSocket serverSocket = new ServerSocket(5000)) {
            Socket socket = serverSocket.accept(); //accept method's gonna block into a client that connects to the server
            System.out.println("Client Connected");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true); //*1

            while (true){
                String echoString = input.readLine(); // call bufferedreader
                if (echoString.equals("exit")) {  //if receives this string from client
                    break;
                }
                output.printf("Echo from server: "+echoString);
            }

        }catch (IOException ex){
            System.out.println("Server expectation "+ ex.getMessage());
        }
    }
}

//*1 = true is automatically flush the output stream, if not then call flush method after every write to the stream to ensure data send