package mx.edu.tesoem.diana.itics.examen7t11;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import mx.edu.tesoem.diana.itics.examen7t11.R;

public class MPrincipalActivity extends AppCompatActivity {

    TextView vnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mprinciapal);

        vnombre = (TextView) findViewById(R.id.txtnombre);

    }

    public void Mandarsaludo(View v){
        Intent vsaludo = new Intent(this, PSaludoActivity.class);
        vsaludo.putExtra("nombre", vnombre.getText().toString());
        startActivity(vsaludo);
    }

    public void MensajeEmerge(View v){
        Toast.makeText(this,"Bienvenido " + vnombre.getText().toString(),Toast.LENGTH_LONG).show();
    }

    public void Loperaciones(View v){
        Intent intent = new Intent(this, MOperacionesActivity.class);
        startActivity(intent);
    }
}
