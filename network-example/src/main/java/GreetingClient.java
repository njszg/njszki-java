package main.java;

// File Name GreetingClient.java
import java.net.*;
import java.io.*;

public class GreetingClient {

    public static void main(String [] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket server = new Socket(serverName, port);
            System.out.println("Just connected to " + server.getRemoteSocketAddress());

            OutputStream outToServer = server.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from " + server.getLocalSocketAddress());

            InputStream inFromServer = server.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());

            //server.close();
            while(true){ }

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}