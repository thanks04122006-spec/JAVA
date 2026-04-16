package ai0326;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        System.out.println("## 택배 보내기입니다. 다음을 각각 입력해 주세요##");
        System.out.println("받는 사람:");
        String Name = s.nextLine();
        System.out.println("주소:");
        String addr = s.nextLine();
        System.out.println("무게(g):");
        Double Weight = d.nextDouble();

        System.out.printf("**받는 사람:%s\n", Name);
        System.out.printf("**주소:%s\n" , addr);
        System.out.printf("**배송비: %.0f원  ", (Weight*5));

        s.close();
        d.close();
    }
}
