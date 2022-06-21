package edu.wsb;

import edu.wsb.model.Game;

public class Main {
    public static void main(String[] args) {
        boolean isOngoing = true;
        Game game = new Game();

        System.out.println("The game has begun!");

        initializeGame();

        while (isOngoing) {
            game.increaseTurnAndDay();
            System.out.println("Turn: " + game.getTurn() + " - " + game.getDate());
            if (game.getTurn() == 5) {
                isOngoing = false;
            }
        }
    }

    public static void initializeGame() {
        System.out.println("Pick one of 3 projects:");
    }


}