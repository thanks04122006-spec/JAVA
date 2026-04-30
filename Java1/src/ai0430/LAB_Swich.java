package ai0430;

import java.util.Scanner;

public class LAB_Swich {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("출생연도 네자리를 입력하세요: ");
        int BrithYear = s.nextInt();
        String animal = "";

        switch (BrithYear % 12) {
            case 0:
                animal = "원숭이";
                break;
            case 1:
                animal = "닭";
                break;
            case 2:
                animal = "개";
                break;
            case 3:
                animal = "돼지";
                break;
            case 4:
                animal = "쥐";
                break;
            case 5:
                animal = "소";
                break;
            case 6:
                animal = "호랑이";
                break;
            case 7:
                animal = "토끼";
                break;
            case 8:
                animal = "용";
                break;
            case 9:
                animal = "뱀";
                break;
            case 10:
                animal = "말";
                break;
            case 11:
                animal = "양";
                break;
            default:
                animal = "잘못된 출생연도입니다";
        }

        System.out.printf("%d년생은 %s띠입니다\n",BrithYear,animal);

        s.close();
    }
}
