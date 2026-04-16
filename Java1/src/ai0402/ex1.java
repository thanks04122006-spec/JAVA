package ai0402;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("시험점수를 입력하세요:");
        int total = s.nextInt();
        if (total >= 70)
            System.out.println("합격");
        else
            System.out.println("불합격");
        s.close();
    }
}
