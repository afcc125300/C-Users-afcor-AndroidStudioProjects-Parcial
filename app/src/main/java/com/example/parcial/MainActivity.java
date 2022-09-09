package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Nombre1,Nombre2,Nombre3;
    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre1=(EditText) findViewById(R.id.Nombre1);
        Nombre2=(EditText) findViewById(R.id.Nombre2);
        Nombre3=(EditText) findViewById(R.id.Nombre3);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pares();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                impares();
            }
        });
    }
    private void salir() {
        finish();

    }

    public void pares(){
        double x;
        double pares;


        x = Integer.parseInt(Nombre3.getText().toString());

        pares=2+x;
        Nombre1.setText(String.valueOf(pares));

    }
    public void impares(){
        double a;
        double impares;


        a = Integer.parseInt(Nombre3.getText().toString());


        impares=3+a;
        Nombre2.setText(String.valueOf(impares));

    }

}