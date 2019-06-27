package com.example.practiceapp4;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    private final String TAG = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "The button is working.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "v logged");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w(TAG, "w logged");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.wtf(TAG, "wtf logged");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "e logged");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "i logged");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "d logged");
    }

    @Override
    public void onClick(View view) {

    }
}
