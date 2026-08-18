package ai0514;

public class dontinuetest1 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i%2 == 1)
                continue;
            sum += i;
        }
        System.out.printf("1부터 100까지의 합계(짝수의 합계):  %d", sum);
    }
}
