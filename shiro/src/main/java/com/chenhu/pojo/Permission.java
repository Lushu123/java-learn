package com.chenhu.pojo;

import java.io.Serializable;

/**
 * 权限类
 */
public class Permission implements Serializable {
    private String id;
    private String name;
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
// 省略setter、getter方法
}