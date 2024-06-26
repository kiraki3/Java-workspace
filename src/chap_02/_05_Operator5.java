package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
       //결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max); // 5
        int min = (x < y) ? x : y;
        System.out.println(min); // 3
        // x와 y가 같은지
        boolean b = (x == y) ? true : false;
        System.out.println(b); // false

        x = 3;
        y = 3;
        String s = (x != y) ? "달라요" : "같아요"; // x와 y는 같지않아요?
        System.out.println(s); // 같아요
    }
}
