package ru.itis.inf403;

public class Game {
    private int fieldWidth;
    private int fieldHeight;
    private Entity[] players;
    private int finishfieldWidth;
    private int finishfieldHeight;
    private int finishX;
    private int finishY;

    public Game() {

    }

    public Game(int fieldHeight, int fieldWidth, Entity[] players,
                int finishfieldWidth, int finishfieldHeight, int finishX, int finishY) {
        this.fieldHeight = fieldHeight;
        this.fieldWidth = fieldWidth;
        this.players = players;
        this.finishfieldWidth = finishfieldWidth;
        this.finishX = finishX;
        this.finishY = finishY;
        this.finishfieldHeight =finishfieldHeight;
        Entity.setFieldSize(fieldWidth,fieldHeight);

    }

    public Entity start() {
        while(true) {
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }

            for (int i = 0; i < players.length; i++) {
                if (players[i].x >= finishX && players[i].x <= finishX+finishfieldWidth
                && players[i].y >= finishY && players[i].y <= finishY+finishfieldHeight) {
                    System.out.println(players[i]);
                    return players[i];
                }
            }
        }
    }
}
