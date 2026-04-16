package ai0326;

import java.util.Scanner;

public class ScannerTest03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.println("====bmi 계산기====");

        System.out.println("이름을 입력하세요:");
        String Name = s1.nextLine();

        System.out.println("몸무게(kg)으로 입력하세요:");
        double Weight = s.nextDouble();

        System.out.println("키(cm)로 입력하세요");

        double Height = s.nextDouble();

        double bmi = Weight / Math.pow(Height/100, 2); // (Height/100)*(Height/100)
        System.out.printf("%s님의 현재 bmi수치는 %.1f입니다", Name, bmi);

        s.close();
        s1.close();
    }
}
