package com.company.level1;

public class ValidationId {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/72410?language=java
     * 신규 아이디 추천
     * 메모리 생각하기, 정규식
     **/
    public String validation(String new_id) {
        // new로 배열 생성 시, 길이 변경 가능, 다시 생성 및 초기화 가능
        String[] strArry = new String[1];

        // 1. 대문자 -> 소문자 치환
        // 2. 알파벳 소문자, 숫자, _, -, . 제외한 문자 제거
        strArry[0] = new_id.toLowerCase().replaceAll("[^\\w.\\-]", ""); // [IntelliJ] Redundant character escape '\\.' in RegExp -> .

        // 3. 마침표(.)가 두 개 이상 연속되면 하나로 치환
        strArry[0] = strArry[0].replaceAll("\\.+", ".");

        // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
        strArry[0] = strArry[0].replaceAll("^\\.|\\.$", "");

        // 5. 빈 문자열이라면, a 대입
        if (strArry[0].isEmpty()) strArry[0] = "a";

        // 6. 길이가 16자 이상이면, 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if (strArry[0].length() > 15) strArry[0] = strArry[0].substring(0, 15);

        // 6-1. 제거 후 마침표(.)가 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        strArry[0] = strArry[0].replaceAll("\\.$", "");

        // 7. 길이가 2자 이하라면,7 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
        if (strArry[0].length() < 3) {
            StringBuilder strBuilder = new StringBuilder();
            String str = strArry[0];
            int length = str.length();
            int loop = 2 - length;
            strBuilder.append(str);
            for (int i=0; i<=loop; i++) strBuilder.append(str.substring(length-1));
            strArry[0] = String.valueOf(strBuilder);
        }

        System.out.println("### " + strArry[0]);
        return strArry[0];
    }

//    private String replaceStr(List<Map<String, String>> regs, String str) {
//        String[] arry = new String[1];
//        arry[0] = str;
//
//        for (Map regMap : regs) {
//            String reg = String.valueOf(regMap.get("reg"));
//            String replacement = String.valueOf(regMap.get("replacement"));
//            arry[0] = arry[0].replaceAll(reg, replacement);
//        }
//
//        return String.valueOf(arry[0]);
//    }
}
