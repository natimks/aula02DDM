package br.edu.ifsc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickGerarNumero(View view) {

        try {

            EditText num1Ed = findViewById(R.id.numero1__edit_text);
            int num1 = Integer.parseInt(num1Ed.getText().toString());

            EditText num2Ed = findViewById(R.id.numero2__edit_text);
            int num2 = Integer.parseInt(num2Ed.getText().toString());

            Random random = new Random();
            double numeroAleatorio = 0;
            if (num1 > num2) {
                numeroAleatorio = (random.nextInt((num1 - num2) + 1) + num2);
            } else {
                numeroAleatorio = (random.nextInt((num2 - num1) + 1) + num1);
            }

            TextView resultado = findViewById(R.id.resultado_text_view);
            resultado.setText(Double.toString(numeroAleatorio));
        }catch (Exception ex){
            Toast.makeText(getApplicationContext(),"Número inválido!",Toast.LENGTH_LONG).show();
        }
    }
}
