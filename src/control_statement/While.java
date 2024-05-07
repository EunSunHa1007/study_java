package control_statement;

public class While {
    public static void main(String[] args) {
        // 💡 continue
        // continue문은 skip 이라고 할 수 있다
        // continue 밑에 아래 코드들은 수행하지 않고 다음 조건으로 넘어간다.
        // for문일 경우 증감식으로 while인 경우 조건식으로
        
        // 100 보다 작은 3의 배수 출력
        int i = 1;

        while(true){
            int cur = i++;

            if(cur == 100) break;
            if(cur % 3 != 0) continue;

            System.out.println(cur);
        }


        // 💡 do ... while : 조건이 false여도 do 한번은 무조건 수행한다.
        int enemies = 0;

        System.out.println("일단 사격");

        do {
            System.out.println("탕");   // while 조건이 false여도 일단 실행
            if (enemies > 0) enemies--;
        } while (enemies > 0);

        System.out.println("사격중지 아군이다");

        // 💡 중첩예제
        final int LINE_WIDTH = 5;

        int lineWidth = LINE_WIDTH;

        while (lineWidth > 0) {
            int starsToPrint = lineWidth--;
            while (starsToPrint-- > 0) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
