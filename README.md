# 자바 코딩 강의
 - `출처 : https://www.youtube.com/watch?v=NQq0dOoEPUM`

왜 시작? 안드로이드 강의 듣는데 자바 속성의 이해가 부족...

## chap_01 폴더
### _01 HelloWorld 
 * 출력 System.out.println("helloworld");
### _02 DataTypes
 * 문자열, 숫자, 정수, 불리값 출력
 * 변수를 선언하여 값을 대입하는 방법 "="
### _03 Variables
 * 문자열 + 숫자 + 정수 + 불리값을 합쳐서 출력
### _04 Comment
 * 주석 달기 
 * `한줄 달기` // : ctrl+/  
 * `여러 줄 달기` /* */ : ctrl+shift+/
### _05_VariableNaming
 * 변수 이름을 짓는 방법
  1. 저장할 값에 어울리는 이름
  2. 밑줄(_), 글자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
  3. 밑줄 또는 문자로 시작 가능
  4. 한 단어 또는 2개 이상 단어의 연속
  5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
  6. 예약어 사용 물가 (public, static, void, int, double, float, ...)
  7. 절대 변하지 않는 상수는 대문자로 

### _06_Constants (변하지 않는 수)
 * final : 오직 한 번만 할당되거나 정의된 후 변하지 않는 entity 를 정의할 때 사용 (예 : 생년월일, 원주율, 국가번호 등..)

### _07_TypeCasting
 * 형변환
  1. 정수형에서 실수형으로 int score = 93.5; > (float)score (double)score
  2. 실수형에서 정수형으로 float score_f =  75.5F; > (int)score_f
  3. 정수 + 실수 연상 score = 92 + (int) 88.8;
  4. 변수에 형변환된 데이터 집어 넣기 double convertedScroeDouble = score;
                                    int convertedScoreInt = (int) score_f; 
  5. 숫자를 문자열로 String s1 = String.valueOf(93);
                           s1 = Integer.toString(93);
    
    integer : 영어로 정수 int를 String 으로 String 을 int 로 변환하는 래퍼 클래스
  6. 문자열을 숫자로 int i = Integer.parseInt("93");
                    double d = Double.parseDouble("98.8");
