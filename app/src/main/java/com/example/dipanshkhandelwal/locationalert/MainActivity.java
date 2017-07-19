package com.example.dipanshkhandelwal.locationalert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button geofencesbutton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        geofencesbutton = (Button) findViewById(R.id.geofenceButton);
    }

    public void addGeofencesButtonHandler(View view){
    }
}
