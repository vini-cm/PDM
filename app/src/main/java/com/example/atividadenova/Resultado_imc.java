package com.example.atividadenova;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.atividadenova.R;

public class Resultado_imc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc_resultado);

        Intent i = getIntent();
        Bundle b = i.getExtras();

        double peso = b.getDouble("peso");
        double altura = b.getDouble("altura");

        TextView tvResultado = findViewById(R.id.textResultado);
        ImageView imageView = findViewById(R.id.viewPerfil);

        double imc = peso / (altura * altura);
        tvResultado.setText(String.format("Seu IMC: %.2f", imc));

        if (imc < 18.5) {
            imageView.setImageResource(R.drawable.abaixopeso);
        } else if (imc < 24.9) {
            imageView.setImageResource(R.drawable.normal);
        } else if (imc < 29.9) {
            imageView.setImageResource(R.drawable.sobrepeso);
        } else if (imc < 34.9) {
            imageView.setImageResource(R.drawable.obesidade1);
        } else if (imc < 39.9) {
            imageView.setImageResource(R.drawable.obesidade2);
        } else {
            imageView.setImageResource(R.drawable.obesidade3);
        }

        findViewById(R.id.btnReturn).setOnClickListener(v -> finish());
    }
}
