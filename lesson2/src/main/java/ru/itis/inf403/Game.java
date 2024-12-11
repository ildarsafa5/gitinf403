package ru.itis.inf403;

public class Game {
    private int fieldWidth;
    private int fieldHeight;
    private Entity[] players;
    private int finishX1;
    private int finishY1;
    private int finishX2;
    private int finishY2;

    public Game() {

    }

    public Game(int fieldHeight, int fieldWidth, Entity[] players,
                int finishX1, int finishY1, int finishX2, int finishY2) {
        this.fieldHeight = fieldHeight;
        this.fieldWidth = fieldWidth;
        this.players = players;
        this.finishX1 = finishX1;
        this.finishX2 = finishX2;
        this.finishY2 = finishY2;
        this.finishY1 =finishY1;

    }

    public Entity start() {
        while(true) {
            for (int i = 0; i < players.length; i++) {
                players[i].move();
            }

            for (int i = 0; i < players.length; i++) {
                if (players[i].x >= finishX1 && players[i].x <= finishX2
                && players[i].y >= finishY1 && players[i].y <= finishY2) {
                    System.out.println(players[i]);
                    return players[i];
                }
            }
        }
    }
}
