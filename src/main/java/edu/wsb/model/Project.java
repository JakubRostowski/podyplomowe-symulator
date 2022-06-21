package edu.wsb.model;

public class Project {
    private String name;
    private RequiredDays requiredDays;
    private String customer;
    private int deadline;
    private double penalty;
    private double reward;
    private int paymentDate;
    private Difficulty difficulty;

    public enum Difficulty {
        EASY, MEDIUM, HARD
    }
}
