package ru.itis.inf403;

import java.util.Random;

public class Elephant extends Entity {
    public Elephant() {

    }

    public Elephant(int x, int y) {
        super("Слон",x,y);
    }
    @Override
    public void move() {
        Random random = new Random();
        int direction = random.nextInt(4);
        switch (direction) {
            case 0:
                if (x>0 && y>0) {
                    --x;
                    --y;
                }
                break;
            case 1:
                if (x<fieldWidth && y > 0) {
                    ++x;
                    --y;
                }
                break;
            case 2:
                if (y<fieldHeight && x<fieldWidth) {
                    ++x;
                    ++y;
                }
                break;
            case 3:
                if (x>0 && y<fieldHeight) {
                    --x;
                    ++y;
                }
                break;

        }
        ++cnt;
    }
}
