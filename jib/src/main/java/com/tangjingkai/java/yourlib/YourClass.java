package com.tangjingkai.java.yourlib;

public class YourClass {
    private String you;

    public YourClass(String you) {
        this.you = you;
    }

    public String getYou() {
        return you;
    }

    public void setYou(String you) {
        this.you = you;
    }

    @Override
    public String toString() {
        return  "YourClass{" +
                "you='" + you + '\'' +
                '}';

    }
}
