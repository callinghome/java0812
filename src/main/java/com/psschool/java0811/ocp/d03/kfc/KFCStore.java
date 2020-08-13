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
public class KFCStore {
    public static void main(String[] args) {
        Set a = new Set(4, 2, 3, 4);
        Set b = new Set(7, 3, 5, 6);
        Set c = new Set(1, 1, 1, 1);
        Set d = new Set(9, 0, 0, 1);
        System.out.println("Set A 價格:"+a.getPrice());
        System.out.println("Set B 價格:"+b.getPrice());
        System.out.println("Set C 價格:"+c.getPrice());
        System.out.println("Set D 價格:"+d.getPrice());
        System.out.printf("庫存--雞腿：%d 雞胸：%d　雞翅：%d　可樂：%d",
                Leg.getAmount(),Breast.getAmount(),Wing.getAmount(),Coke.getAmount());
    }
}
