package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환 typecasting
        //정수형에서 실수형
        //실수형에서 정수형으로

        int score = 93;
        System.out.println(score);

        // int to float or double
        System.out.println((float)score); // 93.0
        System.out.println((double)score); // 93.0

        // float or doutle to in
        float score_f = 93.9F;
        double score_d = 98.2;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score); // 191

        // 정수 + 실수 연산
        score_d = (double) 93 + 98.8;
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int > long > float > double

        int convertedScoreInt = (int) score_d; // 191.8 > 191
        // double > float > long > int (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // 93
        s1 = Integer.toString(93); // 정수를 문자열로 93

        // 실수를 문자열로
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double b = Double.parseDouble("98.6");
        System.out.println(b);

        System.out.println(i + b);










    }
}
