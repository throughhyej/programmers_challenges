package com.company.level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Filtering {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/86051
     * 없는 숫자 더하기
     * 범위의 합 - 주어진 수의 합 = 없는 수의 합
     */
    public int filter(int[] numbers) {
        System.out.println("###### > 0 ~ 9 합 > " + IntStream.range(0, 10).sum());
        System.out.println("###### > 파라미터의 합 > " + Arrays.stream(numbers).sum());
        System.out.println("###### > 파라미터에 없는 값의 합 > " + (IntStream.range(0, 10).sum() - Arrays.stream(numbers).sum()));
    /*
        int rangeSum = 0;
        for (int i=0; i<10; i++) {
            rangeSum += i;
        }
        int arrySum = 0;
        for (int j=0; j < numbers.length; j++) {
            arrySum += numbers[j];
        }
        System.out.println("###### > " + (rangeSum - arrySum));
    */
        return IntStream.range(0, 10).sum() - Arrays.stream(numbers).sum();
    }
}
