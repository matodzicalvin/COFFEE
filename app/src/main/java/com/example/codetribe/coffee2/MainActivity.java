package com.example.codetribe.coffee2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    CheckBox hot;
    CheckBox milo;
    CheckBox capp;

    EditText q1;
    EditText q2;
    EditText q3;

    Button order;
    Button reset;

    TextView lblTotal;

    public static int total;
    public static int var;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (EditText) findViewById(R.id.editText2);
        q2 = (EditText) findViewById(R.id.editText3);
        q3 = (EditText) findViewById(R.id.editText4);

        order = (Button) findViewById(R.id.button2);
        reset = (Button) findViewById(R.id.button);

        hot = (CheckBox) findViewById(R.id.HOT_CHOCOLATE);
        milo = (CheckBox) findViewById(R.id.MILO);
        capp = (CheckBox) findViewById(R.id.CAPPACINNO);

        lblTotal = (TextView) findViewById(R.id.textView3);

        capp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!capp.isChecked()) {
                    q1.setVisibility(View.INVISIBLE);
                } else {
                    q1.setVisibility(View.VISIBLE);
                }
            }
        });
        hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!hot.isChecked()) {
                    q2.setVisibility(View.INVISIBLE);
                } else {
                    q2.setVisibility(View.VISIBLE);
                }
            }
        });
        milo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!milo.isChecked()) {
                   q3.setVisibility(View.INVISIBLE);
               }
               else{
                   q3.setVisibility(View.VISIBLE);
               }
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkOrder();
            }
        });

    }

    public void checkOrder() {
        if (capp.isChecked()) {
            var = 15;
            int x = Integer.valueOf(q1.getText().toString());
            total = (var * x);
            lblTotal.setText("You Ordered Cappuccino " + q1.getText() + " @ R" + Integer.toString(total));

        }  if (hot.isChecked()) {
            var = 15;
            int y = Integer.valueOf(q2.getText().toString());
            total = (var * y);
            lblTotal.setText("You Ordered hot chocolate " + q2.getText() + " @ R" + Integer.toString(total));
        }
         if (milo.isChecked()) {
            var = 15;
            int x = Integer.valueOf(q3.getText().toString());
            total = (var * x);
            lblTotal.setText("MIlo");
        } if (capp.isChecked() && hot.isChecked())
        {
            var = 15;
            int x = Integer.valueOf(q1.getText().toString());
            int y = Integer.valueOf(q2.getText().toString());
            total = (var * y) + (var * x);
            lblTotal.setText("Your Ordered: Cappuccino  " + q1.getText() + " @ R" + Integer.toString(var) + " Hot Chocolate " +q2.getText()+ " @ R" +Integer.toString(var)
            +" Total: " + Integer.toString(total));
        }
        if (capp.isChecked() && milo.isChecked())
        {
            var = 15;
            int x = Integer.valueOf(q1.getText().toString());
            int y = Integer.valueOf(q3.getText().toString());
            total = (var * y) + (var * x);
            lblTotal.setText("Your Ordered: Cappuccino  " + q1.getText() + " @ R" + Integer.toString(var) + " milo " +q3.getText()+ " @ R" +Integer.toString(var)
                    +" Total: " + Integer.toString(total));
        }
        if (hot.isChecked() && milo.isChecked())
        {
            var = 15;
            int x = Integer.valueOf(q2.getText().toString());
            int y = Integer.valueOf(q3.getText().toString());
            total = (var * y) + (var * x);
            lblTotal.setText("Your Ordered: Hot chocolate " + q2.getText() + " @ R" + Integer.toString(var) + "Milo " +q3.getText()+ " @ R" +Integer.toString(var)
                    +" Total: " + Integer.toString(total));
        }
        if (capp.isChecked()&&hot.isChecked() && milo.isChecked())
        {
            var = 15;
            int z =Integer.valueOf(q1.getText().toString());
            int x = Integer.valueOf(q2.getText().toString());
            int y = Integer.valueOf(q3.getText().toString());
            total = (var * y) + (var * x)+(var*z);
            lblTotal.setText("Your Ordered: Hot chocolate " + q2.getText() + " @ R" + Integer.toString(var) + "Milo " +q3.getText()+ " @ R" +Integer.toString(var)+ "Cappaccino " +q1.getText()+ " @ R" +Integer.toString(var)
                    +" Total: " + Integer.toString(total));
        }


    }
}