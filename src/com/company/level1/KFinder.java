package com.company.level1;

import java.util.Arrays;

public class KFinder {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/42748
     * k번째 수
     *
     **/
    public int[] findK(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        for (int i=0; i<commands.length; i++) {
            int[] command = commands[i];
            int start = command[0];
            int end = command[1];
            int pick = command[2];

            int[] arrayCopy = Arrays.copyOfRange(array, start-1, end);
            result[i] = Arrays.stream(arrayCopy).sorted().toArray()[pick-1];
            System.out.println("### " + result[i]);
        }
        return result;
    }
}
