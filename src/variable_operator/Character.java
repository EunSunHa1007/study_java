package variable_operator;

public class Character {
    public static void main(String[] args) {
        // 문자 자료형 character 2byte 단따옴표 사용
        // 각 문자는 유니코드에 상응하는 정수를 가진다.
        char ch1 = 'A';
        char ch2 = '가';

        int ch1Int = (int) ch1;
        int ch2Int = (int) ch2;


        // 💡 정수값을 얻는 다른 방법들
        // 1. int로 형변환
        char ch_a1 = 'A';
        int int_a1 = (int) ch_a1;
        // 2. 정수값과 연산하기
        int int_a2 = ch_a1 + 0;
        int int_a3 = ch_a1 - 0;

        //  💡 리터럴에 더할 때와 변수에 더할 때 반환 자료형이 다름
        // 1. 리터럴에 정수값 연산 - 문자 반환
        char ch_a2 = 'A' + 1;
        // 2. 변수에 정수값 연산 - 정수 반환
        //char ch_a3 = ch_a1 + 1; // ⚠️ 불가
        int int_a4 = ch_a1 + 1;

        //  💡 문자 '1' 의 연산 -> 해당 문자의 정수값을 가지고 연산한다 (49)
        char ch_b1 = '1';
        char ch_b2 = '2';

        //  ⚠️ 숫자 문자에 사칙연산 - 문자 번호 기준 결과 반환
        char ch_b3 = '1' + '2'; // 49 + 50 = 99 --> 'c' 반환
        int int_b4 = ch_b1 + ch_b2;  // 변수끼리 더해서 'c' 반환 안되고 99 반환된다.

        //  💡 아래의 기능으로 문자가 의미하는 정수로 변환
        int int_d1 = java.lang.Character.getNumericValue('1'); // '1' -> 1 로 반환
        int int_d2 = java.lang.Character.getNumericValue('2'); // '2' -> 2 로 반환

        //  ⚠️ 빈 문자는 사용 불가, 공백(space)는 가능
        //char empty = ''; -- 불가
        char space = ' ';
    }
}
