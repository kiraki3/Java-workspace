package Chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // Array 배열
        // 같은 자료형의 값 여러 개를 저장하는 연속되는 공간

        // 커피 뭐 마실래?
        String coffeeRose = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRose + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
//        String[] coffees = new String[4]; // 크기 4개의 String 값을 가지는

        // 배열 선언 두 번째 방법
        // String coffees[] = new String[4];
        // index 값
//        coffee[0] = "아메리카노";
//        coffee[1] = "카페모카";
//        coffee[2] = "라떼";
//        coffee[4] = "카푸치노";

        // 배열 선언 세 번째 방법
//        String[] String = new String[] {"아메리카노","카페모카", "라떼", "카푸치노"};

        // 배열 선언 네 번째 방법
        String[] coffees = {"아메리카노","카페모카", "라떼", "카푸치노"};

        System.out.println("-----------------------------------");

        // 커피 주문
        System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
        System.out.println(coffees[1] + " 하나");
        System.out.println(coffees[2] + " 하나");
        coffees[2] = "에스프레소"; // 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");

        System.out.println("--------------------");

        // 다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[] {1.0, 10.2, 100.3};
        boolean[] b = {true, true, false,false};
        System.out.println(d[2]);
    }
}
