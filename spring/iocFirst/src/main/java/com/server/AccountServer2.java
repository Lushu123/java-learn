package com.server;

import java.util.Date;

public class AccountServer2 implements IAccountServer{
    //业务层实现类,调用持久层
    private String text;
    private Integer num;
    private Date date;

    public void setText(String text) {
        this.text = text;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AccountServer{" +
                "text='" + text + '\'' +
                ", num=" + num +
                ", date=" + date +
                '}';
    }

    public void saveAccount() {
        System.out.println("调用了");
    }
}
