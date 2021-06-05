package com.example.screencoordinatesofclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        /*
        btn = findViewById(R.id.button);
        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    Log.d("x-cordinate",String.valueOf(event.getX()));
                    Log.d("y-cordinate",String.valueOf(event.getY()));
                }
                return true;
            }
        });
         */
    }


    public void Home(View view) throws InterruptedException {
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
        for(int i=0;i<10;i++)
        {
            Log.d("cordin","on home but running app");
            Thread.sleep(2000);
        }
    }
}