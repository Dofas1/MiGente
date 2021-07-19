package cl.ancabi.migente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmaDatos extends AppCompatActivity {
    private TextView txtDescripcion;
    private TextView txtFechaNac;
    private EditText txtTelefono;
    private EditText txtEmail;
    private TextView txtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this,"on create Confirma Datos",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_confirma_datos);
        //Obtiene los valores enviados en el Intent
        Bundle datos = getIntent().getExtras();
        String FechaNac     = datos.getString(getResources().getString(R.string.pFechaNac));
        String Descripcion  = datos.getString(getResources().getString(R.string.pDescripcion));
        String Email        = datos.getString(getResources().getString(R.string.pEmail));
        String Telefono     = datos.getString(getResources().getString(R.string.pTelefono));
        String Nombre       = datos.getString(getResources().getString(R.string.pNombre));

        Log.i("1confirma click",String.valueOf( FechaNac));
        Log.i("2confirma click",String.valueOf( Descripcion));
        Log.i("3confirma click",String.valueOf( Email));
        Log.i("4confirma click",String.valueOf( Telefono));
        Log.i("5confirma click",String.valueOf( Nombre));

        // instancio los contenedores para trabajar sobre ellos

        txtDescripcion = (TextView)findViewById(R.id.txtDescripcion);
        txtFechaNac    = (TextView)findViewById(R.id.textView4);
        txtTelefono    = (EditText)findViewById(R.id.editTextPhone);
        txtEmail       = (EditText)findViewById(R.id.editTextTextEmailAddress);
        txtNombre      = (TextView)findViewById(R.id.txtNombre);
        //Paso valores del Intent a los contenedores

        txtDescripcion.setText(Descripcion);
        txtFechaNac.setText(FechaNac);
        txtTelefono.setText(Telefono);
        txtEmail.setText(Email);
        txtNombre.setText(Nombre);


        Button btn_back = (Button)findViewById(R.id.button);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (R.id.button == v.getId()) {
                    ConfirmaDatos.super.onBackPressed();
                }
            }
        });
    }
    protected  void onStart(){
        super.onStart();
        //Toast.makeText(this,"on start Confirma Datos",Toast.LENGTH_LONG).show();
    }
    protected  void onResume(){
        super.onResume();
        //Toast.makeText(this,getResources().getString(R.string.onresume),Toast.LENGTH_LONG).show();
    }
    protected  void onRestart(){
        super.onRestart();
        //Toast.makeText(this,getResources().getString(R.string.onrestart),Toast.LENGTH_LONG).show();
    }
    protected  void onPause(){
        super.onPause();
        //Toast.makeText(this,getResources().getString(R.string.onpause),Toast.LENGTH_LONG).show();
    }
    protected  void onStop(){
        super.onStop();
        //Toast.makeText(this,getResources().getString(R.string.onstop),Toast.LENGTH_LONG).show();
    }
    protected  void onDestroy(){
        super.onDestroy();
        //Toast.makeText(this,getResources().getString(R.string.ondestroy),Toast.LENGTH_LONG).show();
    }
}