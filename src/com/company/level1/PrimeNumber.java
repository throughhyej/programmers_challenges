package com.company.level1;

import java.util.stream.IntStream;

public class PrimeNumber {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/12977
     * 소수 만들기
     */
    public static int cases = 0;
    public int getPrimeNumberCases(int[] nums) {
        // for문 수
        int n = nums.length;
        cases = n == 3 ? 1 : n * (n - 3);

        int loop = 0;
        for (int i=0; i<cases; i++) {
//            for (int j=i+2; j<nums.length; j++) {
//                int result = nums[i] + nums[i+1] + nums[j];
//                System.out.printf("%d + %d + %d = ", nums[i], nums[i+1], nums[j]);
//                System.out.println("### result " + result);
//                for (int z=2; z<result; z++) {
//                    if (result % z == 0) {
//                        cases--;
//                        break;
//                    }
//                }
//            }
        }

        System.out.println("#### " + cases);
        return cases;
    }
}
