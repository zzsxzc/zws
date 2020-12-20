package com.smallmorning.zwebservice.ztest;

import com.smallmorning.zwebservice.entity.User_base;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        User_base user_base = new User_base(1,"zzs",new Date());
        System.out.println(user_base.toString());
    }


}
