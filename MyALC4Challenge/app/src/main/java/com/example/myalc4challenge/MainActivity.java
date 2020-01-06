package com.example.myalc4challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button about_alc = findViewById(R.id.about_alc);
        about_alc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent aboutIntent = new Intent(getApplicationContext(), about.class);
                startActivity(aboutIntent);
            }
        });

        Button profile_alc = findViewById(R.id.profile_alc);
        profile_alc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent profileIntent = new Intent(getApplicationContext(), my_profile.class);
                startActivity(profileIntent);
            }
        });
    }
}
