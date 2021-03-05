package emds.example.gageio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnCreePartie;
    private Button btnRejoindrePartie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCreePartie=(Button)findViewById(R.id.btnCreePartie);
        btnRejoindrePartie=(Button)findViewById(R.id.btnRejoindrePartie);

        btnRejoindrePartie.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenRejoindreGroupe();
            }
        }));

        btnCreePartie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  OpenCreeGrooupe();
            }
        });
    }
    public void OpenCreeGrooupe(){
        Intent intent=new Intent(this,CreerGroupeActivity.class); //Fonction qui permet d'ouvrir une autre activité
        startActivity(intent);
    }

    public  void OpenRejoindreGroupe(){
        Intent intent=new Intent(this,RejoindreGroupeActivity.class); //Fonction qui permet d'ouvrir une autre activité
        startActivity(intent);
    }
}
