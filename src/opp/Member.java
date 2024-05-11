package opp;

public class Member {
    // 💡 정적 필드와 메소드
    // - 인스턴스마다 따로 갖고 있을 필요 없는 것들
    // - 정적 메소드에서는 인스턴스 프로퍼티 사용 불가
    static String service = "자바 트레이닝 센터";
    static int lastNm = 0;
    static void contact() {
        System.out.printf("사용자 정보는 대표번호로 문의해주세요.");
    }

    String name;
    int age;
    String role;
    int no;

    // 💡 생성자메소드
    // - 메소드 이름 없이, 반환 타입(해당 클래스) 뒤로 괄호 따라옴
    // - new 연산자와 함께 인스턴스 반환
    // - 작성되지 않을경우 인자 없이 호출, 컴파일러가 자동 생성
    // 자동생성 윈도우 : alt + insert
    Member(String name, int age, String role){
        // 💡this : 생성될 인스턴스 가리킴
        // 메소드 내에서 같은 이름의 변수나 인자가 없다면 this의 필드를 가리킴
        this.name = name;
        this.age = age;
        this.role = role;
        // 클래스 변수를 활용하여 생성마다 새 번호 부여
        this.no = ++lastNm;
    }

    void introduce() {
        String roleName = (role.equals("admin")) ? "관리자" : (role.equals("teacher")) ? "선생님" : "학생";
        System.out.printf("%d번 회원님의 이름은 %s, 나이는 %d살 이고 %s 입니다.%n", no, name, age, roleName);
    }
}
