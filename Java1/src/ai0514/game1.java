package ai0514;

import java.util.Random;
import java.util.Scanner;

public class game1 {
    public static void main(String[] args) {
        int cnum = 0;
        int num = 0;
        int count = 1;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        cnum = rand.nextInt(5)+1;

        while (true) {
            System.out.printf("게임 "+count+"회: 컴퓨터가 생각한 숫자는?: ");
            num = s.nextInt();

            if (num == cnum) {
                System.out.printf("정답입니다, %d회 시도하셨습니다", count);
                break;
            }

            System.out.println("다시 한번 생각해보세요");
            count++;
        }
    }
}
