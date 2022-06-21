package edu.wsb;

import edu.wsb.model.Game;

import java.util.Scanner;

public class Main {
    static Game game = new Game();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isOngoing = true;
        System.out.println("The game has begun!");
        initializeGame();

        while (isOngoing) {
            game.increaseTurnAndDay();
            System.out.println("Turn: " + game.getTurn() + " - " + game.getDate());

            System.out.println("Choose what to do:"
                    + "\n sign - sign a contract for a new project"
                    + "\n search - search for a new customer"
                    + "\n program - program one of your projects"
                    + "\n test - test one of your projects"
                    + "\n return - return a ready project to a customer"
                    + "\n hire - hire a new employee"
                    + "\n fire - fire an employee"
                    + "\n zus - spend a time on a zus");

            processAnswer();

            if (game.getTurn() == 5) {
                isOngoing = false;
            }
        }
    }

    private static void processAnswer() {
        boolean isChecking = true;
        while (isChecking) {
            String action = scanner.nextLine().toLowerCase();
            switch (action) {
                case "sign" -> isChecking = false;
                case "search" -> isChecking = false;
                case "program" -> isChecking = false;
                case "test" -> isChecking = false;
                case "return" -> isChecking = false;
                case "hire" -> isChecking = false;
                case "fire" -> isChecking = false;
                case "zus" -> isChecking = false;
                default -> System.out.println("Invalid answer!");
            }

        }
    }

    private static void initializeGame() {
        System.out.println("Pick one of 3 projects:");
    }


}