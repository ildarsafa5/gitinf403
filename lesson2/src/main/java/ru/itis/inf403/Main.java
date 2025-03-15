package ru.itis.inf403;


public class Main {
    public static void main(String[] args) {
        int fieldWidth = 1000;
        int fieldHeight = 1000;
        int finishfieldWidth = 10;
        int finishfieldHeight = 10;
        int finishX = 495;
        int finishY = 495;
        Entity[] entities = new Entity[4];
        entities[3] = new Nechto(0,0);
        entities[2] = new Ant(0,0);
        entities[1] = new Tortoise(0,0);
        entities[0] = new Elephant(0,0);

        Entity.setFieldSize(fieldWidth,fieldHeight);
        Game game = new Game(fieldHeight,fieldWidth,entities,finishfieldWidth,finishfieldHeight,finishX,finishY);

        Entity champion = game.start();




    }
}
