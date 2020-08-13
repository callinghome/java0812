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
public class ArithmeticMethod4 {
    public static void main(String[] args) {
        Exam[] exams ={
            new Exam(100),
            new Exam(50),
            new Exam(80),
            new Exam(90),
            new Exam(40),
        };
        Arrays.stream(exams)
                .filter( e -> e.getScore() >= 60)
                .sorted(Comparator.comparing(Exam::getScore).reversed())
                .forEach(e -> System.out.println(e));
    }
}
class Exam{
    private int score;

    public Exam(int score) {
        this.score = score;
        
    }

    @Override
    public String toString() {
        return "Exam{" + "score=" + score + '}';
    }

    public int getScore() {
        return score;
    }
    
}
