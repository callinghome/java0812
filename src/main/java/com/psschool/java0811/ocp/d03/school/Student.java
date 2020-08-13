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
public class Student {
    private String name;
    private int age;
    private BMI bmi;

    public Student(String name, int age, BMI bmi) {
        this.name = name;
        this.age = age;
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", bmi=" + bmi + '}';
    }
    
}
