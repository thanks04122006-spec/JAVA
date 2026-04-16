package ai0409;

import java.util.Scanner;

public class ooo {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("과목1 입력");
        double socre1 =s.nextDouble();
        System.out.println("과목2 입력");
        double socre2 =s.nextDouble();
        System.out.println("과목3 입력");
        double socre3 =s.nextDouble();

        double avg = (socre1 * 3 + socre2 * 3 + socre3 * 2)/(3 + 3 + 2 );

        System.out.printf("%.2f입니다", avg);

        s.close();
    }
}
