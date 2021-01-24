package com.company;

public class EvenOdd_7 {
    /*
     *  2021.01.24
     * level1, Java, 짝수와 홀수
     * http://programmers.co.kr/learn/courses/30/lessons/12937
     *
     * 정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
     *
     * num은 int 범위의 정수입니다.
     * 0은 짝수입니다.
     *
     * 예외처리 등 추가로 해야할 게 있는지 생각해보기
     *
     */
    public String run(int num) {
//        String str = num % 2 == 0 ? "Even" : "Odd";
//        System.out.println(str);
//        return str;
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
