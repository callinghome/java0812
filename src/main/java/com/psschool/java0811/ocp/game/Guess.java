package com.psschool.java0811.ocp.game;

import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
        gameMenu();

    }

    public static void gameMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Guess English or Number, or quit(type E or N or Q)");
            char menu = sc.next().toUpperCase().charAt(0);
            switch (menu) {
                case 'E':
                    englishGameLoop();
                    break;
                case 'N':
                    numberGameLoop();
                    break;
                case 'Q':
                    return;
            }
        }

    }

    public static void englishGameLoop() {
        English letter = new English();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("請輸入字母: ");
            int userAns = sc.next().toUpperCase().charAt(0);
            int result = letter.check(userAns);
            if (result == 0) {
                System.out.println("Right!");
                break;
            } else {
                System.out.printf("猜第%d次了, 結果: 猜 %s 了\n", letter.getCount(), result > 0 ? "大" : "小");
            }
        }
    }

    public static void numberGameLoop() {

        Number n1 = new Number();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("請輸入數字(1~100): ");
            int userAns = sc.nextInt();
            int result = n1.check(userAns);
            if (result == 0) {
                System.out.println("Right!");
                break;
            } else {
                System.out.printf("猜第%d次了, 結果: 猜 %s 了\n", n1.getCount(), result > 0 ? "大" : "小");
            }
        }
    }

}
