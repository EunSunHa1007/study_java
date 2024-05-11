package opp;

public class Main {
    public static void main(String[] args) {
        //Member
        Member member1 = new Member("홍길동", 30, "admin");
        Member member2 = new Member("박정하", 26, "teacher");
        Member member3 = new Member("김수연", 14, "student");

        member1.introduce();
        member2.introduce();
        member3.introduce();

        // Member - 정적 필드/메소드 - 인스턴스 생성하지 않고 사용
        // 인스턴스에서는 클래스의 필드와 메소드 사용 가능 - 권장하진 않음
        String serviceName = Member.service;
        Member.contact();

        // IntArrayInfo
        // 정수배열 정보 클래스
        // - 배열을 생성자 인자로 받아, 그것의 정보를 필드들로 저장
        IntArrayInfo intInfo1 = new IntArrayInfo(new int[]{1, 2, 3, 4, 5});
        IntArrayInfo intInfo2 = new IntArrayInfo(new int[]{3, 5, 9, 2, 8, 1, 4});
        intInfo1.showResult();
        intInfo2.showResult();
    }
}
