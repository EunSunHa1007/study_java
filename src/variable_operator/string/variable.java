package variable_operator.string;

public class variable {
    public static void main(String[] args) {
        //문자열 자료형
        // 문자열 String 은 참조 자료형이지만 특별히 원시값과 유사하게 사용될 수 있다.

        // 기본 자료형(Primitive Type) - byte, short, int, long, float, double, char, boolean
        // 참조자료형(Reference Type) - String, Array, Map, Set 등
        // 차이점 : 참조 자료형은 메서드를 가질 수 있고 기본값은 null이다.
        // String : char의 배열로 구현된 참조 자료형. Java가 따로 제공하며 유용한 메서드를 제공한다.

        // 💡 문자열 선언
        // 1. 리터럴 방식
        String str1 = "Hello World!";
        String str2 = "안녕하세요.반갑습니다~ ️";

        // 2. 빈 문자열 가능
        String str3 = "";

        // 3. 인스턴스 생성 방식
        String str4 = new String("나중에 자세히 배웁니다.");

        // 💡 == & equals
        // 1. 리터럴 생성 시
        // * String 값은 Heap 영역 내 String Constant Pool에 저장되어 재사용된다.
        // hl1, hl2는 같은 곳을 가리키고 있다.
        String hl1 = "Hello";
        String hl2 = "Hello";
        String wld = "World";

        //  리터럴끼리는 == 을 사용하여 비교 가능
        boolean bool1 = hl1 == hl2;  //"Hello"  --> True
        boolean bool2 = hl1 == wld;  // false

        // 2. 객체 인스턴스(new)로 생성시
        // * 같은 내용이여도 객체가 각각 Heap 영역 차지
        String hl3 = new String("Hello");
        String hl4 = new String("Hello");
        String hl5 = hl4;  // 같은 곳을 참조하므로 == True

        // 인스턴스와 비교하려면 .equals 메소드를 사용해야 함
        // 특별한 경우가 아니면 문자열은 .equals로 비교할 것
        boolean bool3 = hl3 == hl4; // 둘다 다른 곳을 가리키므로 false
        boolean bool6 = hl3.equals(hl4); //equals 일땐 값이 같아서 true

        // 💡 + 연산자
        // 1. 문자열을 이어붙임
        // 2. 상수에는 적용할 수 없음
        // 3. 문자열에 다른 자료형을 더하면 문자열로 이어붙여짐
        int intNum = 123;
        float fltNum = 1.234f;
        boolean bln = false;
        String str = "문자열과 다른 자료형을 더해봅시다,";

        String varyVarSum = str + intNum + fltNum + bln;

        // 💡 타 자료형간 변환
        // 1. 타 자료형 -> 문자형 String.valueOf()
        String chng1 = String.valueOf(true);
        String chng2 = String.valueOf(123);
        String chng3 = String.valueOf('가');
        // 2. 타 자료형 -> 문자형 + 빈문자열과 연산 -> 문자열로 이어붙여짐
        String chng4 = false + "";
        // 3. 문자형 -> 정수 자료형
        String str123 = "123";
        byte chng5 = Byte.parseByte(str123);
        short chng6 = Short.parseShort(str123);
        int chng7 = Integer.parseInt(str123);
        long chng8 = Long.parseLong(str123);
        // 3. 문자형 -> 불린 자료형 - 대소문자 무관 'true'일 때 true 반환
        boolean chng9 = Boolean.parseBoolean("TRUE");
        boolean chng10 = Boolean.parseBoolean("true");
        // 3. 문자열 -> 문자 - 문자열 메소드 charAt() -> char 반환

        // 💡 이스케이프 표
        //   \" 큰따옴표
        //   \’ 작은따옴표
        //   \n 줄바꿈
        //   \t  탭
        //   \\ 백슬래시 하나
    }
}

