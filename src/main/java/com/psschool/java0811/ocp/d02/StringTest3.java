
package com.psschool.java0811.ocp.d02;

public class StringTest3 {
    public static void main(String[] args) {
        //可變字串:在同一個位置增減字串
        StringBuilder s = new StringBuilder("Java");
        s=s.append("8");//
        System.out.println(s);
        s.append("8");//這種的string會直接修改記憶體裡的Java8
        System.out.println(s);
        
    }
}
