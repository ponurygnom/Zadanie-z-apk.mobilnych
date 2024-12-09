package com.example.jaktomisieterazniezapisze;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        TextView textView = (TextView) findViewById(R.id.editTextText);
        TextView textView2 = (TextView) findViewById(R.id.editTextText2);
        TextView textView3 = (TextView) findViewById(R.id.editTextText3);
        TextView textView4 = (TextView) findViewById(R.id.editTextTextPassword);
        Button button = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button3);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        TextView textView5 = (TextView) findViewById(R.id.textView2);
        TextView textView6 = (TextView) findViewById(R.id.textView3);
        TextView textView7 = (TextView) findViewById(R.id.textView4);
        TextView textView8 = (TextView) findViewById(R.id.textView5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setEnabled(false);
                textView2.setEnabled(false);
                textView3.setEnabled(false);
                textView4.setEnabled(false);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView5.setText(textView.getText());
                textView6.setText(textView2.getText());
                textView7.setText(textView3.getText());
                textView8.setText(textView4.getText());

            }
        });


    }
}