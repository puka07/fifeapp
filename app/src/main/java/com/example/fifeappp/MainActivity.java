package com.example.fifeappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View view){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура всплывающее сообщение работает",
                Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0,0);
        myToast.show();
    }
    public void buttonClickedone(View view){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы нажали на первую обезьянку",
                Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0,0);
        myToast.show();
    }
    public void buttonClickedtwo(View view){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы нажали на вторую обезьянку",
                Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0,0);
        myToast.show();
    }public void buttonClickedthree(View view){
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы нажали на третью обезьянку",
                Toast.LENGTH_LONG);
        myToast.setGravity(Gravity.TOP, 0,0);
        myToast.show();
    }

}