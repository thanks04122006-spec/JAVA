package ai0514;

import java.util.Random;

public class whileTestrandom {
    public static void main(String[] args) {
        int a, b, c, count = 0;
        count = 0;
        Random rand = new Random();

        while (true) {
            a = rand.nextInt(6) + 1;
            b = rand.nextInt(6) + 1;
            c = rand.nextInt(6) + 1;

            count++;
            if (a == b && b == c) {
                System.out.println("3개의 주사위는 모두 " + a + "입니다");
                System.out.printf("총 %d번 돌렸습니다", count);
                break;
            }
        }
    }
}