package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Desc_8 {
    /*
     * 2021.01.24
     * level1, Java, 정수 내림차순으로 배치하기
     * https://programmers.co.kr/learn/courses/30/lessons/12933
     *
     * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
     * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
     *
     * n은 1이상 8000000000 이하인 자연수입니다.
     *
     */
    public long run(long num) {
        if(num > 0  && num <= 8000000000L) {
            int numInt = (int) num;
            ArrayList<Integer> list = new ArrayList<>();
            while(numInt > 0) {
                // 한 자리씩 리스트에 넣음
                list.add(numInt % 10);
                numInt /= 10;
            }

            list.sort(Collections.reverseOrder());
            // Collections.sort(list, Collections.reverseOrder()); -- Warning:(28, 25) Collections.sort could be replaced with List.sort
            // Collections.reverseOrder() -- ASC
            // Collections.sort(list, Collections.reverseOrder()); -- DESC

            // 리스트 나열
            StringBuffer sb = new StringBuffer();
            for(int i : list) {
                sb.append(i);
            }
            System.out.println(num);
            System.out.println(Long.parseLong(String.valueOf(sb)));

            return Long.parseLong(String.valueOf(sb));
        }else{
            System.out.println("입력값 조건 준수 요망");
            return 0;
        }
    }
}
