package chap_06;

public class _07_VariableScope {
    public static void methodA() {
        // System.out.println(number);
        // System.out.println(result);
    }

    public static void methodB() {
        int result = 1; // 지역변수 (선언한 메소드(중괄호)안에서만 사용할 수 있는 변수)
    }
    public static void main(String[] args) {
        int number = 3;
        // System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i);
    }
}
