package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // and 를 , 로 변환
        System.out.println(s.substring(7)); // index 기준 7부터 시작
        System.out.println(s.substring(4));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // Java로 부터 시작해서 .의 직전까지 출력

        // 공백 제거
        s = "                  I love you                 ";
        System.out.println(s);
        System.out.println(s.trim()); // 문자의 양 끝의 공백을 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python

    }


}
