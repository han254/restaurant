package com.moringaschool.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button mFindRestaurantsButton;
    private EditText mLocationEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String TAG = MainActivity.class.getSimpleName();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocationEditText = (EditText) findViewById(R.id.locationEditText);

        mFindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);
        mFindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(intent);
                String location = mLocationEditText.getText().toString();
                Toast.makeText(MainActivity.this, location, Toast.LENGTH_LONG).show();
            }
        });
    }
}
