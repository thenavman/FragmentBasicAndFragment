package com.example.fragmentbasicapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button firstFragment, secondFragment;
        firstFragment =  findViewById(R.id.firstFragment);

            // get the reference of Button's

            secondFragment = findViewById(R.id.secondFragment);

            // perform setOnClickListener event on First Button
           firstFragment.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   loadFragment((new FirstFragment()));
               }
           });

            // perform setOnClickListener event on Second Button
            secondFragment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // load Second Fragment
                    loadFragment(new SecondFragment());
                }
            });

        }

        private void loadFragment(Fragment fragment) {
            // create a FragmentManager
            FragmentManager fm = getFragmentManager();
            // create a FragmentTransaction to begin the transaction and replace the Fragment
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            // replace the FrameLayout with new Fragment
            fragmentTransaction.replace(R.id.frameLayout, fragment);
            fragmentTransaction.commit(); // save the changes
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.items, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_toglbtn) {
                startActivity(new Intent(this,FirstFragment.class));
                return true;
            }

            if (id == R.id.action_fragment) {
                startActivity(new Intent(this,SecondFragment.class));
                return true;
            }
            return super.onOptionsItemSelected(item);
        }


    }
