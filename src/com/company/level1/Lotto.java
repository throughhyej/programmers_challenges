package com.company.level1;

import java.util.Arrays;

public class Lotto {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/77484?language=java
     * 로또의 최고 순위와 최저 순위
     * lottos에 알아볼 수 없는 숫자를 0으로 가정했을 때, 가능성 있는 최고 등수와 최저 등수
     **/
    public int[] getLottosRanking(int[] lottos, int[] win_nums) {
        int correct = 0; // 맞춘 개수
        int cnt = 0; // 0의 개수
        int[] result = new int[2];

        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for(int lotto : lottos) {
            if (lotto == 0 ) { cnt += 1; continue; } /* 빈 값: 맞출 수도, 틀릴 수도 있는 개수 > lottos의 다음 값과 비교 */

            for (int wnum : win_nums) {
                if (lotto == wnum) { correct += 1; /* 번호 일치 */ }
                else if (lotto > wnum) { continue; /* win_nums의 다음 값과 비교 */ } // [IntelliJ review] 'continue' is unnecessary as the last statement in a loop
                else if (lotto < wnum) { break; /* lottos의 다음 값과 비교 */ } // [IntelliJ review] Condition 'lotto < wnum' is always 'true'
            }
        }

        int res; // 순위
        switch (correct) {
            case 6: res = 1; break;
            case 5: res = 2; break;
            case 4: res = 3; break;
            case 3: res = 4; break;
            case 2: res = 5; break;
            case 1: case 0: res = 6; break;
            default: res = 1;
        }

        result[1] = res;
        result[0] = res - cnt < 1 ? 1 : res - cnt; // [IntelliJ review] Can be replaced with 'Math.max' call

        System.out.println("#### result[0] " + result[0]); // 최고 순위
        System.out.println("#### result[1] " + result[1]); // 최저 순위

        return result;
    }
}
