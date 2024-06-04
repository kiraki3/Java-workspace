package Chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노","카페모카", "라떼", "카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-----------------");

        // 배열의 길이를 이용한 순회(배열의 길이를 모를때 사용)
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("--------------------");

        // enhanced for (for-each) 반복문
//        for (String coffee : coffees) {
//            System.out.println(coffee + " 하나");
//        }
//        System.out.println("주세요!");
        // for-each
        for (String coffee :
                coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("즈세요");

        // index 의 값을 알고싶거나, 이용하여 값을 찾고 싶을때는 for
        // 상관없이 배열의 값을 다 알고 싶으면 enhanced for (for-each)
    }
}
