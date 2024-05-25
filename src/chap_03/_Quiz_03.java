package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        // 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오

        String Id = "930920-2555888";
        // 0 위치부터 8 위치 직전까지
        System.out.println(Id.substring(0,8));
        Id = "030708-4567890";
        //-뒤를 기준으로 찾을때 : 0 위치부터 하이픈 위치 + 직전까지
        System.out.println(Id.substring(0, Id.indexOf("-") + 2));

    }
}
