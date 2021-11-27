package com.mfatihasan.androidcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView resultText;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.editTextNumber);
        editText2 = (EditText) findViewById(R.id.editTextNumber2);
        resultText = (TextView) findViewById(R.id.textView);


    }

    public void sum (View view) {

        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("") )  {

            resultText.setText("Numara Yok!!");

        } else {

            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resulInteger = a + b;

            resultText.setText("Result: " + resulInteger);

        }


    }

    public void deduct (View view) {

        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("") )  {

            resultText.setText("Numara Yok!!");

        } else {

            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resulInteger = a - b;

            resultText.setText("Result: " + resulInteger);

        }

    }


    public void multiply (View view) {

        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("") )  {

            resultText.setText("Numara Yok!!");

        } else {

            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resulInteger = a * b;

            resultText.setText("Result: " + resulInteger);

        }

    }

    public void divide (View view) {

        if (editText.getText().toString().matches("") || editText2.getText().toString().matches("") )  {

            resultText.setText("Numara Yok!!");

        } else {

            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resulInteger = a / b;

            resultText.setText("Result: " + resulInteger);

        }

    }




}