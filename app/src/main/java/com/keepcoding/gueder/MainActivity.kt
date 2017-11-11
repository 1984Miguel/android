package com.keepcoding.gueder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.canonicalName



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v(TAG, "He pasado por oncreate")

    }

    override fun onSaveInstanceState(outState: Bundle?) {

    super.onSaveInstanceState(outState)
        Log.v(TAG, "paso por errr save" )

 //       if (outState != null)
 //       {
 //           outState.putString("clave","valor")
 //       }
        

        outState?.putString("clave","valor")

    }


}
