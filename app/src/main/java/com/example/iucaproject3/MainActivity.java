package com.example.iucaproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageBtn = (ImageButton) findViewById(R.id.imageButton);
        Button button = (Button) findViewById(R.id.button);


        imageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "My last name";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                button.setText("Mambetaliev");
                toast.show();
                imageBtn.setBackgroundResource(R.color.teal_200);

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "My first name";

                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                button.setText("Azamat");
                toast.show();
                imageBtn.setBackgroundResource(R.color.cool);


            }
        });


    }
}