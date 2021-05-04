package com.example.constraintpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText);
    }

    public void EnterClicked(View view) {
        Toast.makeText(MainActivity.this,"Welcome ",Toast.LENGTH_LONG);
        String text = editText.getText().toString();
        Toast.makeText(MainActivity.this,"Welcome "+text,Toast.LENGTH_LONG);
    }
}