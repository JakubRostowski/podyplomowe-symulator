package edu.wsb;

public class Main {
    public static void main(String[] args) {
        boolean isOngoing = true;
        int turn = 0;
        double money = 50000;

        System.out.println("The game has begun!");

        while (isOngoing) {
            turn++;
            System.out.println("Turn: " + turn);

        }
    }

    public static void initializeGame() {
        System.out.println("Pick one of 3 projects:");
    }
}