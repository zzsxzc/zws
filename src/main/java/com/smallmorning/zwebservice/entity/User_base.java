package com.smallmorning.zwebservice.entity;

import java.util.Date;

/**
*@Author freedom
*@Date 14:46 2020/12/20
*@Description 用户基类
 * 封装 1.内部数据元素只能通过接口进行访问
 *      2.外部数据不知道自己调用的类方法的具体实现细节
 * 访问修饰符:
 *      1.private 本类
 *      2.default 本类 本包
 *      3.protected 本类 本包 子类
 *      4.无限制
 * 继承：
 *      super
 *      重写 子类重写父类方法
 *      重载  同一个类中方法名相同的不同方法
 *          条件：函数名相同，参数个数不同或者参数类型不同
**/
public class User_base {
    int id;
    String name;
    Date registerDate;//注册日期

    public User_base() {
    }

    public User_base(int id, String name, Date registerDate) {
        this.id = id;
        this.name = name;
        this.registerDate = registerDate;
    }

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

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User_base{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}
