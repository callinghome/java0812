
package com.psschool.java0811.ocp.d02;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("java");
        System.out.println(s1==s2);// == 用來比較基本型態，String是參考資料型態，不適用
        System.out.println(s1.equals(s2));//要比較參考資料型態，需要用到equals
        System.out.println(s1.equals(s3));//字母大小寫影響結果(廢話)
        System.out.println(s1.equalsIgnoreCase(s3));//不在意大小寫
    }
  
}
