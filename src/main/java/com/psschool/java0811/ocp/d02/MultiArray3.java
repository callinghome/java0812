package com.psschool.java0811.ocp.d02;

public class MultiArray3 {

    public static void main(String[] args) {
        int[][] x = new int[][]{{100, 90, 80}, {70, 60, 50}};//array initialize 
        //前面的new int[][]通常會拿掉
        //將x[0]的內容取出
        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x[j].length; i++) {
                System.out.printf("%4d",x[j][i]);
            }
            System.out.println();
        }
    }
}
