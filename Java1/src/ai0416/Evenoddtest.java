package ai0416;

import java.util.Scanner;

public class Evenoddtest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수 입력: ");
        int num = s.nextInt();
        String result = "";
        if (num%2==0){
            result = "짝수";
        }
        else {
            result = "홀수";
        }
        System.out.printf("%d는 %s입니다\n", num , result);

        s.close();
    }
}
