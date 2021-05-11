package com.example.calculator_linear_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Double> numbers;
    ArrayList<Character> operations;
    Double number;
    String expression;
    TextView textView;
    boolean flag;
    Double decimal;
    int decimalDiv;
    String doubleString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        numbers=new ArrayList<Double>();
        operations=new ArrayList<Character>();
        number=0.0;
        expression="";
        textView=findViewById(R.id.expression);
        flag=false;
        decimal=0.0;
        decimalDiv=10;
        doubleString = "";
    }

    public void equal(View view){


    }

    public void plus(View view) {
        expression = expression.concat("+");
        Log.d("expression","in there");
        textView.setText(expression);
    }

    public void multiply(View view) {
        expression = expression.concat("*");
        textView.setText(expression);
    }

    public void minus(View view) {
        expression = expression.concat("-");
        textView.setText(expression);
        Log.d("expression",expression);
    }

    public void divide(View view) {
        expression = expression.concat("/");
        textView.setText(expression);
    }

    public void clear(View view) {
        flag=false;
        textView.setText("");
        expression="";
        number=0.0;
        numbers.clear();
        operations.clear();
        decimal=0.0;
        doubleString="";
    }

    public void zero(View view) {
        doubleString.concat("0");
        expression = expression.concat("0");
        textView.setText(expression);
    }

    public void point(View view) {
        doubleString.concat(".");
        expression = expression.concat(".");
        textView.setText(expression);
    }

    public void three(View view) {
        doubleString.concat("3");
        expression = expression.concat("3");
        textView.setText(expression);
    }

    public void two(View view) {
        expression = expression.concat("2");
        textView.setText(expression.toCharArray(),0,expression.length());
        textView.setText(expression.toString());
    }

    public void one(View view) {
        doubleString.concat("1");
        expression = expression.concat("1");
        textView.setText(expression);
    }

    public void six(View view) {
        doubleString.concat("6");
        expression = expression.concat("6");
        textView.setText(expression);
    }

    public void five(View view) {
        doubleString.concat("5");
        expression = expression.concat("5");
        textView.setText(expression);
    }

    public void four(View view) {
        doubleString.concat("4");
        expression = expression.concat("4");
        textView.setText(expression);
    }

    public void nine(View view) {
        doubleString.concat("9");
        expression = expression.concat("9");
        textView.setText(expression);
    }

    public void eight(View view) {
        doubleString.concat("8");
        expression = expression.concat("8");
        textView.setText(expression);
    }

    public void seven(View view) {
        doubleString.concat("7");
        expression = expression.concat("7");
        textView.setText(expression);
    }
}