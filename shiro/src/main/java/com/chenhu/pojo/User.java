package com.chenhu.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * 用户类
 */
public class User implements Serializable {
    private String id;
    private String name;
    private String password;
    private Set<Role> roles = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    // 省略setter、getter方法
}