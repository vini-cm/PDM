package com.example.myapplication;

import java.util.ArrayList;

public class PlanetaController {
    PlanetaDao planetaDao = new PlanetaDao();
    public PlanetaController(){
        planetaDao = new PlanetaDao();
    }
    public void addPlaneta(Planeta planetas){
    }
    public ArrayList<Planeta> getPlaneta() {
        return planetaDao.getPlanetas();
    }
    public ArrayList<String> getNomePlanetas(){
        ArrayList<String> nome = "opa";
    }
}
