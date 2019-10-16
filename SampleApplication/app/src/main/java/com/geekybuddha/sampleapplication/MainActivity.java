package com.geekybuddha.sampleapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Log.d(TAG, "onCreate() called!");
    }

    //onStart callbacks
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart() called!");
    }

    //
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called!");
    }

    //
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called!");

    }

    //
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() called!");
    }

    //
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called!");
    }

    //
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called!");
    }


    //
    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        Log.d(TAG,"onPostCreate() called!");
    }


    //
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG,"onPostResume() called!");
    }

    //
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG,"onSaveInstanceState() called!");

    }

    //
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"onRestoreInstanceState() called!");

    }

    // menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
