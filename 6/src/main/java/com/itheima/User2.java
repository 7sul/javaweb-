package com.itheima;

public class User2 {
    private int id;	private String name;
    private String password;
    // 省略getter/setter方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String toString(){
        return "id="+id+",name="+name+",password="+password;
    }
}