import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket localServer = new ServerSocket(5); // Establish server socket


           Socket ClientSocket = localServer.accept(); // Establish socket by listening to requests
           OutputStream outputStream = ClientSocket.getOutputStream(); // Create a outer stream between 2 processes of that socket
           outputStream.write(555); // send text to the other process to communicate

         while(true); // endless loop for the process to continue running
    }
}
