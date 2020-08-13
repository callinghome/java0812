/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psschool.java0811.ocp.d03;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author MB-study
 */
class BMI{
    private double h;
    private double w;
    private double value;

    public BMI(double h, double w) {
        this.h = h;
        this.w = w;
        value = w/Math.pow(h/100, 2);
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BMI{" + "h=" + h + ", w=" + w + ", value=" + value + '}';
    }
    
    
}
public class ArithmeticMethod3 {
    public static void main(String[] args) {
        BMI[] bmis = {
            new BMI(170.0,60.0),
            new BMI(160.0,60.5),
            new BMI(185.0,65.5)};
        Arrays.stream(bmis).forEach(b -> System.out.println(b) );
        System.out.println("-----------------------------------------");
        Arrays.stream(bmis)
                .filter(b -> b.getValue()>=18&&b.getValue()<=23)
                .forEach(b -> System.out.println(b) );
        System.out.println("-----------------------------------------");
        Arrays.stream(bmis)
                .sorted(Comparator.comparing(BMI::getH))
                .forEach(b -> System.out.println(b) );
    }
    
    
}
