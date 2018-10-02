package com.example.dg6867.solify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class activity_rbb8403_2 extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rbb8403_2);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }
    public void openMainActivity() {
        Intent intent = new Intent ( this, MainActivity.class);
        startActivity(intent);
    }
}
