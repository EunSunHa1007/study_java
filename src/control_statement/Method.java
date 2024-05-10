package control_statement;

public class Method {
    public static void main(String[] args) {
        // static : 정적 메소드(클래스 메소드)에서 호출하려면(main 등) 붙어야 함
        // 정적이 아닌 메소드(인스턴스 메소드)는 객체지향 섹션에서 배울 것.

        // static
        // 클래스에 고정되어 있는 변수나 메서드
        // 특징
        // 1. 메모리에 고정적으로 할당
        //    - static이 붙지 않는 메서드나 변수의 경우 객체가 생성될 때마다 호출되어 서로 다른 값을 가지고 있을 수 있다.
        //      각 객체들에서 공통적으로 하나의 값이 유지되어야 할 경우 static을 사용할 수 있다.
        // 2. 객체 생성 없이 사용할 수 있다.
        // 3. 프로그램이 시작되면 메모리의 static 영역에 적재되고, 프로그램이 종료될 때 해제된다.
        //    - 자동으로 메모리에 올라가기 때문에 객체 생성 없이 바로 사용할 수 있다.
        // 4. Static 메서드 내에서는 인스턴스 변수를 사용할 수 없다.

        // 💡 ... 연산자 : 해당 위치 뒤로 오는 연산자들을 배열로 묶음
        // int[] 과는 다름.
        // 다 정해진 인자들과 사용시 맨 마지막에 놓을 것.
        double avg = getAverage(3, 91, 14, 27, 4);


        int[] intNums = {1, 2, 3};

        //  ⭐️ 원시값은 '복사해서' 가져옴
        //  메소드 내부에서 값을 변경해도 원본에 영향 끼치지 않음
        modifyIntArg(intNums[0]); // intNums 결과 {1, 2, 3} 그대로

        //  참조형인 배열 자체를 인자로 사용
        //  ⭐️ 참조값은 주소값이므로 원본 그 자체를 가리킴
        // 참조형 변수를 인자로 사용할 때 유의할 것.
        modifyAryElem(intNums); // intNums 결과 {1, 3, 3} 원본 바뀜.
    }

    static double getAverage(int... nums) {
        double result = 0.0;
        for (int num : nums) {
            result += num;
        }
        return result / nums.length;
    }

    // 💡 메소드 오버로딩
    // 같은 메소드 이름, 다른 매개변수
    // 다른 자료형의 값들로 같은 성질의 작업을 정의할 때
    static int add(int a, int b) { return a + b; }

    //  매개변수의 개수가 다름
    static int add(int a, int b, int c) { return a + b + c; }

    //  매개변수의 자료형이 다름
    static double add(double a, double b) { return a + b; }

    //  ⚠️ 반환 자료형이 다른 것은 오버로딩 안 됨 - 다른 함수명 사용
    //  static double add(int a, int b) { return (double) (a + b); }

    static void modifyIntArg (int num) {
        System.out.printf("수정 전: %d%n", num++);
        System.out.printf("수정 후: %d%n", num);
    }

    static  void modifyAryElem (int[] ary) {
        System.out.printf("수정 전: %d%n", ary[1]++);
        System.out.printf("수정 후: %d%n", ary[1]);
    }
}
