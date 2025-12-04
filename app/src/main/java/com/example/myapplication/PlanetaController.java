package com.example.myapplication;

import java.util.ArrayList;

public class PlanetaController {

    PlanetaDao planetaDao;

    public PlanetaController() {
        planetaDao = new PlanetaDao();
    }

    public ArrayList<Planeta> getPlaneta() {
        return planetaDao.getPlanetas();
    }
}
