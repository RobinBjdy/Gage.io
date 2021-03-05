package emds.example.gageio;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client{
        private String nomClient;
        private Socket socketClient;
        private  Scanner scClient;
        private PrintStream prClient;
        private String message;

        public Client(String host,int port)
        {
            SocketCLient(host,port);
        }

        public String GetNomCkient()
        {
            return this.nomClient;
        }

        public void SetNomCLient(String nom)
        {
            this.nomClient=nom;
        }
    private void SocketCLient(String host,int port)
    {
        try {
            this.socketClient = new Socket(host, port);
            this.socketClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void EnvoyerMessage(String message)
    {
        this.prClient.println(message);
        this.prClient.flush();
    }

    public String EcrirMessage(String message)
    {
        this.scClient  = new Scanner(System.in);
        try {
            this.prClient = new PrintStream(this.socketClient.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
       return this.message = this.scClient.nextLine();
    }
}



