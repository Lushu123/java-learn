package com.chenhu.domian;

import java.util.Date;

public class Account {
    private String username;
    private String passworld;
    private Double money;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", passworld='" + passworld + '\'' +
                ", money=" + money +
                ", date=" + date +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
