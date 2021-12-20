package com.company.level1;

import java.util.stream.IntStream;

public class Finder {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/87389
     * 나머지가 1이 되는 수 찾기
     */
    public int findNum(int n) {
        int result = 0;
        if (3 <= n && n <= 1000000) {
            for (result++; result < n; result++) {
                if (n % result == 1) {
                    break;
                }
            }
        }
        System.out.printf("#### %d", result);
        return result;
    }
}
