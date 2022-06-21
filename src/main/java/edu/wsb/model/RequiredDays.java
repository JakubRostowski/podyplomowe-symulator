package edu.wsb.model;

public class RequiredDays {
    private int frontend;
    private int backend;
    private int database;
    private int mobile;
    private int wordpress;
    private int prestashop;

    public RequiredDays(int frontend, int backend, int database, int mobile, int wordpress, int prestashop) {
        this.frontend = frontend;
        this.backend = backend;
        this.database = database;
        this.mobile = mobile;
        this.wordpress = wordpress;
        this.prestashop = prestashop;
    }
}

