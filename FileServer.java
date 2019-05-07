import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(7);
        Socket clientSocket = socket.accept();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hoju\\IdeaProjects\\Networking\\test.txt"));
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);


        String out;
        while ((out = reader.readLine()) != null){
            writer.println(out);
        }

    }
}
