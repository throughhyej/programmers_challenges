package com.company.level1;

public class Convert {
    /**
     * https://programmers.co.kr/learn/courses/30/lessons/81301
     * 숫자 문자열과 영단어
     * enum명을 파라미터로 넘길 수 있는지 고민해보기
     **/
    enum Matching {
        zero("0")
        , one("1")
        , two("2")
        , three("3")
        , four("4")
        , five("5")
        , six("6")
        , seven("7")
        , eight("8")
        , nine("9");

        private final String num;
        Matching(String str) { this.num = str; } // [IntelliJ] Modifier 'private' is redundant for enum constructors
        public String getNum() {
            return num;
        }
    }

    public int converToNum(String str) {
        String[] strArry = new String[1];
        strArry[0] = str;

        Matching[] enumArry = Matching.values();
        String[] matchingArry = new String[enumArry.length];
        //  String[] matchingArry = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (Matching i : enumArry) {
            int idx = Integer.parseInt(i.getNum());
            String value = String.valueOf(Matching.valueOf(String.valueOf(i)));
            matchingArry[idx] = value;
        }

        for (String val : matchingArry) {
            if (strArry[0].contains(val)) {
                strArry[0] = strArry[0].replaceAll(val, String.valueOf(Matching.valueOf(val).getNum()));
            }
        }

        System.out.println("#### > " + strArry[0]);
        return Integer.parseInt(strArry[0]);
    }
}
