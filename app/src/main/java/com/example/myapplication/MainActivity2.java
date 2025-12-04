package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends Activity {

    ListView listView;
    PlanetaController planetaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main); // Layout certo!

        listView = findViewById(R.id.listView);

        planetaController = new PlanetaController();

        PlanetaAdapter adapter = new PlanetaAdapter(
                this,
                R.layout.item_lista,
                planetaController.getPlaneta()
        );

        listView.setAdapter(adapter);
    }
}
