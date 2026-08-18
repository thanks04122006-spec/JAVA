package ai0514;

import java.util.Scanner;

public class whiletest01 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int hap = 0;
        int num1, num2 = 0;

        while (true) {
            System.out.printf("숫자1 ====>");
            num1 = s.nextInt();
            if (num1 == -1)
                break;
            System.out.printf("숫자2 ====>");
            num2 = s.nextInt();

            hap = num1 + num2;
            System.out.printf("%d + %d = %d\n", num1, num2, hap);
        }
        s.close();
    }
}
