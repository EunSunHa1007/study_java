package control_statement;

public class ForLoop {
    public static void main(String[] args) {
        // 💡 배열의 루프
        // 4의 배수 차례로 10개 배열에 담기
        // 1. 내 풀이(배열 기준)
        int[] intArray1 = new int[10];
        for(int i = 0; i < intArray1.length; i++){
            intArray1[i] = 4 * (i + 1);
        }

        // 2. 예제(요소 기준)
        int[] intArray2 = new int[10];
        for(int i = 1, c = 0; c < intArray2.length; i++){
            if( i % 4 == 0){
                intArray2[c++] = i;
            }
        }

        // 💡 continue와 break
        // 💡 continue : 조건에 맞을 때 한 루프만 건너뜀
        // 💡 break : 조건에 맞을 때 블록 전체를 종료
        // 💡 label
        // [라멜 이름] :
        // for(초기화; 조건식; 증감식) {
        //    break [라벨이름];
        // }
        // 라멜을 사용한 break 문은 중첩 반복문에서 특정 블록만 탈출하고 싶을 때 유형
        // [라벨 이름]이 달린 코드 블록 전체를 탈출


        //예1
        System.out.println("\n- - 중첩/label1 - - -\n");

        outer :
        for(int i = 0; i < 10; i++){

            inner :
            for(int j = 0; i < 10; j++){
                if(j % 2 == 0) continue inner;
                if(i * j >30) continue outer;

                if(j > 8) break inner;
                if(i - j > 7) break outer;

                System.out.printf("i: %d, j: %d%n", i, j);
            }
        }

        //예2
        System.out.println("\n- - 중첩/label2 - - -\n");

        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j > 2) {
                    System.out.println("Breaking out of the outerLoop label");
                    break outerLoop;   // 두 for문 모두 종료!
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
