package com.company;

import java.util.Scanner;

public class PrintStars_1 {
    /*
     * 2020.09.05
     * level1, Java, 직사각형 별찍
     * https://programmers.co.kr/learn/courses/30/lessons/12969
     *
     * 이 문제에는 표준 입력으로 두 개의 정수 n과기 m이 주어집니다.
     * 별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
     *
     * n과 m은 각각 1000 이하인 자연수입니다.
     */

    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("가로 n을 입력 후 enter를 쳐주세요.");
        int n = scan.nextInt();
        System.out.println("세로 m을 입력 후 enter를 쳐주세요.");
        int m = scan.nextInt();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
                if(j == n-1) {
                    System.out.println();
                }
            }
//            System.out.println();
        }
    }

    /*
     * Scanner 관련 메소드 공부하기
     */
}
