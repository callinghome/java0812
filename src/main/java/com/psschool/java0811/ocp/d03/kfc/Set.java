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
public class Set{
    Leg[] leg ;
    Breast[] breast ;
    Wing[] wing ;
    Coke[] coke;
    private int price;
    public Set(int legCount,int breastCount,int wingCount,int cokeCount){
        //陣列布局
        leg = new Leg[legCount];
        breast = new Breast[breastCount];
        wing = new Wing[wingCount];
        coke = new Coke[cokeCount];
        //賦予陣列元素
        for(int i=0;i<leg.length;i++){
            leg[i] = new Leg();
            price += leg[i].getPrice();
        }
        for(int i=0;i<wing.length;i++){
            wing[i] = new Wing();
            price += wing[i].getPrice();
        }
        for(int i=0;i<breast.length;i++){
            breast[i] = new Breast();
            price += breast[i].getPrice();
        }
        for(int i=0;i<coke.length;i++){
            coke[i] = new Coke();
            price += coke[i].getPrice();
        }
    }
    public int getPrice(){
        return price;
    }
}
