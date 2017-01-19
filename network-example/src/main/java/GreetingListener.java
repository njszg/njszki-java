package main.java;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingListener extends Thread {
        private ServerSocket serverSocket;

        public GreetingListener(int port) throws IOException {
            serverSocket = new ServerSocket(port);
            //serverSocket.setSoTimeout(10000);
        }

        public void run() {
            while(true) {
                try {
                    System.out.println("Waiting for client on port " +
                            serverSocket.getLocalPort() + "...");
                    Socket client = serverSocket.accept();

                    Thread t = new GreetingServerInstance(client);
                    t.start();

                }catch(SocketTimeoutException s) {
                    System.out.println("Socket timed out!");
                    break;
                }catch(IOException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }

        public static void main(String [] args) {
            int port = Integer.parseInt(args[0]);

            try {
                Thread t = new GreetingListener(port);
                t.start();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }