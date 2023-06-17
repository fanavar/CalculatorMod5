package cl.awakelab.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sumar = findViewById(R.id.Sumar);
        Button restar = findViewById(R.id.Restar);
        Button multiplicar = findViewById(R.id.Multiplicar);
        Button dividir = findViewById(R.id.Dividir);

        EditText editTextPrimerNumero = findViewById(R.id.editTextPrimerNumero);
        EditText editTextSegundoNumero = findViewById(R.id.editTextSegundoNumero);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextPrimerNumero.getText().toString().trim().isEmpty()|| editTextSegundoNumero.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer primer = Integer.parseInt(editTextPrimerNumero.getText().toString());
                Integer segundo = Integer.parseInt(editTextSegundoNumero.getText().toString());
                Integer suma = primer + segundo;
                Toast.makeText(getBaseContext(),"resultado: "+ suma.toString(),Toast.LENGTH_LONG).show();

            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextPrimerNumero.getText().toString().trim().isEmpty()|| editTextSegundoNumero.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer primer = Integer.parseInt(editTextPrimerNumero.getText().toString());
                Integer segundo = Integer.parseInt(editTextSegundoNumero.getText().toString());
                Integer resta = primer - segundo;
                Toast.makeText(getBaseContext(),"resultado: "+ resta.toString(),Toast.LENGTH_LONG).show();
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextPrimerNumero.getText().toString().trim().isEmpty()|| editTextSegundoNumero.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer primer = Integer.parseInt(editTextPrimerNumero.getText().toString());
                Integer segundo = Integer.parseInt(editTextSegundoNumero.getText().toString());
                Integer multiplicar = primer * segundo;
                Toast.makeText(getBaseContext(),"resultado: "+ multiplicar.toString(),Toast.LENGTH_LONG).show();
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextPrimerNumero.getText().toString().trim().isEmpty()|| editTextSegundoNumero.getText().toString().trim().isEmpty()){
                    Toast.makeText(getBaseContext(),  "faltan numeros a ingresar " , Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer primer = Integer.parseInt(editTextPrimerNumero.getText().toString());
                if( Integer.parseInt(editTextSegundoNumero.getText().toString()) == 0){
                    Toast.makeText(getBaseContext(),  "no se puede dividir por 0: " , Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer segundo = Integer.parseInt(editTextSegundoNumero.getText().toString());
                Integer division = primer / segundo;
                Toast.makeText(getBaseContext(),"resultado: "+ division.toString(),Toast.LENGTH_LONG).show();
            }
        });


    }


}