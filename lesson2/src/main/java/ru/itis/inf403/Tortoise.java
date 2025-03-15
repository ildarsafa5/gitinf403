package ru.itis.inf403;

public class Tortoise extends Entity {
    public Tortoise() {

    }

    public Tortoise(int x, int y) {
        super("Черепаха", x, y);
    }

    public void move() {
        int direction = (int) (Math.random()*4);
        switch (direction) {
            case 0:
                if (y>0) {
                    y-=2;
                }
                break;
            case 1:
                if (x>0) {
                    x-=2;
                }
                break;
            case 2:
                if (y<fieldHeight) {
                    y+=2;
                }
                break;
            case 3:
                if (x<fieldWidth) {
                    x+=2;
                }
                break;
        }
        ++cnt;

    }
}
