package com.psschool.java0811.ocp.game.case2;

public class GuessAB {

    public static void main(String[] args) {
        int[] ans = {3, 8, 4, 5};
        int[] user = {0, 0, 0, 0};
        //第一次
        String userAns = "3845";
        for (int i = 0; i < user.length; i++) {
            user[i] = Integer.parseInt(userAns.charAt(i) + "");
        }
        for (int x : user) {
            System.out.print(x + " ");
        }
        System.out.println("");
        int a = 0;
        int b = 0;
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < user.length; j++) {
                if (user[i] == ans[i]) {
                    a++;
                    break;
                } else if (user[i] == ans[j]) {
                    b++;
                }
            }
        }

        System.out.printf("%dA%dB", a, b);
    }
}
