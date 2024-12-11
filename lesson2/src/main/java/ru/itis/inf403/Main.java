package ru.itis.inf403;
import ru.itis.inf403.model.*;
public class Main {
    public static void main(String[] args) {
        int fieldWidth = 1000;
        int fieldHeight = 1000;
        Entity[] players;
        int finishfieldWidth = 10;
        int finishfieldHeight = 10;
        int finishX = 495;
        int finishY = 495;
        Entity[] entities = new Entity[1];
        entities[0] = new Ant(0,0);

        Entity.setFieldSize(fieldWidth,fieldHeight);
        Game game = new Game(fieldHeight,fieldWidth,entities,finishfieldWidth,finishfieldHeight,finishX,finishY);

        Entity champion = game.start();




    }
}
