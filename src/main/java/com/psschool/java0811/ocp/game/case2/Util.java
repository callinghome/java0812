
package com.psschool.java0811.ocp.game.case2;

import java.util.Scanner;

public class Util {
    private static int[] ans;
    private static String num;
    public static void getNum(){
        Scanner sc=new Scanner(System.in);
        num = sc.next();
        for(int i=0;i<4;i++){
            ans[i]=Integer.parseInt(num.charAt(i)+"");
        }
    }
}
