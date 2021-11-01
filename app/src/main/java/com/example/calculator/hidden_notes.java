package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Vibrator;

public class hidden_notes extends AppCompatActivity {

    int longvib = 10;
    private Vibrator myVib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden_notes);
    }
    public void Destroy(View view){
        myVib.vibrate(longvib);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        super.onDestroy();

    }
}

