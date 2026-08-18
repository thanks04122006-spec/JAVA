package ai0326;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args){
        System.out.println("====나이계산====");
        Scanner s = new Scanner(System.in);
        System.out.println("출생연도를 입력하세요:");

        int Birth_year = s.nextInt();
//        현재 연도 구하는 법:calender 함수 쓰기
        Calendar calendar = Calendar.getInstance();

        int Now_year = calendar.get(Calendar.YEAR);


        int Age = Now_year - Birth_year;
        System.out.println("현재나이는 만"+ Age +"세 입니다");
        s.close();
    }
}
