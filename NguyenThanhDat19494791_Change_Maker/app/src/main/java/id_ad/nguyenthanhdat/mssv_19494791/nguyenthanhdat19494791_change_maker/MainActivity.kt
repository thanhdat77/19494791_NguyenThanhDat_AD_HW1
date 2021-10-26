package id_ad.nguyenthanhdat.mssv_19494791.nguyenthanhdat19494791_change_maker

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var saveState: String? = ""


    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickKeypad()
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("txtInput", findViewById<TextView>(R.id.value).text.toString())
        outState.putString("save", saveState)
        super.onSaveInstanceState(outState)
        change()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        findViewById<TextView>(R.id.value).text = savedInstanceState.getString("txtInput")
        saveState = savedInstanceState.getString("save").toString()
        change()
    }

    private fun onClickKeypad() {
        val zero = findViewById<Button>(R.id.zeroBNT)
        zero.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"0"
            change()
        }

        val one = findViewById<Button>(R.id.oneBNT)
        one.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"1"
            change()


        }

        val two = findViewById<Button>(R.id.twoBNT)
        two.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"2"
            change()

        }

        val three = findViewById<Button>(R.id.threeBNT)
        three.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"3"
            change()
        }

        val four = findViewById<Button>(R.id.fourBNT)
        four.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"4"
            change()
        }

        val five = findViewById<Button>(R.id.fiveBNT)
        five.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"5"
            change()

        val six = findViewById<Button>(R.id.sixBNT)
        six.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"6"
            change()
        }

        val seven = findViewById<Button>(R.id.sevenBNT)
        seven.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"7"
            change()

        }

        val eight = findViewById<Button>(R.id.eightBNT)
        eight.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"8"
            change()
        }

        val nine = findViewById<Button>(R.id.nineBNT)
        nine.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            val str: String = price.text.toString()
            price.text = str+"9"
            change()
        }

        val clear = findViewById<Button>(R.id.clearBNT)
        clear.setOnClickListener {
            var price = findViewById<TextView>(R.id.value)
            price.text = ""
            change()
        }



}
    }
    private fun change(){
    val price = findViewById<TextView>(R.id.value)
        var v: Int = if (price.text.toString()=="") 0 else (price.text.toString().toInt())
        val twentyd = findViewById<TextView>(R.id.twentyd)
        val d20 = (v/2000)
        twentyd.text = d20.toString()
        val tend = findViewById<TextView>(R.id.tend)
        val d10 = (v-d20*2000)/1000
        tend.text = d10.toString()
        val fived = findViewById<TextView>(R.id.fived)
        val d5 =(v-d20*2000-d10*1000)/500
        fived.text = d5.toString()
        val oned = findViewById<TextView>(R.id.oned)
        val d1 = (v-d20*2000-d10*1000-d5*500)/100
        oned.text = d1.toString()
        val c25 = findViewById<TextView>(R.id.c25)
        val c25v = (v-d20*2000-d10*1000-d5*500-d1*100)/25
        c25.text =c25v.toString()
        val c10 = findViewById<TextView>(R.id.c10)
        val c10v = (v-d20*2000-d10*1000-d5*500-d1*100-c25v*25)/10
        c10.text = c10v.toString()
        val c5 = findViewById<TextView>(R.id.c5)
        val c5v =  (v-d20*2000-d10*1000-d5*500-d1*100-c25v*25-c10v*10)/5
        c5.text = c5v.toString()
        val c1 = findViewById<TextView>(R.id.c1)
        c1.text =  (v-d20*2000-d10*1000-d5*500-d1*100-c25v*25-c10v*10-c5v*5).toString()






    }


}

