package variable_operator;

public class Integer {
    public static void main(String[] args) {
        /* 정수 자료형
        byte 1바이트(8bit)
        short 2바이트
        int 4바이트
        long 8바이트 */

        byte _1b_byte = 1;
        short _2b_short = 2;
        int _4b_int = 3; // 일반적으로 널리 사용
        long _8b_long = 4;


        // 1. 이항 연산자 + - * / % 부수효과를 일으키지 않는다.
        int a = 1 + 2;
        int b = a - 1;
        int c = b * a;
        int d = a + b * c / 3;
        int e = (a + b) * c / 3;
        int f = e % 4;

        //--------------------------//
        byte b1 = 1;
        byte b2 = 2;
        short s1 = 1;
        short s2 = 2;

        // 아래는 모두 불가 - byte와 short의 연산들은 int 반환
        // byte b3 = b1 + b2;
        // short s3 = b1 + b2;
        // short s4 = b1 + s2;
        // short s5 = s1 + s2;

        long l1 = 1;
        long l2 = 2;
        // long 끼리의 연산은 long 반환
        long l3 = l1 + l2;
        //--------------------------//

        // 2. 복합 대입 연산자 += -= *= /= %=
        int cp = 1;
        cp = cp + 2;

        cp += 3;

        // 값을 반환하기도 함
        int cp2 = cp += 4;

        // + 일반 대입 연산자도 값을 반환. i2->i1->i3
        int i1 = 0;
        int i2 = 1;
        int i3 = (i1 = i2); // 괄호 제거해도 같음

        // 3. 단항 연산자 ++ -- , 리터럴에는 사용 불가!
        //    앞에 붙는지 뒤에 붙는지에 따라 부수효과 차이를 명확히 구분해야한다.
        int int1 = 3;

        int int2 = int1++; // int2 = 3 int1 = 3
        int int3 = ++int1; // int1 = 4 + 1 = 5  int 3 = 5
        int int4 = -(int2-- * --int3); // int2 = 3 * int 3 = 4 -> 12 int4 = -12
        // int2 = 2
        //4. 비교연산자 == != > >= < <=
    }
}
