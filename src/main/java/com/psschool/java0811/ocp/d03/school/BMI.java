/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psschool.java0811.ocp.d03.school;

/**
 *
 * @author MB-study
 */
public class BMI {
    private double height;
    private double weight;
    private double bmiValue;

    public BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
        this.bmiValue = weight / Math.pow(height/100, 2);
    }
 

    @Override
    public String toString() {
        return "BMI{" + "height=" + height + ", weight=" + weight + ", bmiValue=" + bmiValue + '}';
    }
    
    
}
