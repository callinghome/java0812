/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psschool.java0811.ocp.d03.kfc;

/**
 *
 * @author MB-study
 */
public class Wing {
    private int price = 30;
    private static int amount = 100;

    public Wing() {
        amount--;
    }

    public static int getAmount() {
        return amount;
    }
    public int getPrice() {
        return price;
    }
    
}
