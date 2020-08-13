/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psschool.java0811.ocp.d03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author MB-study
 */
public class ArithmeticMethod2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] scores = new int[10];
        for(int i=0;i<scores.length;i++){
            scores[i]=r.nextInt(100);
        }
        Arrays.stream(scores).forEach(s -> System.out.println(s+ " "));
        System.out.println("");
        //直接幫我們自然排序
        Arrays.stream(scores).sorted().forEach(s -> System.out.println(s+ " "));
        System.out.println("");
        //過濾資料: >=60才要
        Arrays.stream(scores)
                .filter(s -> s>=60)
                .sorted().forEach(s -> System.out.println(s+ " "));
    }
}
