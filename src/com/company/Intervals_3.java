package com.company;

import java.util.Scanner;

public class Intervals_3 {
    /*
     * 2020.09.07
     * level1, Java, x만큼 간격이 있는 n개의 숫자
     * https://programmers.co.kr/learn/courses/30/lessons/12954?language=java
     *
     * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
     * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
     *
     * x는 -10000000 이상, 10000000 이하인 정수입니다.
     * n은 1000 이하인 자연수입니다.
     */

    class Solution {
        public long[] solution(int x, int n) {
            // 이 때, int x로 인해 실패하는 경우가 있음 -> long 으로 변환하면 성공
            long[] answer = new long[n];
            for(int i=0; i<n; i++) {
                answer[i] = (i+1) * x;
            }
            return answer;
        }
        /*
            public long[] solution(int x, int n) {
                long[] answer = new long[n];
                answer[0] = x;
                for(int i=1; i<n; i++) {
                    answer[i] = answer[i-1] + x;
                }
                return answer;
            }
         */
        /*
         * public long[] solution(long x, int n) {
              long[] answer = new long[n];
              for(int i = 0; i < n; i++){
                  answer[i] = x * (i + 1);
              }
              return answer;
          }
         */
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("시작 및 간격이 될 임의의 정수를 입력하시오");
        int x = scan.nextInt();
        System.out.println("출력 개수가 될 임의의 자연수를 입력하시오");
        int n = scan.nextInt();

        Solution solution = new Solution();
        long[] answer = solution.solution(x, n);

        System.out.print("[");
        for(int i=0; i<answer.length; i++) {
            if(i == answer.length-1) {
                System.out.print(answer[i]);
            }else{
                System.out.print(answer[i]+", ");
            }
        }
        System.out.println("]");
    }
}
