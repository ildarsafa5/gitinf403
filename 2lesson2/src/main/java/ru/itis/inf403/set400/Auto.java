package ru.itis.inf403.set400;

public class Auto extends Object{
    private Model model;
    private int horsepower;
    private int volumeOfEngine;
    private String country;

    public Auto() {
    }

    public Auto(Model model,int horsepower, int volumeOfEngine, String country) {
        this.horsepower = horsepower;
        this.model = model;
        this.volumeOfEngine = volumeOfEngine;
        this.country = country;
    }

    @Override
    public boolean equals(Object auto) {
        if (!(getClass().equals(auto.getClass()))) {
            return false;
        } else if (auto == null) {
            return false;
        } else if (this == auto) {
            return true;
        } else if (model == ((Auto)auto).getModel()) {
            return true;
        } else {
            return false;
        }
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public Model getModel() {
        return model;
    }



    public String getCountry() {
        return country;
    }
}
