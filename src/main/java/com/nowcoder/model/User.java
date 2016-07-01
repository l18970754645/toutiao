package com.nowcoder.model;

/**
 * Created by korol on 2016/6/29.
 */
public class User {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  User(String name){
        this.name=name;
    }
}
