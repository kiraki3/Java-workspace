package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }
    public static void main(String[] args) {
        // 전달값, Parameter
        // 메소드는 어떤 값을 전달받아서, 그 값으로 수행하는 경우가 있다.
        // 거듭제곱 2 -> 2 * 2 = 4
        // 3-> 3 * 3 =9

        //Argument, 인수
        // number 값을 전달받아서 power메소드를 호출하여 실행한다.
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9

        powerByExp(2, 3); // 2 * 2 * 2 = 8
    }
}
