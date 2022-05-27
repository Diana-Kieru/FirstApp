package com.moringaschool.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(v -> {
            TextView textValue = findViewById(R.id.text_value);
            String stringValue = textValue.getText().toString();
            int originalValue = Integer.parseInt(stringValue);
            int newValue = MyWorker.doubleTheValue(originalValue);
            textValue.setText(Integer.toString(newValue));


            Snackbar.make(v,"Changed value" + originalValue + " to " + newValue, Snackbar.LENGTH_LONG)
                    .setAction("action", null).show();
        });
    }
}