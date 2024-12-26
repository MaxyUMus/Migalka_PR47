package com.codebears.migalka;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private View myRectangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        myRectangle = findViewById(R.id.my_rectangle);
    }

    public void notificationAccept(View view) {
        myRectangle.setBackgroundColor(Color.BLUE);
    }

    public void powerLow(View view) {
        myRectangle.setBackgroundColor(Color.RED);
    }

    public void downloadCompleted(View view) {
        myRectangle.setBackgroundColor(Color.GREEN);
    }
}