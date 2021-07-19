package cl.ancabi.migente;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Date fechaNac;
    EditText TxtFechaNac;
    EditText TxtDescripcion;
    EditText TxtEmail;
    EditText TxtTelefono;
    EditText Txt_Nombre;
    Button btn_sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toast.makeText(this,getResources().getString(R.string.oncreate),Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        fechaNac=new Date();
        TxtFechaNac    = (EditText) findViewById(R.id.TxtFechaNac);
        btn_sig          =(Button)   findViewById(R.id.btnSiguiente);
        TxtDescripcion =(EditText) findViewById(R.id.TxtDescripcion);
        TxtEmail       =(EditText) findViewById(R.id.TxtEmail);
        TxtTelefono    =(EditText) findViewById(R.id.TxtTelefono);
        Txt_Nombre     =(EditText) findViewById(R.id.Txt_Nombre);

        TxtFechaNac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (R.id.TxtFechaNac == view.getId()) {
                        showDatePickerDialog(view);
                }
            }
        });

        btn_sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (R.id.btnSiguiente == v.getId()) {

                    Intent intent = new Intent(MainActivity.this, ConfirmaDatos.class);
                    intent.putExtra(getResources().getString(R.string.pFechaNac),String.valueOf(TxtFechaNac.getText()));
                    Log.i("1on click", String.valueOf(TxtFechaNac.getText()));
                    intent.putExtra(getResources().getString(R.string.pDescripcion), String.valueOf(TxtDescripcion.getText()));
                    Log.i("2on click", String.valueOf(TxtDescripcion.getText()));
                    intent.putExtra(getResources().getString(R.string.pEmail), String.valueOf(TxtEmail.getText()));
                    Log.i("3on click", String.valueOf(TxtEmail.getText()));
                    intent.putExtra(getResources().getString(R.string.pTelefono), String.valueOf(TxtTelefono.getText()));
                    Log.i("4on click", String.valueOf(TxtTelefono.getText()));
                    intent.putExtra(getResources().getString(R.string.pNombre), String.valueOf(Txt_Nombre.getText()));
                    Log.i("5on click", String.valueOf(Txt_Nombre.getText()));
                    startActivity(intent);
                }
            }
        });
           }
    protected  void onStart(){
        super.onStart();
        //Toast.makeText(this,getResources().getString(R.string.onstart),Toast.LENGTH_LONG).show();
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

    private void showDatePickerDialog(View view) {
        EditText miTextView =(EditText)view;
        DatePickerFragment newFragment = DatePickerFragment.newInstance(new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                // +1 because January is zero
                final String selectedDate = day + " / " + (month+1) + " / " + year;
                TxtFechaNac.setText(selectedDate);
            }
        });

        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

}

