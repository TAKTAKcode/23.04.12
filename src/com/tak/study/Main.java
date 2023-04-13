package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //값을 담는 Str[] 선언..
        String[] str = new String[5];

        String prnt = "";

        for (int i = 0; i < 5; i++) {

            str[i] = sc.next();

        }

        int flag;
        int idx = 0;

        while(true) {

            flag = 0;

            for (int i = 0; i < 5; i++) {

                if (idx < str[i].length()) {
                    flag = 1;
                    prnt += str[i].charAt(idx);
                }

            }

            if (flag == 0) break;
            idx++;
        }

        System.out.println(prnt);

    }

}
