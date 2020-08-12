package com.psschool.java0811.ocp.test;

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入身高");
        double h = sc.nextDouble();
        System.out.println("請輸入體重");
        double w = sc.nextDouble();
        System.out.printf("%f %f", h, w);
    }   
}