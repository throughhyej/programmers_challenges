package com.company;

import com.company.level1.*;

public class Main {
    /* https://programmers.co.kr/learn/challenges */
    public static void main(String[] args) {
//        Desc_8 runCode = new Desc_8();
//        runCode.run(199201938);

//        Lotto lotto = new Lotto();
//        int[] a = new int[] {44, 1, 0, 0, 31, 25}; // {0, 0, 0, 0, 0, 0}, {45, 4, 35, 20, 3, 9}, {44, 1, 0, 0, 31, 25}
//        int[] b = new int[] {31, 10, 45, 1, 6, 19}; // {38, 19, 20, 40, 15, 25}, {20, 9, 3, 45, 4, 35}, {31, 10, 45, 1, 6, 19}
//        lotto.getLottosRanking(a, b);

//        new ValidationId().validation("=.=");

//        new Convert().converToNum("23four5six7");

//        int[] intArry = new int[] {1,2,3,4,6,7,8,0};
//        new Filtering().filter(intArry);

        int[] intArry = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        new Keypad().pressKeypad(intArry, "right");
    }
}
