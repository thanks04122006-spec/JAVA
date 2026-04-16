package ai0402;

import java.util.Scanner;

public class wantsleep01 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double lb = 0.453592;
        double kg = 2.204623;

        System.out.printf("파운드 입력");
        int p = s.nextInt();
        double Kg = p * lb;
        System.out.printf("%d 파운드는 %.3f 킬로그램입니다 \n",p, Kg);

        System.out.printf("킬로그램 입력");
        int pp = s.nextInt();
        double pound = pp * kg;
        System.out.printf("%d 킬로그램는 %.3f 파운드입니다",pp, pound);

    }

    }
