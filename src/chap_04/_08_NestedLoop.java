package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 로 사각형 만들기
        for (int i = 0; i < 5; i++) {
            //for (int j = 0; j < 5; j++) {
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.println();
        }
        System.out.println("2번째");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("3번째");
        // 왼쪽 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("4번째");
        // 오른쪽 삼각형 만들기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //피라미드 별 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
