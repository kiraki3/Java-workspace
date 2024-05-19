package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
    // 문자열
        String name;
        name = "경민";
    // 위와 동일 String name = "경민";

        // 숫자
        int hour = 6;

        System.out.println("경민아 자 지금 6시야! 빨리하자");
        System.out.println("경민이도 하고 싶어ㅠㅠ");
        System.out.println(name + "아 자 지금" + hour + "시야! 빨리하자 ");
        System.out.println(name + "이도 하고 싶어ㅠㅠ");


        // 실수
        double score = 90.5;
        char grade = 'A'; // 한 글자의 문자열일 경우에는 작은따옴표
        // 새로운 변수에 값을 업데이트
        name = "재형";
        System.out.println(name + "님 의 " + "점수는 " + score + "점으로" + " 이번 등급은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);


        // 실수의 변수 double float
        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        // 정수 타입 변수 byte int long
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }

}
