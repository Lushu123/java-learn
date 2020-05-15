package com.chenhu.pojo;

import java.util.Date;

public class User {

    private String loginname;
    private String password;
    private Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "loginname='" + loginname + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
