package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님 중에 노쇼 손님이 있다고 가정
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼

        // for문
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            // 손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 즉시 반복문을 멈추고 다시 다음 회차로 시작한다.
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }

        // while 문
        sold = 0;
        int index = 1; // 손님 번호
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if(index == noShow) {
                System.out.println(index + "번 손님, 노쇼 맞죠? 넘어 갈게요~");
                index++;
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("금일 영업을 종료합니다.");
    }
}
