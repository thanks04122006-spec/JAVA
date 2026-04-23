package ai0423;

import java.util.Scanner;

public class pc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("현재 만 나이를 입력해주세요:");
        int age =s.nextInt();
        String a = "0";

        if (age >= 19) {
            a = "계속 이용해주세요";
        }
        else a = "퇴실해주세요";

        System.out.println(a);

        s.close();
    }
}
