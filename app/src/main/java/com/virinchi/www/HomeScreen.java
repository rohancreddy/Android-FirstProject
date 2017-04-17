package com.virinchi.www;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "HomeScreen";
    EditText nameText,emailText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        performAction();
    }
    private void performAction() {
         nameText = (EditText)findViewById(R.id.editText);
         emailText = (EditText)findViewById(R.id.editText2);
        Button button1 = (Button)findViewById(R.id.button);



       button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                {

                    Log.i(TAG, "Name :" + nameText.getText().toString());


                    Log.i(TAG, "Email :" + emailText.getText().toString());


                }

            }
      });


        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.button:
                if(!nameText.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(HomeScreen.this, "Clicking Button 1", Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(HomeScreen.this, "Enter Name", Toast.LENGTH_SHORT).show();
                }

                break;







        }

    }
}











