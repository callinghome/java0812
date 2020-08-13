/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psschool.java0811.ocp.d03;

/**
 *
 * @author MB-study
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] x = {18, 17, 17, 16};
        for (int k = 1; k < x.length; k++) {
            for (int i = 0; i < x.length - k; i++) {
                int a = x[i];
                int b = x[i + 1];
                if (x[i] > x[i + 1]) {
                    x[i] = b;
                    x[i + 1] = a;
                }
            }
        }
        for (int number : x) {
            System.out.println(number + " ");
        }
    }

}
