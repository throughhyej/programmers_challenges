package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Average_6 {

    class Solution {
        /*
         * 2021.1.23.
         * level1, Java, 평균 구하기
         * https://programmers.co.kr/learn/courses/30/lessons/12944
         *
         * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
         *
         * arr은 길이 1 이상, 100 이하인 배열입니다.
         * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
         *
         * OptionalDouble.getAs*() with isPresent()
         * OptionalDouble.isPresent() -- Return true if there is a value present, otherwise false.
         *
         */
        public double solution(int[] arr) {
            OptionalDouble val = Arrays.stream(arr).average(); // OptionalDouble[2.5] 리턴
            return val.isPresent() ? val.getAsDouble() : 0;

//            1. 첫번째 방법: 에러 발생 위험 있음
//            int sum = 0;
//            for(int i=0; i<arr.length; i++) {
//                sum += arr[i];
//            }
//            answer = (double) sum / arr.length;

//            2. 두번째 방법             
//            double answer = 0; // Warning:(21, 29) Variable 'answer' initializer '0' is redundant
//            OptionalDouble val = Arrays.stream(arr).average();
//            answer = val.isPresent() ? val.getAsDouble() : 0; // Warning:(23, 26) 'OptionalDouble.getAsDouble()' without 'isPresent()' check

//            return answer;
        }
    }

    public void run() {
        Solution solution = new Solution();
        int[] arr = new int[] {2, 5};
        solution.solution(arr);
    }

}
