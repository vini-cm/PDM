package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity2 extends Activity {
    ListView listView;
    ArrayList<String> nomes;
    PlanetaController planetaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        PlanetaController planetaController = new PlanetaController();
        PlanetaAdapter adapter = new PlanetaAdapter(this, R.layout.item_lista, planetaController.getPlaneta());

        listView.setAdapter(adapter);
    }
}
