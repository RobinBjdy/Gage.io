package emds.example.gageio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.io.IOException;

import android.widget.TextView;

public class CreerGroupeActivity extends AppCompatActivity {

     TextView prenom;

    private Button btnPartie;

    public CreerGroupeActivity() throws IOException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creer_groupe);

        btnPartie=(Button)findViewById(R.id.btnPartie);

        btnPartie.setOnClickListener((new View.OnClickListener() {

            public void onClick(View view) {
                OpenSalonCreer();
            }
        }));

    }

    public void OpenSalonCreer(){
        Intent intent=new Intent(this,SalonCreateurActivity.class); //Fonction qui permet d'ouvrir une autre activité
        startActivity(intent);
    }
}
