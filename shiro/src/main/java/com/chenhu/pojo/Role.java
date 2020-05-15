package com.chenhu.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/**
 * 角色类
 */
public class Role implements Serializable {
    private String id;
    private String name;
    private Set<Permission> permissions = new HashSet<>();

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

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
// 省略setter、getter方法
}