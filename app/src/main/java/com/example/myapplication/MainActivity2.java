package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements SensorEventListener {
    TextView textView;
    SensorManager sm;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.txtvSensor);
        listView= findViewById(R.id.ListV);

        sm= (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Sensor sensor= sm.getDefaultSensor(Sensor.TYPE_LIGHT);
        sm.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        List<Sensor> sensorList = sm.getSensorList(Sensor.TYPE_ALL);
        ArrayList<String> listNameSensor = new ArrayList<>();
        for (Sensor s: sensorList){
            listNameSensor.add(s.getName());
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listNameSensor);
        listView.setAdapter(adapter);
    }
    @Override
    public void onSensorChanged(SensorEvent event){
        event.sensor.getName();
        textView.setText( Float.toString(event.values[0]));
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy){

    }
}
