package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        // 나는 커피를 오후 3시에 아이를 마신다
        int hour = 10;

        // If 문 내에서 하나의 문장을 실행할 때는 {} 생략 가능
        if (hour < 15)
            System.out.println("아아 주세요");

        // If 문 내에서 두개의 문장을 실행할 때는 {} 생략 불가
        if (hour < 15) {
            System.out.println("아아 주세요");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료1");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우
        hour = 10;
        boolean morning_coffee = false;
        // 오후 2시 이전 모닝커피를 마시지 않았다면 아아를 마신다
        // if (hour <= 14 && morning_coffee == false){
        //
        if (hour <= 14 && !morning_coffee){
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료2");

        // 오후 2시 이후 이거나 모닝 커피를 마신 경우
        hour = 10;
        morning_coffee = true;
        if (hour >= 14 || morning_coffee == true ) {
            System.out.println("아이스 디카페인 +1");
        }
        System.out.println("커피 주문 완료3");

        // 오후 15시이거나 모닝커피를 마시지 않은 경우
        // 15시 인것만 해당될때,
        hour = 15;
        morning_coffee = false;
        if (hour >= 14 || morning_coffee == true) { // morning_coffee 로만 적어도 가능
            System.out.println("아이스 디카페인 +1");
        }
        System.out.println("커피 주문 완료4");

    }
}
