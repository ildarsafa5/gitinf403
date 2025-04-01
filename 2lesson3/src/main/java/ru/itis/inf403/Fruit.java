package ru.itis.inf403;

import java.util.Objects;

public class Fruit {
    private String name;
    private Integer sugar;

    public Fruit(String name, Integer sugar) {
        this.name = name;
        this.sugar = sugar;
    }

    @Override
    public boolean equals(Object a) {
        if (a==null) {
            return false;
        }
        if (this == a) {
            return true;
        }
        Fruit v = (Fruit) a;
        if (sugar == v.getSugar() && name.equals(v.getName())) {
            return true;
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name,sugar);
    }
     public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return name + " " + sugar + " процентов сахара";
    }
}
