package variable_operator;

public class Array {
    public static void main(String[] args) {
        //  💡 선언
        char[] charArrau1 = new char[3];
        char[] charArray2 = {'A', 'B', 'C', 'D'};
        char[] charArray3 = new char[]{'A', 'B', 'C', 'D'};
        char[] charArray4;
        charArray4 = new char[3];

        //  💡 이중배열
        int[][] intArray = new int[][]{
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        //  💡 원시 자료형 primitive type /참조 자료형 reference type
        //  ⭐ 원시 자료형은 값 자체를 복사 - 별개의 값이 됨

        boolean bool1 = true;
        boolean bool2 = false;
        bool2 = bool1;
        bool1 = false; // bool2에 bool1(true)을 대입한 상태에서 bool1값이 false로 변경될 때 bool2값이 true1의 변경된 값을 따라가지 않는다.
        // bool1 : false  bool2 : true

        //  ⭐ 참조 자료형은 값 주머니의 주소를 복사
        //  두 변수가 같은 주머니를 가리키게 됨

        boolean[] boolAry1 = { true, true, true };
        boolean[] boolAry2 = { false, false, false };
        boolAry2 = boolAry1;
        boolAry1[0] = false; // boolAry2에 boolAry1을 대입한 상태에서 boolAry값이 변경될 때 bool2에도 변경된 값이 반영된다.
        // boolAry1 [false, true, true]  boolAry2 [false, true, true]


        //  ⭐️ 문자열은 객체(참조형)지만 원시형처럼 다뤄짐

        // ⭐️ 상수 배열의 경우
        final int[] NUMBERS = {1, 2, 3, 4, 5};

        //  다른 배열을 할당하는 것은 불가
        // NUMBERS = new int[] {2, 3, 4, 5, 6};

        //  배열의 요소를 바꾸는 것은 가능
        NUMBERS[0] = 11;

        String[] strings = {"한놈", "두시기", "석삼", "너구리"};

        //  💡 join 정적 메소드 - 문자열(정확히는 CharSequence)의 배열을 하나로 이어붙임
        //  첫 번째 인자를 각 사이에 삽입
        String join1 = String.join(", ", strings);
        String join2 = String.join("-", strings);
    }
}
