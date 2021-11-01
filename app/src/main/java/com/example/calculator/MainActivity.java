package com.example.calculator;

import org.mariuszgromada.math.mxparser.*;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.os.Vibrator;

public class MainActivity extends AppCompatActivity {

    int reset = 1;
    int longvib = 10;
    private Vibrator myVib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
    }
    public void sevenPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("7");
            reset = 1;
        }
        else{
            textView.append("7");
        }
        myVib.vibrate(longvib);
    }
    public void eightPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("8");
            reset = 1;
        }
        else{
            textView.append("8");
        }
        myVib.vibrate(longvib);
    }
    public void ninePressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("9");
            reset = 1;
        }
        else{
            textView.append("9");
        }
        myVib.vibrate(longvib);
    }
    public void fourPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("4");
            reset = 1;
        }
        else{
            textView.append("4");
        }
        myVib.vibrate(longvib);
    }
    public void fivePressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("5");
            reset = 1;
        }
        else{
            textView.append("5");
        }
        myVib.vibrate(longvib);
    }
    public void sixPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("6");
            reset = 1;
        }
        else{
            textView.append("6");
        }
        myVib.vibrate(longvib);
    }
    public void onePressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("1");
            reset = 1;
        }
        else{
            textView.append("7");
        }
        myVib.vibrate(longvib);
    }
    public void twoPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("2");
            reset = 1;
        }
        else{
            textView.append("2");
        }
        myVib.vibrate(longvib);
    }
    public void threePressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("3");
            reset = 1;
        }
        else{
            textView.append("3");
        }
        myVib.vibrate(longvib);
    }
    public void zeroPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("0");
            reset = 1;
        }
        else{
            textView.append("0");
        }
        myVib.vibrate(longvib);
    }
    public void clrPressed(View view){
        TextView textView = findViewById(R.id.textView);
        textView.setText("");
        myVib.vibrate(longvib);
    }
    public void dotPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText(".");
            reset = 1;
        }
        else{
            textView.append(".");
        }
        myVib.vibrate(longvib);
    }
    public void minusPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("-");
            reset = 1;
        }
        else{
            textView.append("-");
        }
        myVib.vibrate(longvib);
    }
    public void plusPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("+");
            reset = 1;
        }
        else{
            textView.append("+");
        }
        myVib.vibrate(longvib);
    }
    public void timesPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("x");
            reset = 1;
        }
        else{
            textView.append("x");
        }
        myVib.vibrate(longvib);
    }
    public void divPressed(View view){
        TextView textView = findViewById(R.id.textView);
        if(reset == 0 ){
            textView.setText("÷");
            reset = 1;
        }
        else{
            textView.append("÷");
        }
        myVib.vibrate(longvib);
    }
    public void delPressed(View view){
        myVib.vibrate(longvib);
        TextView textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        int strlen = str.length();
        if(strlen > 0 &&  reset != 0){
            str = str.substring ( 0, str.length() - 1 );
            textView.setText (str);
        }
        else{
            textView.setText("");
        }
    }
    public void equalsPressed(View view){
        TextView textView = findViewById(R.id.textView);
        String str = textView.getText().toString();
        str = str.replaceAll("÷", "/");
        str = str.replaceAll("x", "*");
        myVib.vibrate(longvib);

        Expression exp = new Expression(str);
        String result = String.valueOf(exp.calculate());
        if(str.length() > 0){
            textView.setText(result);
        }
        if(result.endsWith("0")){
            result = result.substring(0, result.length() - 2);
            textView.setText(result);
        }
        if(str.equals("111")){
            Intent intent = new Intent(this, hidden_notes.class);
            startActivity(intent);
        }
        reset = 0;
    }

}