package com.company.level1;

import java.util.Arrays;

public class Keypad {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/67256
     * 키패드 누르기
     *
     * 중복 소스 함수화
     **/
    public String pressKeypad(int[] numbers, String hand) {
        StringBuilder result = new StringBuilder();
        String[][] keypad = {
                  {"1", "2", "3"}
                , {"4", "5", "6"}
                , {"7", "8", "9"}
                , {"*", "0", "#"}
        };

        int[] currentLeft = new int[] {3, 0}; // 왼손 시작점 *
        int[] currentRight = new int[] {3, 2}; // 오른손 시작점 #

        for (int idx=0; idx<numbers.length; idx++) { // [IntelliJ] 'for' loop replaceable with enhanced 'for'
            String pressed = String.valueOf(numbers[idx]);
            if (!pressed.matches("[0-9]")) continue;
//            System.out.print("> " + pressed + "\t");
            for (int i=0; i<keypad.length; i++) {
                for (int j=0; j<keypad[i].length; j++) {
//                    System.out.printf("#### > [%d][%d] = %s\t", i, j, keypad[i][j]);
//                    if (j == 2) System.out.println();
                    if (pressed.equals(keypad[i][j])) {
                        if (j == 0) {
                            result.append("L");
                            currentLeft[0] = i; currentLeft[1] = j;
                        }
                        else if (j == 2) {
                            result.append("R");
                            currentRight[0] = i; currentRight[1] = j;
                        }
                        else {
                            int left = 0;
                            int right = 0;
                            int leftRow = Math.abs(i - currentLeft[0]);
                            int leftColumn = Math.abs(j - currentLeft[1]);
                            int rightRow = Math.abs(i - currentRight[0]);
                            int rightColumn = Math.abs(j - currentRight[1]);

                            // 이동 총 거리 체크 후 비교로 수정
                            left = leftRow + leftColumn;
                            right = rightRow + rightColumn;

                            if (left > right) {
                                result.append("R");
                                currentRight[0] = i; currentRight[1] = j;
                            }else if (left < right) {
                                result.append("L");
                                currentLeft[0] = i; currentLeft[1] = j;
                            }else {
                                if ("right".equalsIgnoreCase(hand)) {
                                    result.append("R");
                                    currentRight[0] = i; currentRight[1] = j;
                                }else {
                                    result.append("L");
                                    currentLeft[0] = i; currentLeft[1] = j;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.println("return > " + result.toString());
        return result.toString();
    }
}
