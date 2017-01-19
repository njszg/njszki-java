package main.java;

// File Name GreetingServerInstance.java
import java.net.*;
import java.io.*;

public class GreetingServerInstance extends Thread {
    private Socket client;

    public GreetingServerInstance(Socket clientSocket) throws IOException {
        client = clientSocket;
    }

    public void run() {
        try {
            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            DataInputStream in = new DataInputStream(client.getInputStream());

            System.out.println(in.readUTF());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            out.writeUTF("Thank you for connecting to " + client.getLocalSocketAddress()
                    + "\nGoodbye!");

            //client.close();
            while(true){ }

        }catch(SocketTimeoutException s) {
            System.out.println("Socket timed out!");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}