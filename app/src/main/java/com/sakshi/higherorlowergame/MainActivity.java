package com.sakshi.higherorlowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.Math;

public class MainActivity extends AppCompatActivity {
    int rand= random();
   public void higherLowerGame(View view)
   {
       EditText guess = (EditText) findViewById(R.id.Guess);
       int g = Integer.parseInt(guess.getText().toString());
       if(g>rand)
       {
           toasting("Lower");
           guess.setText("");
       }
       else if(g<rand)
       {
           toasting("Higher");
           guess.setText("");
       }
       else
       {
           toasting("Correct!");
           Toast.makeText(MainActivity.this , "You can guess again!" , Toast.LENGTH_LONG).show();
           guess.setText("");
           rand = random();
       }
   }

   public void toasting(String text)
   {
       Toast.makeText(MainActivity.this , text , Toast.LENGTH_SHORT).show();

   }

   public int random()
   {
       int max = 20;
       int min = 1;
       int range = max - min + 1;
       return (int) (Math.random() * range) + min;
   }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}