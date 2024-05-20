package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 도착 정보를 출력하는 프로그램을 작성
        // 각 정보는 적절한 자료형의 변수에 정의
        // 버스 번호는 "1234", "상무64"과 같은 형태
        // 남은 시간은 분 단위 (예 : 3분, 5분)
        // 남은 거리는 KM 단위 (예 : 1.5KM, 0.8KM)

        String bus1 = "1234";
        String bus2 = "상무64";

        int min1 = 3;
        int min2 = 5;

        double dis1 = 1.5;
        double sid2 = 0.8;

        System.out.println("곧 도착할 버스 번호는 " + bus1 + "입니다.");
        System.out.println(bus2 + " 번은 " + min1 +  "분 남았습니다." );



    }
}
