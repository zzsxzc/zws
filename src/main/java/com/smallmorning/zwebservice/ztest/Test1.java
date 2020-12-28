package com.smallmorning.zwebservice.ztest;

import com.smallmorning.zwebservice.entity.UserBase;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        UserBase user_base = new UserBase(1,"zzs",new Date());
        System.out.println(user_base.toString());
    }


}
