package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText edt = findViewById(R.id.editTextText);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(v -> {
            String texto = edt.getText().toString();

            if (texto.isEmpty()) {
                edt.setError("Digite um número.");
                return;
            }

            double valor = Double.parseDouble(texto);

            Intent intent = new Intent(MainActivity.this, resultado.class);
            intent.putExtra("VALOR", valor);
            startActivity(intent);
        });
    }
}
