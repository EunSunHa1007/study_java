package variable_operator.string;

public class Method {
    public static void main(String[] args) {
        // 문자열 메소드
        // 💡 문자열 길이 반환 length()
        // 💡 빈 문자열 여부
        // 1. isEmpty() : 문자열의 길이가 0인지 여부
        // 2. isBlank() : 공백(white space)을 제외한 문자열의 길이가 0인지 여부
        // 💡 트리밍 : 앞뒤 공백 제거 trim()
        String str1 = "\t 안 녕 하 세 요 .... ! \n";
        String str2 = str1.trim();
        // 변수 그 자체에 적용하기
        // - 문자열은 불편(기존의 문자열은 그대로 존재) : 변수가 가리키는 주소를 바꾸는것.
        str1 = str1.trim();

        // 💡 문자 반환 charAt()
        // 💡 문자(열)의 위치 반환 indexOf/lastIndexOf: 일치하는 첫/마지막 문자열의 위치
        // 💡 값 동일 여부 확인 : equals() / equalsIgnoreCase() - 대소문자 구분하지 않고 비교
        // 💡 포함 여부 확인 : contains() - 포함 여부 / startWith() - 시작 여부 / endsWith() - 해당 문자열로 끝남 여부
        // 💡 정규표현식 일치 여부 확인 : matches()
        // 💡 문자열 비교 : compareTo - 사전순 비교에 따라 양수 또는 음수 반환, 같은 문자열이면 0 반환
        //                compareToIgnoreCase - 대소문자 구분 없이 비교

        String str_a1 = "ABC";
        String str_a2 = "ABCDE";
        String str_a3 = "ABCDEFG";

        //  같은 문자열이면 0 반환
        int int_a1 = str_a1.compareTo(str_a1); // 0

        //  시작하는 부분이 같을 때는 글자 길이의 차이 반환
        int int_a2 = str_a1.compareTo(str_a2); //str_a1이 str_a2보다 글자수가 2개 적다. -> -2
        int int_a3 = str_a1.compareTo(str_a3); //str_a1이 str_a3보다 글자수가 4개 적다. -> -4
        int int_a4 = str_a3.compareTo(str_a1); //str_a3이 str_a1보다 글자수가 4개 많다. -> 4

        String str_a4 = "HIJKLMN";

        //  시작하는 부분이 다를 때는 첫 글자의 정수값 차이 반환
        int int_a6 = str_a1.compareTo(str_a4); //"ABC"&"HIJKLMN" 'A'는 'H'보다 7만큼 앞에 있음 -> -7
        int int_a7 = str_a4.compareTo(str_a3); //"HIJKLMN"&"ABCDEFG" 'H'는 'A' 보다 7만큼 뒤에 있음 -> 7

        // 💡 대소문자 변환 toUpperCase(), toLowerCase()
        // 💡 이어붙이기 concat() - null 불가, 메서드 체이닝 시 매번 문자열을 반환하여 메모리 차지
        String str_d1 = new StringBuilder("a")  // 성능면에서 우수
                .append("b")
                .append("c")
                .append("d")
                .toString(); // "abcd"가 생성됨
        // "a", "b", "c", "d", "abcd"가 생성되어 메모리 차지

        //  concat은 매 번 문자열을 반환하므로
        String str_d2 = "a"
                .concat("b") // "ab"가 생성됨
                .concat("c") // "abc"가 생성됨
                .concat("d"); // "abcd"가 생성됨
        // "a", "b", "c", "d", "ab", "abc", "abcd"가 생성되어 메모리 차지

        // 💡 반복하기 repeat() 주어진 정수만큼 반복
        // 💡 잘라오기 substring() ~번째 문자부터 (~번째 문자까지) 잘라서 반환.
        // 💡 치환 replace() 주어진 앞의 문자(열)을 뒤의 문자(열)로 치환, 메서드 체이닝
        //        replaceAll() 전부 치환 replaceFirst() 첫 번째 일치부분만 치환 , 정규표현식 사용 가능
        // 💡 배열 반환 toCharArray() : 문자열을 분할하여 문자의 배열로 반환
        //             split() : 주어진 기준으로 (~개까지) 분할하여 문자열 배열로 반환
        String str3 = "하나 둘 셋 넷 다섯";
        char[] chAry2 = str3
                .replace(" ", "")
                .toCharArray();  //[하, 나, 둘, 셋, 넷, 다, 섯]

        String[] strAry4 = str3.split(" ", 3); // ["하나", "둘", "셋 넷 다섯"]
    }

}
