package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed = findViewById(R.id.editText1);
        Button bt = findViewById(R.id.button);
        TextView tv = findViewById(R.id.textview);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = ed.getText().toString();
                float kg = Float.parseFloat(str);
                double pounds = kg * 2.20462;

                tv.setText(""+pounds);

            }
        });
    }
}