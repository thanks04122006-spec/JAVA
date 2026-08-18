package ai0416;

import java.util.Scanner;

public class overlabiftest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int num = s.nextInt();

        if(num > 100){
            if(num < 1000)
                System.out.printf("입력된 숫자 %d는 100보다 크고 1000보다 작아", num);
            else
                System.out.println("1000보다 크다");
        }
        else if(num < 100){
            System.out.printf("입력된 숫자 %d는 100보다 작아", num);
        }
        s.close();
    }
}
