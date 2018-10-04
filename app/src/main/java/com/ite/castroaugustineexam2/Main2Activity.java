package com.ite.castroaugustineexam2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("EXAM2", "onStart() has executed");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("EXAM2", "onStop() has executed");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("EXAM2", "onPause() has executed");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("EXAM2", "onResume() has executed");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("EXAM2", "onDestroy() has executed");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("EXAM2", "onRestart() has executed");
    }

    public void onClick (View v)
    {
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button)
        {
            i = new Intent(Main2Activity.this, MainActivity.class);
            Main2Activity.this.startActivity(i);
        }
    }
}
