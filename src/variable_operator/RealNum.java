package variable_operator;

public class RealNum {
    public static void main(String[] args) {
        //실수자료형들
        // float 4byte : 뒤에 f 또는 F 붙여 표현, double을 담을 수 없음.
        // double 8byte : float 보다 범위 넓고 정밀하게 표현 가능

        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김 -- 부동소수점
        double c = a + b;

        long lng1 = 123;

        //  정수를 대입할 시 묵시적 변환
        //  💡 float(4바이트)에도 long(8바이트)의 값 담을 수 있음
        float flt3 = lng1; // flt3:123.0
        double dbl3 = lng1; // dbl3:123.0

        long lng2 = Long.MAX_VALUE;

        //  ⭐ 큰 수(정확히 표현가능한 한도를 넘어서는)일 경우
        //  가능한 최대 정확도로
        float flt4 = lng2; //flt4: 9.223372E18
        double dbl4 = lng2; //dbl4: 9.223372036854776E18

        //-----------------------------------------------------------//
        // 복합 대입 연산자와 단항 연산자
        float flt5 = 123.45F;
        flt5 += 6.78;
        flt5++;
        flt5++;
        flt5--;

        // float 끼리 연산은 float 반환
        // float과 double의 연산은 double 반환
        // 부동 소수점 방식상 오차 자주 있음  -- BigDecimal 클래스 사용

        //비교 연산
        int int1 = 5;
        float flt1 = 5f;
        double dbl1 = 5.0;
        double dbl2 = 7.89;

        //  💡 정수/실수간, 다른 숫자 자료형간 사용 가능
        boolean bool0 = 123 == 123F;//false

        boolean bool1 = int1 == flt1;//true
        boolean bool2 = flt1 == dbl1;//true
        boolean bool3 = int1 == dbl2;//false

        boolean bool4 = int1 > dbl2;//false
        boolean bool5 = flt1 >= dbl2;//false
        boolean bool6 = dbl1 < dbl2;//true
    }
}
