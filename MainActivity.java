package com.example.calculator_demo;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public EditText e1, e2;
    TextView t1;
    int num1, num2;

    public boolean getNumbers() {
        // defining the edit text 1 to e1
        e1 = (EditText) findViewById(R.id.num1);

        // defining the edit text 2 to e2
        e2 = (EditText) findViewById(R.id.num2);

        // defining the text view to t1
        t1 = (TextView) findViewById(R.id.result);

        // taking input from text box 1
        String s1 = e1.getText().toString();

        // taking input from text box 2
        String s2 = e2.getText().toString();

        if (TextUtils.isEmpty(s1)) {
            e1.setError("Please enter value 1");
            return false;
        }
        if (TextUtils.isEmpty(s2)) {
            e2.setError("Please enter value 2");
            return false;
        }

        // converting string to int.
        num1 = Integer.parseInt(s1);
        // converting string to int.
        num2 = Integer.parseInt(s2);

        return true;
    }

    public void doSum(View v) {
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(Integer.toString(sum));
        } else {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void clearTextNum1(View v) {
        e1.getText().clear();
    }

    public void clearTextNum2(View v) {
        e2.getText().clear();
    }

    public void doPow(View v) {
        // get the input numbers
        if (getNumbers()) {
            double result = Math.pow(num1, num2);
            t1.setText(Double.toString(result));
        } else {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doSub(View v) {
        // get the input numbers
        if (getNumbers()) {
            int result = num1 - num2;
            t1.setText(Integer.toString(result));
        } else {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doMul(View v) {
        // get the input numbers
        if (getNumbers()) {
            int result = num1 * num2;
            t1.setText(Integer.toString(result));
        } else {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doDiv(View v) {
        // get the input numbers
        if (getNumbers()) {
            if (num2 == 0) {
                t1.setText("Error Division by zero");
            } else {
                double result = num1 / (num2 * 1.0);
                t1.setText(Double.toString(result));
            }
        } else {
            t1.setText("Error Please enter Required Values");
        }
    }

    public void doMod(View v) {
        // get the input numbers
        if (getNumbers()) {
            double result = num1 % num2;
            t1.setText(Double.toString(result));
        } else {
            t1.setText("Error Please enter Required Values");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
    }
}
