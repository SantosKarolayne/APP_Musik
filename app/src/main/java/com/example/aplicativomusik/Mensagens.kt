import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativomusik.R

class Mensagens : AppCompatActivity() {

    private lateinit var editTextMessage: EditText
    private lateinit var textViewMessages: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextMessage = findViewById(R.id.editTextMessage)
        val buttonSend: Button = findViewById(R.id.buttonSend)
        textViewMessages = findViewById(R.id.textViewMessages)

        buttonSend.setOnClickListener {
            enviarMensagem()
        }
    }

    private fun enviarMensagem() {
        val mensagem = editTextMessage.text.toString()

        if (mensagem.isNotBlank()) {
            // Adicione a mensagem à TextView
            val mensagensAnteriores = textViewMessages.text.toString()
            val novaMensagem = "$mensagensAnteriores\n$mensagem"
            textViewMessages.text = novaMensagem

            // Limpar o campo de texto após o envio, se necessário
            editTextMessage.text.clear()
        }
    }
}