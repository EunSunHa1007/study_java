package opp;

public class IntArrayInfo {
    int count;
    int max;
    int min;
    int sum; // 기본 0
    double avg;

    IntArrayInfo(int[] intArray){
        count = intArray.length;
        max = intArray[0];
        min = intArray[0];

        for(int i : intArray){
            max = (i > max) ? i : max;
            min = (i > min) ? min : i;
            sum += i;
        }
        avg = 1.0 * sum / count;
    }

    void showResult() {
        System.out.printf("count : %d%n, max : %d%n, min : %d%n, sum : %d%n, avg : %s%n", count, max, min, sum, avg);
    }
}
