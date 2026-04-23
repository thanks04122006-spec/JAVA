package ai0423;

import java.util.Scanner;
public class bmitest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);//문자열 입력용
        System.out.println("=============== BMI(Body Index Mass) ===============\n");

        System.out.print("* 체중(㎏, 실수값) 입력:");
        double weight = s.nextDouble();

        System.out.print("* 키(㎝, 실수값) 입력:");
        double height = s.nextDouble();

        System.out.print("* 성명 입력:");
        String name = s1.nextLine();

        double bmi = weight / Math.pow(height/100, 2); //((height/100)*(height/100))

        String Weight = "0";

        if (bmi >= 35) {
            Weight = "고도비만";
        }
        else if (bmi >= 30) {
            Weight = "중증도 비만";
        }
        else if (bmi >= 25) {
            Weight = "경도비만";
        }
        else if (bmi >= 23) {
            Weight = "과체중/위험체중";
        }
        else if (bmi >= 18.5) {
            Weight = "정상체중";
        }
        else Weight = "저체중";

        System.out.printf("현재 bmi지수는 %.2f이고 %s범위입니다",bmi,Weight);

        s.close();
        s1.close();
    }
}

