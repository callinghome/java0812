
package com.psschool.java0811.ocp.game;

import java.util.Random;

public class English {
    private int ans=new Random().nextInt(26)+65;
    private int count;
    public int check(int userAns){
        count++;
        return userAns - ans;
    }
    public int getCount(){
        return count;
    }
}
