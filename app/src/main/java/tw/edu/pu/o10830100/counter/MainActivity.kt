package tw.edu.pu.o10830100.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),
View.OnClickListener {

    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        img.setOnClickListener(this)
        //btn4.setOnClickListener(this)

        btn4.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                counter=(1..100).random()
                txv.text = counter.toString()
            }

        })
    }
    fun AddOne(v: View){
        counter++
        txv.text = counter.toString()
    }
    fun AddTwo(v: View){
        //counter = counter = + 2
        counter += 2
        txv.text = counter.toString()
    }
    fun Add(v: View){
        if(v == btn1) {
            counter++
        }
        else if(v==btn2){
            counter+=2
        }
        else{
            counter=0
        }
        txv.text = counter.toString()
    }

    override fun onClick(v: View?) {
      if (v==txv) {
          counter++
      }
      else if (v==img){
          counter+=2
      }
        /*
        else{
          counter=(1..100).random()
          txv.text = counter.toString()
      }*/
        txv.text = counter.toString()
    }
}