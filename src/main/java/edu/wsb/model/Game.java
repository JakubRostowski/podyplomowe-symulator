package edu.wsb.model;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Game {
    private int turn;
    private Calendar date;
    private double money;
    private List<Project> projects;
    private List<Employee> employees;
    private int playerTime;

    public Game() {
        this.turn = 0;
        this.date = Calendar.getInstance();
        date.set(Year.now().getValue(), Calendar.JANUARY, 0);
        this.money = 50000;
        this.projects = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.playerTime = 8;
    }

    public void increaseTurnAndDay() {
        this.turn++;
        this.date.add(Calendar.DATE, 1);
    }

    public int getTurn() {
        return turn;
    }

    public String getDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.format(this.date.getTime());
    }
}
