package com.company;

import java.util.Scanner;

public class IsNum_5 {
    /*
     * 2021.1.3.
     * level1, Java, 문자열 다루기 기본
     * https://programmers.co.kr/learn/courses/30/lessons/12918
     *
     * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
     * 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
     *
     * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
     */
    class Solution {
        public boolean solution(String s) {
            boolean val = true;
             // 첫 번째 방법
            if(s.length() == 4 || s.length() == 6) {
                try {
                    int num = Integer.decode(s);
                } catch (NumberFormatException error) {
                    val = false;
                }

                // 두 번째 방법
//              for(int i=0; i<s.length(); i++) {
//                if(!Character.isDigit(s.charAt(i))) {
//                    val = false;
//                    break;
//                }
//              }

                // 세 번째 방법
//              for(int i=0; i<s.length(); i++) {
//                  val = Character.isDigit(s.charAt(i));
//                  if(!val) {
//                      break;
//                  }
//              }
            }
            return val;
        }
    }

    public void run() {
        Solution solution = new Solution();
        Scanner scan = new Scanner(System.in);
        System.out.println("입력하기");
        System.out.println(solution.solution(scan.next()));
    }

}
