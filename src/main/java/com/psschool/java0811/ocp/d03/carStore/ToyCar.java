
package com.psschool.java0811.ocp.d03.carStore;

public class ToyCar {
    Wheel wheel;
    Tire[] tires;//因為輪胎可能超過一個，所以設陣列
    Engine engine;
    private int price;
    public int getPrice(){
        int tiresTotalPrice=0;
        for(Tire tire:tires){
            tiresTotalPrice += tire.price;
        }
        return  wheel.price + engine.price + tiresTotalPrice;
    }
}
