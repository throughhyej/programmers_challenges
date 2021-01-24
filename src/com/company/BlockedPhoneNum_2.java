package com.company;

import java.util.Scanner;

public class BlockedPhoneNum_2 {
    /*
     * 2020.09.05
     * level1, Java, 핸드폰 번호 가리기
     * https://programmers.co.kr/learn/courses/30/lessons/12948?language=java
     *
     * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
     * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
     *
     * s는 길이 4 이상, 20이하인 문자열입니다.
     */

    public String solution(String phoneNum) {
        String answer = "";
        int blockedLength = phoneNum.length() - 4;

        for(int i=0; i<blockedLength; i++) {
             answer += "*"; // string: class -> heap 저장 -> 추가될 때마다 새로운 메모리 주소 할당 -> 메모리 낭비
        }
        answer += phoneNum.substring(blockedLength); // string: class -> heap 저장 -> 추가될 때마다 새로운 메모리 주소 할당 -> 메모리 낭비

        return answer;
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("전화번호 입력 후 Enter를 쳐주세요. 예) 01000000000");
        String phoneNum = scan.nextLine();

        System.out.println(this.solution(phoneNum));
    }

    /*
     * .toCharArray()
     * String.valueOf()
     * 정규식? .(?=.{4})
     * += String + 연산들은 Compiler에서 자동으로 StringBuffer와 StringBuilder로 바꿈
     * += -> StringBuilder(thread-safeX)/StringBuffer(thread-safeO) : StringBuilder가 더 빠름
     * += -> CharSequence Interface를 잘 사용하면 추가적 최적화를 꾀할 수 있다.
     */

    /*
    class Solution {
        public String solution(String phone_number) {
            char[] ch = phone_number.toCharArray();
            for(int i = 0; i < ch.length - 4; i ++){
                ch[i] = '*';
            }
            return String.valueOf(ch);
        }
    }

    class Solution {
        public String solution(String phone_number) {
            return phone_number.replaceAll(".(?=.{4})", "*");
        }
    }
     */
}
