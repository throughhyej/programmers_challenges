package com.company;

import com.company.level1.Lotto;

public class Main {
    /* https://programmers.co.kr/learn/challenges */
    public static void main(String[] args) {
        // write your code here
//        Desc_8 runCode = new Desc_8();
//        runCode.run(199201938);

        Lotto lotto = new Lotto();
        int[] a = new int[] {44, 1, 0, 0, 31, 25}; // {0, 0, 0, 0, 0, 0}, {45, 4, 35, 20, 3, 9}, {44, 1, 0, 0, 31, 25}
        int[] b = new int[] {31, 10, 45, 1, 6, 19}; // {38, 19, 20, 40, 15, 25}, {20, 9, 3, 45, 4, 35}, {31, 10, 45, 1, 6, 19}
        lotto.getLottosRanking(a, b);
    }
}
