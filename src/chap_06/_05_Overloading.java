package chap_06;

public class _05_Overloading {

    public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    // 다른 타입의 자료형을 받는 경우, 문자형을 정수값으로 변환 ex)"4" -> 4
   /* public static int getPowerStr(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }*/
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    // 정수값을 문자형으로 변환 5 -> "5"
  /*  public static String getPowerInt(int strNumber) {
        String str = Integer.toString(strNumber);
        return str;
    }*/

   /* public static String getPower(int strNumber) {
        String str = Integer.toString(strNumber);
        return str;
    }
*/
    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 자료형이 다르거나
        // 2. 전달값의 갯수가 다르더라도
        // 해당하는 메소드를 호출이 가능
        System.out.println(getPower(4));
        System.out.println(1+getPower("4"));

       /* // 정수값을 문자형으로 변환 5 -> "5"
        System.out.println(1+getPower(5));*/

        System.out.println(getPower(3,3));
    }
}
