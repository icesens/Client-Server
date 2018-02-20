import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

            Socket clientSocket = new Socket("localhost", 5); // Create a socket and connect to specified address
            InputStream InputStream = clientSocket.getInputStream(); // Create receiving channel

             while(true) System.out.println(InputStream.read());
    }

}
