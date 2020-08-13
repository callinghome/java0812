/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psschool.java0811.ocp.d03.bookstore;

/**
 *
 * @author MB-study
 */
public class Store {
    public static void main(String[] args) {
        Pen[] pens = new Pen[4];
        for(int i=0;i<4;i++){
            pens[i] = new Pen();
        }
        int sum =0;
        for(Pen pen:pens){
            sum += pen.getPrice();
        }
        System.out.println(sum);
        System.out.println(Pen.getAmount());
    }
}
