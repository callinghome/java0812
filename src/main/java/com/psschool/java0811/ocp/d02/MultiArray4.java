package com.psschool.java0811.ocp.d02;

public class MultiArray4 {

    public static void main(String[] args) {
        //三維陣列
        int[][][] x = {{{98, 65}, {73, 98}}, {{15, 14}, {21, 15, 54}}, {{98, 54, 48},{12}}};
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
        System.out.println(x[0][0][0]);

        for (int a=0;a<x.length;a++) {
            for (int b = 0; b < x[a].length; b++) {
                for (int c = 0; c < x[a][b].length; c++) {//boolean的陣列也要改
                    System.out.println(x[a][b][c]);
                }
            }
        }
    }

}
