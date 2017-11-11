package com.keepcoding.gueder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button



class MainActivity : AppCompatActivity(), View.OnClickListener {


    //var stone: Button? = null
    //var burro: Button? = null



    val TAG = MainActivity::class.java.canonicalName



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stone =findViewById<Button>(R.id.stone).setOnClickListener(this)
        var burro = findViewById<Button>(R.id.burro).setOnClickListener(this)

      


        Log.v(TAG, "He pasado por oncreate")

    }

    //TODO: somos los pendejos


    override fun onSaveInstanceState(outState: Bundle?) {

    super.onSaveInstanceState(outState)
        Log.v(TAG, "paso por errr save" )

 //       if (outState != null)
 //       {
 //           outState.putString("clave","valor")
 //       }


        outState?.putString("clave","valor")

    }

    override fun onClick(v: View?) {
       Log.v(TAG, "hemos pulsado un boton")

        /*
        if(v != null)
        {
            if (v.getId() == R.id.stone) {
                Log.v(TAG, "hemos pulsado piedra")
            } else {
                Log.v(TAG, "hemos pulsado burro")
            }
        }



        when(v?.id)
        {
            R.id.stone -> {
var a =5
                var c =7
                Log.v(TAG, "hemos pulsado piedra")

            }
            R.id.burro -> Log.v(TAG, "hemos pulsado burro")
            else ->Log.v(TAG, "ERROR")

        }

        */


        Log.v(TAG,when (v?.id){
            R.id.stone -> "hemos pulsado piedra"
            R.id.burro -> "hemos pulsado burro"
            else -> "ERROR"

        })

    }



}
