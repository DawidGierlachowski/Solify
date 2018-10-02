package com.example.dg6867.solify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openActivity_rbb8403_2();
            }
        });
    }

    public void openActivity_rbb8403_2() {
        Intent intent = new Intent ( this, activity_rbb8403_2.class);
        startActivity(intent);
    }
}
