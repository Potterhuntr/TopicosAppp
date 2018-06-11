package com.example.aluno.topicosapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CambioActivity extends AppCompatActivity {


    private EditText v1;
    private EditText c;
    private TextView f;
    private Button con;
    private Double conta;
    private Double var1;
    private Double var2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambio);


        conta=0.0;
        var1=0.0;
        var2=0.0;

        v1 = (EditText) findViewById(R.id.editTextValor);
        c = (EditText) findViewById(R.id.editTextCotacao);
        f = (TextView) findViewById(R.id.textViewFinal);
        con = (Button) findViewById(R.id.buttonC);



        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            var1=Double.parseDouble(v1.getText().toString());
            var2=Double.parseDouble(c.getText().toString());
            conta= var1*var2;
            f.setText(" O valo é: R$ "+conta);



            }
        });







    }
}
