package variable_operator.real_num;

public class variable {
    public static void main(String[] args) {
        //실수자료형들
        // float 4byte : 뒤에 f 또는 F 붙여 표현, double을 담을 수 없음.
        // double 8byte : float 보다 범위 넓고 정밀하게 표현 가능

        double a = 0.1, b = 0.2;

        //  ⚠️ 오차가 생김 -- 부동소수점
        double c = a + b;

    }
}
