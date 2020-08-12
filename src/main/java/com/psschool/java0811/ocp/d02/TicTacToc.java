
package com.psschool.java0811.ocp.d02;

import java.util.Scanner;

public class TicTacToc {
    public static void play() {
       Scanner sc = new Scanner(System.in);
        char[][] ttt = {
            {'0', '1', '2'},
            {'3', '4', '5'},
            {'6', '7', '8'}
        };
        int count = 0;
        while (true) {
            for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.printf(" %c", ttt[i][j]);
                    }
                    System.out.printf("\n");

                }
            if (count % 2 == 0) {
                System.out.printf("Choose a number to assign \"O\"\n");
                int ans=put();
                ttt[ans/3][ans%3]='O';
                count++;
            } else if (count % 2 == 1) {
                System.out.printf("Choose a number to assign \"X\"\n");
                int ans=put();
                ttt[ans/3][ans%3]='X';
                count++;
            }
        }
    }
    public static int put(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Choose a number to assign \"O\"\n");
        int ans = sc.nextInt();
        return ans;
        
    }   
}
