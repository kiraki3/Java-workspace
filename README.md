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


## chap_02 연산자
### _01_Operator1 
* 일반 연산자 -> 사칙연산 +-*/
* 증감 연산자 ->  ++a > 식을 먼저 계산하고 나서 1을 더함, a++ 1을 더하고 나서 계산을 함
### _02_Operator2
* 대입 연산자 -> 일반 연산자와 같이 사용. a = a + 1;
* 복합 대입 연산자 -> a += 1;
### _03_Operator3
* 비교 연산자 -> 5는 3보다 크다 5 > 3 / 5 <= 3 
* 3은 3과 같지 않다 3 != 3 false
### _04_Operator4
* 논리 연산자 || && 
* || 하나라도 true 이면 true
* && 모두 true 여야 true
### _05_Operator5
* 삼항 연산자 (조건) ? "참" : "거짓"


## chap_03
### _01_String1
* 문자열의 길이 : .length()
* 대소문자 변환 : .toUpperCase() .toLowerCase()
* 포함관계 : .containts("**")
* 문자열의 위치 정보 : .indexOf("***") -> ***의  문자가 어디에 있는지 0부터 세어서 찾아준다.
* 문자열의 위치 정보 : .indexOf("0") -> 0의 첫 번째 문자의 위치
* 문자열의 위치 정보 : .laseIndexOf("0") -> 0의 마지막 문자 위치
* 이 문자열로 시작하나 : .startsWith("****") -> 이 문자열로 시작하면 true 아니면 false
* 이 문자열로 끝나나 : .endsWith("***") -> 이 문자열로 끝나면 true 아니면 false

### _02_String2
* 문자열 변환 : .replace("0", "1") -> 0을 1로 변환
* .substring(7) -> index 0qnxj 7번째 문자열
* 원하는 문자만 출력 : .substring(.indexOf("Java"), .indexOf(".")) -> JAva 부터 시작해서 .의 직전까지만 출력
* 공백 제거 : .trim()
* 문자열 결함 : .concat()

### _03_String3
* 문자열 비교 : .equals("") // 같으며 true 다르면 false
* 대소문자 상관업이 내용만 같은지 확인하고 싶을때 : s.qualsIngnoreCase("000")

