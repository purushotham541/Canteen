package com.example.raj.checkboxpractice1;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        cb5 = (CheckBox) findViewById(R.id.cb5);
        b1  = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int Total = 0;

                StringBuilder val = new StringBuilder();
                val.append("Ordered Items");

                if (cb1.isChecked()) {
                    val.append("\n Pizza-Rs 100/-");
                    Total += 100;

                }

                if (cb2.isChecked()) {
                    val.append("\n Burger-Rs 150/-");
                    Total += 150;

            }

                if (cb3.isChecked()) {
                    val.append("\n Cool Drink-Rs 40/-");
                    Total += 40;

                }

                if (cb4.isChecked()) {
                    val.append("\n Tea-Rs 20/-");
                    Total += 20;

                }

                if (cb5.isChecked()) {
                    val.append("\n Coffe-Rs 30/-");
                    Total += 30;

                }

                if (Total==0) {
                    Toast.makeText(getApplicationContext(), "Please Make a Order", Toast.LENGTH_LONG).show();


                }
                else {

                    val.append("\n Total payable amount-Rs " + Total + "/-");
                    Toast.makeText(getApplicationContext(), val.toString(), Toast.LENGTH_LONG).show();
                }

            }


        });


    }

}