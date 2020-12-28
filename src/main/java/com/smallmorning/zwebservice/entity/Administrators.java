package com.smallmorning.zwebservice.entity;

import java.util.Date;

/**
*@Author zheng zs
*@Date 19:57 2020/12/28
*@Description 超类属性要想对子类可见，至少需要为protected
**/

public class Administrators extends UserBase{

    private String role;//管理员角色、等级


    public Administrators(String role) {
    }

    public Administrators(int id, String name, String password, Date cresteDate, Date changeDate, String role) {
        super(id, name, password, cresteDate, changeDate);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Administrators{" +
                "role='" + role + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", cresteDate=" + cresteDate +
                ", changeDate=" + changeDate +
                '}';
    }
}
