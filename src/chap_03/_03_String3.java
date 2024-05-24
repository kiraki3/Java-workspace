package chap_03;

public class _03_String3 {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // p가 소문자여서 false
        // 대소문자 상관없이 내용만 확인하고 싶을때
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화 -> 자바에서 내용을 비교하기위해서는 equals 를 사용하자
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true (내용) 벽에다가 붙여놓은 화장실 비밀번호를 참조
        System.out.println(s1 == s2); // true (참조) 영수증에 써놓은 화장실 비밀번호

        s1 = new String("1234"); // new 로 새 변수를 선언하면 참조하는것이 달라진다
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true 
        System.out.println(s1 == s2); // false > 


    }
}
