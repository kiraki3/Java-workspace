package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또 다른 손님이 들어오면? // ctrl+d 문장 복붙
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");

        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");

        // 만약에 매장 이름이 바뀌면?
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        // 알기 쉽게 표기
        System.out.println("for");
        // 반복문 사용
        // for (선언;조건;증감)
        for ( int i = 0; i < 10 ; i++) {
            System.out.println("환영합니다. 코난입니다." + i);
        }
        
        //짝수만 출력 fori 까지 입력하면 for 문
        // 0 2 4 6 8
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        // 홀수만 출력
        // 1 3 5 7 9
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 출력
        for (int i = 5; i > 0 ; i--) {
            System.out.println(i);
        }

        System.out.println();

        // 1부터  10까지 수들의 합
        // 1+2+3+4...+10 = 55

        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum = sum + i;
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
    }
}
