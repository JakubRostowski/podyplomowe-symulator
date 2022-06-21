package edu.wsb.model;

import java.sql.Time;

public class Project {
    String name;
    int requiredHours;
    String customer;
    Time deadline;
    double penalty;
    double reward;
    Time paymentDate;
    Difficulty difficulty;

    public enum Difficulty {
        EASY, MEDIUM, HARD
    }
}
