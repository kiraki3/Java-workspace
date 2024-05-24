package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("Javas")); // false

        // 문자열의 위치정보
        System.out.println(s.indexOf("Java")); // 7 처음글자부터는 0, 빈칸도 세어줌
        System.out.println(s.indexOf("C#")); // 포함되지 않는 다면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보(12)
        System.out.println(s.lastIndexOf("and")); // 마지막 일치하는 위치 정보 (23)
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true 아니면 false
        System.out.println(s.endsWith("C.")); // 이 문자열로 끝나면 true 아니면 false


    }
}
