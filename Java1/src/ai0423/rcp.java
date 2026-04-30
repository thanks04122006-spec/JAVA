package ai0423;

import java.util.Random;
import java.util.Scanner;

public class rcp {
    public static void main(String[] args) {
        System.out.println("******************가위바위보 게임*******************");
        Scanner s = new Scanner(System.in);
        System.out.println("가위 바위 보 중에 하나를 입력해주세요: ");
        String me = s.nextLine();

        Random rand = new Random();
        String[] com = {"가위","바위","보"};
        int R = rand.nextInt(3);
        String comChoices = com[R];

        System.out.println("* 컴퓨터의 가위바위보 : " + com[R]);
        String result = "";

        System.out.println("안내면 진거 가위바위보!");

        if(me.equals("가위")){
            if(comChoices.equals("가위")){
                System.out.println("비겼습니다");
            }
            else if(comChoices.equals("바위")){
                System.out.println("졌습니다");
            }
            else if(comChoices.equals("보")){
                System.out.println("이겼습니다");
            }
        }
        if(me.equals("바위")){
            if(comChoices.equals("바위")){
                System.out.println("비겼습니다");
            }
            else if(comChoices.equals("보")){
                System.out.println("졌습니다");
            }
            else if(comChoices.equals("가위")){
                System.out.println("이겼습니다");
            }
        }
        if(me.equals("보")){
            if(comChoices.equals("보")){
                System.out.println("비겼습니다");
            }
            else if(comChoices.equals("가위")){
                System.out.println("졌습니다");
            }
            else if(comChoices.equals("바위")){
                System.out.println("이겼습니다");
            }
        }

        s.close();
    }
}
