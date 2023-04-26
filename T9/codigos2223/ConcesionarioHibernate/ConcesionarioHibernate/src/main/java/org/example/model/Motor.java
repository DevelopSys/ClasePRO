package org.example.model;


import jakarta.persistence.*;

public class Motor {
    @Column
    private int cc;
    @Column
    private int cv;


    public Motor() {
    }

    public Motor(int cc, int cv) {
        this.cc = cc;
        this.cv = cv;
    }


    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Motor{" +
                ", cc=" + cc +
                ", cv=" + cv +
                '}';
    }
}
