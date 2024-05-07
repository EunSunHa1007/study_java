package control_statement;

public class Switch {
    public static void main(String[] args) {
        //  💡 switch : 괄호 안에 기준이 될 변수를 받음
        //  가능한 자료형: byte, short, int, char, String, enum(이후 배움)
        //  💡 case : 기준에 일치하는 case로 바로 이동
        //  💡 break : switch문 실행을 종료
        //  💡 default: 해당하는 case가 없을 때 - 마지막에 작성

        // switch/case/default 기본 뼈대
        byte month = 1;

        /* byte season;

        switch (month){
            case 1: case 2: case 3:
                season = 1;
                break;
            case 4: case 5: case 6:
                season = 2;
                break;
            case 7: case 8: case 9:
                season = 3;
                break;
            case 10: case 11: case 12:
                season = 4;
                break;
            default:
                season = 0;
        }*/

        // 💡 인라인으로 작성
        byte season = switch (month){
            case 1, 2, 3 -> 1;
            case 4, 5, 6 -> 2;
            case 7, 8, 9 -> 3;
            case 10, 11, 12 -> 4;
            default -> 0;
        };
    }
}
