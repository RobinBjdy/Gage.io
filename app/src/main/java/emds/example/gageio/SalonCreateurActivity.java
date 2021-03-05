package emds.example.gageio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SalonCreateurActivity extends AppCompatActivity {

    private Button btnCommencer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon_createur);

        btnCommencer=(Button)findViewById(R.id.btnCommencer);

        btnCommencer.setOnClickListener((new View.OnClickListener() {

            public void onClick(View view) {
                OpenSalonCreer();
            }
        }));

    }

    public void OpenSalonCreer(){
        Intent intent=new Intent(this,SalonPartieActivity.class); //Fonction qui permet d'ouvrir une autre activité
        startActivity(intent);
    }
}
