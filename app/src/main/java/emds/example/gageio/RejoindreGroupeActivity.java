package emds.example.gageio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class RejoindreGroupeActivity extends AppCompatActivity {

    Button btnRejoindre;
    EditText edTexPrenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejoindre_groupe);
        //Partie Creation client
        btnRejoindre=(Button)findViewById(R.id.btnRejoindre);
        edTexPrenom =(EditText)findViewById((R.id.ed_TxtPe)) ;
        btnRejoindre.setOnClickListener((new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    BackgroundTask client = new BackgroundTask();
                    client.execute("localhost", edTexPrenom.getText().toString());
                }catch (Exception ex){ex.getMessage();}
                finally { OpenSalonCreer();}
            }
        }));

    }

     class BackgroundTask extends AsyncTask<String,Void,String>
    {
        Socket client;
        String host,nom;
        DataOutputStream datOutClient;
        @Override
        protected String doInBackground(String... strings)
        {
            host=strings[0];
            nom=strings[1];
            try
            {
                client=new Socket(host,8080);
                datOutClient= new DataOutputStream(client.getOutputStream());
                datOutClient.writeUTF(nom);
                datOutClient.close();
                client.close();
            }
            catch (IOException ex){ex.printStackTrace();}

            return null;
        }
    }

    public void OpenSalonCreer(){
        Intent intent=new Intent(this,SalonCreerActivity.class); //Fonction qui permet d'ouvrir une autre activité
        startActivity(intent);
    }

}
