package com.smallmorning.zwebservice.encryption;
/**
*@Author zheng zs
*@Date 11:06 2021/1/3
*@Description 加密用
**/
public class Encryption {

    public static String encode1(String str){
        char[] codes = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=4;i<codes.length;i++){
            sb.append(codes[i]);
        }
        for(int j= 0;j<4;j++){
            sb.append(codes[j]);
        }
        return sb.reverse().toString();
    }

    public static String decode1(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.substring(sb.length()-4)+sb.substring(0,sb.length()-4);
    }

    public static void main(String[] args) {
        String str ="12345678";
        System.out.println(str);
        System.out.println(encode1(str));
        System.out.println(decode1(encode1(str)));
    }

}
