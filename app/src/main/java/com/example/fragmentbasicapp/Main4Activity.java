package com.example.fragmentbasicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main4Activity extends AppCompatActivity {
ToggleButton t1,t2;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        t1=findViewById(R.id.togglebtn1);
        t2=findViewById(R.id.togglebtn2);
        b1=findViewById(R.id.button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String status="";
               status="mood"+t1.getText()+"Choice"+t2.getText();
                Toast.makeText(Main4Activity.this, ""+status, Toast.LENGTH_SHORT).show();




                t1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in=new Intent(Main4Activity.this,Main2Activity.class);
                        startActivity(in);




                        t2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent in=new Intent(Main4Activity.this,Main2Activity.class);
                                startActivity(in);
                            }
                        });
                    }
                });

            }
        });






    }
}
