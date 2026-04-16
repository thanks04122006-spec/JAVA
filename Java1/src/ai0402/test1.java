package ai0402;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("정수 1==>");
        int num1 = s.nextInt();
        System.out.printf("정수 2==>");
        int num2 = s.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
        System.out.println(num1 + "x" + num2 + "=" + (num1*num2));
        System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
        System.out.println(num1 + "%" + num2 + "=" + (num1%num2));

        s.close();
    }
}
