package ai0514;

public class dontinuetest {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i%4 == 0)
                continue;
            sum += i;
        }
        System.out.printf("1부터 100까지의 합계(4의 배수를 제외한:  %d", sum);
    }
}
