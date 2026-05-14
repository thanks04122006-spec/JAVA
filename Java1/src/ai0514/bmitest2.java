package ai0514;

import java.util.Scanner;

public class bmitest2 {
    public static void main(String[] args) {
        double weight, height;
        String name;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);//문자열 입력용
        System.out.println("=============== BMI(Body Index Mass) ===============\n");

        while (true) {
            System.out.print("* 체중(㎏, 실수값) 입력:");
            weight = s.nextDouble();

            System.out.print("* 키(㎝, 실수값) 입력:");
            height = s.nextDouble();

            System.out.print("* 성명 입력(exit: 프로그램 종료):");
            name = s1.nextLine();

            if (name.equals("exit"))
                break;

            double bmi = weight / Math.pow(height / 100, 2); //((height/100)*(height/100))

            String Weight = "0";

            if (bmi >= 35) {
                Weight = "고도비만";
            } else if (bmi >= 30) {
                Weight = "중증도 비만";
            } else if (bmi >= 25) {
                Weight = "경도비만";
            } else if (bmi >= 23) {
                Weight = "과체중/위험체중";
            } else if (bmi >= 18.5) {
                Weight = "정상체중";
            } else Weight = "저체중";

            System.out.printf("현재 bmi지수는 %.2f이고 %s범위입니다\n", bmi, Weight);
        }
        s.close();
        s1.close();
    }
}

