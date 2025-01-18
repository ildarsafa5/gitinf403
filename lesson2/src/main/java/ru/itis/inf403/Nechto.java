package ru.itis.inf403.model;

import java.util.Random;

public class Nechto extends Entity {
    public Nechto() {

    }

    public Nechto(int x, int y) {
        super("EnderMan",x,y);

    }
    @Override
    public void move() {
        Random random = new Random();
        Random random2 = new Random();
        int directionY = random.nextInt(fieldHeight+1);
        int directionX = random2.nextInt(fieldWidth+1);
        x = directionX;
        y = directionY;
        ++cnt;


    }
}
