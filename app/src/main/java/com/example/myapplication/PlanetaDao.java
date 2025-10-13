package com.example.myapplication;

import java.util.ArrayList;

public class PlanetaDao {
    ArrayList<Planeta> arraylistPlanetas;
    public PlanetaDao(){
        arraylistPlanetas = new ArrayList<Planeta>();
        arraylistPlanetas.add(new Planeta("Mercúrio", R.drawable.mercurio));
        arraylistPlanetas.add(new Planeta("Vênus", R.drawable.venus));
        arraylistPlanetas.add(new Planeta("Terra", R.drawable.earth));
        arraylistPlanetas.add(new Planeta("Marte", R.drawable.mars));
        arraylistPlanetas.add(new Planeta("Júpiter", R.drawable.jupiter));
        arraylistPlanetas.add(new Planeta("Saturno", R.drawable.saturn));
        arraylistPlanetas.add(new Planeta("Urano", R.drawable.uranus));
        arraylistPlanetas.add(new Planeta("Netuno", R.drawable.neptune));


    }
    public ArrayList<Planeta> getPlanetas(){
        return arraylistPlanetas;
    }
}
