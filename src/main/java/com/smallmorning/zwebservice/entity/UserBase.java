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
 * 多态：简单说就是父类引用指向子类对象
 * 泛型：适用于多种数据类型执行相同的代码。（代码复用）
 *       泛型中的类型在使用时指定，不需要强制类型转换
**/
public class UserBase {
    protected int id;
    protected String name;
    protected String password;
    protected Date cresteDate;//注册日期
    protected Date changeDate;//修改日期

    public UserBase() {
    }

    public UserBase(int id, String name, String password, Date cresteDate, Date changeDate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.cresteDate = cresteDate;
        this.changeDate = changeDate;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCresteDate() {
        return cresteDate;
    }

    public void setCresteDate(Date cresteDate) {
        this.cresteDate = cresteDate;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    @Override
    public String toString() {
        return "UserBase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", cresteDate=" + cresteDate +
                ", changeDate=" + changeDate +
                '}';
    }
}
