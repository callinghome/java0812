/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psschool.java0811.ocp.d03.carStore;

/**
 *
 * @author MB-study
 */
public class ToyStore {

    public static void main(String[] args) {
        
        ToyCar toyCar = new ToyCar();
        toyCar.engine = new Engine();
        Tire[] tires = {new Tire(),new Tire(),new Tire(),new Tire()};
        toyCar.tires = tires;
        toyCar.wheel=new Wheel();
        System.out.println(toyCar.getPrice());
    }
}
