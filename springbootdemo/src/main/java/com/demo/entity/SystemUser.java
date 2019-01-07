package com.demo.entity;

/**
 * Created by syp on 2019/1/4.
 */
public class SystemUser extends BaseEntity{

    private String user;
    private String pwd;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


    public String toString(){
        return "{user = "+user+";pwd = "+pwd+"}";
    }


}
