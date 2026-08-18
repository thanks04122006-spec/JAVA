package ai0402;

import java.util.Scanner;

public class more {
    public static void main(String[] args) {

        int total = 0;

//        total -= 900 * 10;
//        total += 1800 * 2;
//        total -= 3500 * 5;
//        total += 4000 * 4;
//        total += 1500;
//        total += 2000 * 4;
//        total += 1800 * 5;
//
//        System.out.printf("%d", total);



    }
    public static int Buy(int num1, int num2){
        Scanner s = new Scanner(System.in);
        System.out.printf("구매한 항목의 가격을 입력해 주세요");
        num1 = s.nextInt();
        System.out.printf("구매한 항목의 갯수을 입력해 주세요");
        num2 = s.nextInt();

        s.close();
        return(num1*num2);
    }
    public static int Sell(int num3, int num4){
        Scanner s = new Scanner(System.in);
        System.out.printf("판매한 항목의 가격을 입력해 주세요");
        num3 = s.nextInt();
        System.out.printf("판매한 항목의 갯수을 입력해 주세요");
        num4 = s.nextInt();

        s.close();
        return(num1*num2);
    }

}