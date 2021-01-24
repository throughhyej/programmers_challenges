package com.company;

import java.util.Scanner;

public class ReturnNum_4 {
    /*
     * 2021.01.01
     * level1, Java, 문자열을 정수로 바꾸기
     * https://programmers.co.kr/learn/courses/30/lessons/12925
     *
     * 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
     *
     * s의 길이는 1 이상 5이하입니다.
     * s의 맨앞에는 부호(+, -)가 올 수 있습니다.
     * s는 부호와 숫자로만 이루어져있습니다.
     * s는 0으로 시작하지 않습니다.
     *
     * 예) 예를들어 str이 1234이면 1234를 반환하고, -1234이면 -1234를 반환하면 됩니다.
     * str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
     *
     */

    class Solution {
        public int solution(String s) {
            // Local variable 'answer' is redunant. // 불필요한
            // int answer = Integer.decode(s);
            // return answer;
            return Integer.decode(s);
        }
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("부호와 함께 최대 다섯 자리를 입력해주세요.");

        String input = scan.next();
        Solution solution = new Solution();
        System.out.println(solution.solution(input));
    }

    /*
     * Decodes a String into an Integer. Accepts decimal, hexadecimal, and octal numbers given by the following grammar
     * The sequence of characters following an optional sign and/or radix specifier ("0x", "0X", "#", or leading zero) is parsed as by the Integer
     */
}
