package cl.awakelab.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sumar = findViewById<Button>(R.id.Sumar)
        val restar = findViewById<Button>(R.id.Restar)
        val multiplicar = findViewById<Button>(R.id.Multiplicar)
        val dividir = findViewById<Button>(R.id.Dividir)
        val editTextPrimerNumero = findViewById<EditText>(R.id.editTextPrimerNumero)
        val editTextSegundoNumero = findViewById<EditText>(R.id.editTextSegundoNumero)
        sumar.setOnClickListener(View.OnClickListener {
            if (editTextPrimerNumero.text.toString().trim { it <= ' ' }
                    .isEmpty() || editTextSegundoNumero.text.toString().trim { it <= ' ' }
                    .isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = editTextPrimerNumero.text.toString().toInt()
            val segundo = editTextSegundoNumero.text.toString().toInt()
            val suma = primer + segundo
            Toast.makeText(baseContext, "resultado: $suma", Toast.LENGTH_LONG).show()
        })
        restar.setOnClickListener(View.OnClickListener {
            if (editTextPrimerNumero.text.toString().trim { it <= ' ' }
                    .isEmpty() || editTextSegundoNumero.text.toString().trim { it <= ' ' }
                    .isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = editTextPrimerNumero.text.toString().toInt()
            val segundo = editTextSegundoNumero.text.toString().toInt()
            val resta = primer - segundo
            Toast.makeText(baseContext, "resultado: $resta", Toast.LENGTH_LONG).show()
        })
        multiplicar.setOnClickListener(View.OnClickListener {
            if (editTextPrimerNumero.text.toString().trim { it <= ' ' }
                    .isEmpty() || editTextSegundoNumero.text.toString().trim { it <= ' ' }
                    .isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = editTextPrimerNumero.text.toString().toInt()
            val segundo = editTextSegundoNumero.text.toString().toInt()
            val resultadoMultiplicar = primer * segundo
            Toast.makeText(baseContext, "resultado: $resultadoMultiplicar", Toast.LENGTH_LONG).show()
        })
        dividir.setOnClickListener(View.OnClickListener {
            if (editTextPrimerNumero.text.toString().trim { it <= ' ' }
                    .isEmpty() || editTextSegundoNumero.text.toString().trim { it <= ' ' }
                    .isEmpty()) {
                Toast.makeText(baseContext, "faltan numeros a ingresar ", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            val primer = editTextPrimerNumero.text.toString().toInt()
            if (editTextSegundoNumero.text.toString().toInt() == 0) {
                Toast.makeText(baseContext, "no se puede dividir por 0: ", Toast.LENGTH_SHORT)
                    .show()
                return@OnClickListener
            }
            val segundo = editTextSegundoNumero.text.toString().toInt()
            val division = primer / segundo
            Toast.makeText(baseContext, "resultado: $division", Toast.LENGTH_LONG).show()
        })
    }
}