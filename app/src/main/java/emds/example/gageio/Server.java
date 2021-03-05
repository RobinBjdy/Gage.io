package emds.example.gageio;

import android.widget.Toast;

import java.net.*;
import java.io.*;

public class Server{

    private ServerSocket socketServer;

    {
        try {
            socketServer = new ServerSocket(8080);
            Socket s= socketServer.accept();
        //    Toast.makeText(s,"Connectée",Toast.LENGTH_SHORT).show();
        } catch (IOException e) { }
    }

}
