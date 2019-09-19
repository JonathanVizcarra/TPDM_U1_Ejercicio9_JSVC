package mx.edu.ittepic.tpdm_u1_ejercicio9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var campoN : EditText ?= null
    var campoM : EditText ?= null
    var botonCalcular : Button ?= null
    var campoTabla : TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        campoN = findViewById(R.id.n)
        campoM = findViewById(R.id.m)
        botonCalcular = findViewById(R.id.calcular)
        campoTabla = findViewById(R.id.tabla)

        botonCalcular?.setOnClickListener {
            var n = campoN?.text.toString().toInt()
            var m = campoM?.text.toString().toInt()
            var tabla = ""
            (1..m).forEach {
                var r = it*n
                tabla = tabla+n+" x "+it+" = "+r+"\n"
            }
            campoTabla?.setText(tabla)
        }
    }
}
