package com.example.implement

import ListView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment_list_view = ListView()
        val manager = supportFragmentManager;
        val transaction = manager.beginTransaction();
        transaction.replace(R.id.Layout, fragment_list_view,"fragment_list_view");
        transaction.addToBackStack("fragment_list_view");
        transaction.commit();

    }
}
