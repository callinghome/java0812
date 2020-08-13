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
public class Pen {
    private int price = 10;
    private static int amount = 10;
    
    public Pen(){
        amount--;
    }

    public int getPrice() {
        return price;
    }

    public static int getAmount() {
        return amount;
    }
    
}
