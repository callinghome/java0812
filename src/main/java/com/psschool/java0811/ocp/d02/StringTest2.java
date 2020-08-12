
package com.psschool.java0811.ocp.d02;

public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";//用這種寫法，會把Java放到heap的一個pool裡面，所以s1,s2會指向同一個Java
        String s3 = new String("Java");//這樣會把Java放到前述那個pool以外的地方
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        s3=s3.intern();//把Java丟到pool裡
        System.out.println(s1 == s3);
    }
}
