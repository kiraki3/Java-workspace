package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        // menu > Run > Edit Configurations > + > Application > creat name
        // ["테스트", "전달값", "입니다"]
        for (String s : args ) {
            System.out.println(s);
        }

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납

        // length == 1 이란 말은 String 값을 한번 입력했다 라는 뜻
        if(args.length == 1) {
            switch (args[0]) {
                case "1" :
                    System.out.println("도서 조회");
                    break;
                case "2" :
                    System.out.println("도서 대출");
                    break;
                case "3" :
                    System.out.println("도서 반납");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
        else {
            System.out.println("잘못 입력하셨습니다. 1~3 중의 숫자를 입력하세요. ");
        }
    }
}
