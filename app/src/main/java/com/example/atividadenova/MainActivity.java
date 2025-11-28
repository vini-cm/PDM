package com.example.atividadenova;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.atividadenova.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnCalcular);
        EditText campoPeso = findViewById(R.id.editPes);
        EditText campoAlt = findViewById(R.id.editAlt);

        button.setOnClickListener(v -> {

            String txtPeso = campoPeso.getText().toString();
            String txtAlt = campoAlt.getText().toString();

            if (txtPeso.isEmpty() || txtAlt.isEmpty()) {
                campoPeso.setError("Digite o peso");
                campoAlt.setError("Digite a altura");
                return;
            }

            Intent intent = new Intent(this, Resultado_imc.class);
            Bundle bundle = new Bundle();

            bundle.putDouble("peso", Double.parseDouble(txtPeso));
            bundle.putDouble("altura", Double.parseDouble(txtAlt));

            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}
