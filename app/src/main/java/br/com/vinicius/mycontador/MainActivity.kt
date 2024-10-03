package br.com.vinicius.mycontador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.BinderThread
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var counter: Int = 0 // Variável do contador

            // Referências aos componentes da UI
            val textCounter = findViewById<TextView>(R.id.textView)
            val buttonIncrement = findViewById<Button>(R.id.buttonIncrement)
            val buttonDecrement = findViewById<Button>(R.id.buttonDecrement)
            val buttonSoma2 = findViewById<Button>(R.id.ButtonSoma2)

            // Função para incrementar o contador
            buttonIncrement.setOnClickListener {
                counter++ // Incrementa o valor do contador
                textCounter.text = counter.toString() // Atualiza o valor exibido
            }

            buttonSoma2.setOnClickListener {
                counter = counter + 2
                textCounter.text = counter.toString()
            }

            // Função para decrementar o contador
            buttonDecrement.setOnClickListener {
                counter-- // Decrementa o valor do contador
                textCounter.text = counter.toString() // Atualiza o valor exibido
            }
        }
}