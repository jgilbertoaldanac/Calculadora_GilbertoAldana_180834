package aldana.gilberto.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var total: Int = 0
        var operacion: String = ""
        var escritura: String =""
        var operador: String = ""
        var num1: Int = 0
        var num2: Int = 0

        val campo1: TextView = findViewById(R.id.tv_resultado)
        val campo2: TextView = findViewById(R.id.tv_operacion)
        val button0: Button = findViewById(R.id.btn_0)
        button0.setOnClickListener {
            escritura += "0"
            campo1.setText(escritura)
        }
        val button1: Button = findViewById(R.id.btn_1)
        button1.setOnClickListener {
            escritura += "1"
            campo1.setText(escritura)
        }
        val button2: Button = findViewById(R.id.btn_2)
        button2.setOnClickListener {
            escritura += "2"
            campo1.setText(escritura)
        }
        val button3: Button = findViewById(R.id.btn_3)
        button3.setOnClickListener {
            escritura += "3"
            campo1.setText(escritura)
        }
        val button4: Button = findViewById(R.id.btn_4)
        button4.setOnClickListener {
            escritura += "4"
            campo1.setText(escritura)
        }
        val button5: Button = findViewById(R.id.btn_5)
        button5.setOnClickListener {
            escritura += "5"
            campo1.setText(escritura)
        }
        val button6: Button = findViewById(R.id.btn_6)
        button6.setOnClickListener {
            escritura += "6"
            campo1.setText(escritura)
        }
        val button7: Button = findViewById(R.id.btn_7)
        button7.setOnClickListener {
            escritura += "7"
            campo1.setText(escritura)
        }
        val button8: Button = findViewById(R.id.btn_8)
        button8.setOnClickListener {
            escritura += "8"
            campo1.setText(escritura)
        }
        val button9: Button = findViewById(R.id.btn_9)
        button9.setOnClickListener {
            escritura += "9"
            campo1.setText(escritura)
        }
        val buttonsum: Button = findViewById(R.id.btn_sum)
        buttonsum.setOnClickListener {
            num1 = escritura.toInt()
            operacion = escritura + "+"
            campo2.setText(operacion)
            operador = "+"
            campo1.setText("")
            escritura=""
        }
        val buttonres: Button = findViewById(R.id.btn_res)
        buttonres.setOnClickListener {
            num1 = escritura.toInt()
            operacion = escritura + "-"
            campo2.setText(operacion)
            operador = "-"
            campo1.setText("")
            escritura=""
        }
        val buttonmul: Button = findViewById(R.id.btn_mul)
        buttonmul.setOnClickListener {
            num1 = escritura.toInt()
            operacion = escritura + "*"
            campo2.setText(operacion)
            operador = "*"
            campo1.setText("")
            escritura=""
        }
        val buttondiv: Button = findViewById(R.id.btn_div)
        buttondiv.setOnClickListener {
            num1 = escritura.toInt()
            operacion = escritura + "/"
            campo2.setText(operacion)
            operador = "/"
            campo1.setText("")
            escritura=""
        }
        val buttonigual: Button = findViewById(R.id.btn_igual)
        buttonigual.setOnClickListener {
            num2 = escritura.toInt()
            if(operador=="+"){
                total = num1 + num2
                escritura = total.toString()
                campo1.setText(total.toString())
                campo2.setText("")
            }
            if(operador=="-"){
                total = num1 - num2
                escritura = total.toString()
                campo1.setText(total.toString())
                campo2.setText("")
            }
            if(operador=="*"){
                total = num1 * num2
                escritura = total.toString()
                campo1.setText(total.toString())
                campo2.setText("")
            }
            if(operador=="/"){
                total = num1 / num2
                escritura = total.toString()
                campo1.setText(total.toString())
                campo2.setText("")
            }
        }
        val buttonc: Button = findViewById(R.id.btn_borrar)
        buttonc.setOnClickListener {
            total= 0
            operacion = ""
            escritura=""
            operador= ""
            num1= 0
            num2= 0
            campo1.setText("0")
            campo2.setText("")
        }
    }
}