package com.example.fragmentbasicapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.startActivity);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Activity Button", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private class ActionBarCallback implements android.support.v7.view.ActionMode.Callback {

        @Override
        public boolean onCreateActionMode(android.support.v7.view.ActionMode actionMode, Menu menu) {


            actionMode.getMenuInflater().inflate(R.menu.items, menu);


            return true;
        }

        @Override
        public boolean onPrepareActionMode(android.support.v7.view.ActionMode actionMode, Menu menu) {


            actionMode.setTitle("My Action Mode");
            return false;
        }

        @Override
        public boolean onActionItemClicked(android.support.v7.view.ActionMode actionMode, MenuItem menuItem) {

            // You can add Functionality to your Menu Buttons here.
            // Apply switch case statements in case there are more than one Menu Buttons.

            return false;
        }

        @Override
        public void onDestroyActionMode(android.support.v7.view.ActionMode actionMode) {

            // This is called when Action Mode is completed.

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.items, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {

            case R.id.action_togglebtn:

                Toast.makeText(MainActivity.this, "Settings clicked", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(i);
                break;
            case R.id.action_fragment:

                Toast.makeText(MainActivity.this, "Fragment clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);


                break;

            case R.id.action_logout:

                Toast.makeText(MainActivity.this, "Logout clicked", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);


    }

}
