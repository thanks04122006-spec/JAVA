package Drinks;

import java.util.Scanner;

public class homework0519 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=============레시피 검색기=============");
        System.out.println("1. 아메리카노 2.카페 라떼 3.바닐라 라떼 4.카페 모카 5.아이스 초코");
        System.out.printf("검색할 음료의 숫자를 입력해주세요:");
        int name = sc.nextInt(); // 음료의 숫자 입력받기

        if (name < 1 || name > 5) { //리스트외에 다른 숫자가 입력되었을때 오류 반환하기
            System.out.println("원하는 음료의 숫자를 입력해주세요.");
            return;
        }


        switch (name) {
            case 1: // 아메리카노 레시피
                System.out.println("재료:\n" +
                        "\n" +
                        "에스프레소 1샷\n" +
                        "물 150~200ml\n" +
                        "얼음\n" +
                        "\n" +
                        "만드는 법:\n" +
                        "\n" +
                        "컵에 얼음을 넣는다\n" +
                        "물을 붓는다\n" +
                        "에스프레소 샷을 위에 넣는다");
                break;
            case 2: // 카페라뗴 레시피
                System.out.println("재료:\n" +
                        "\n" +
                        "에스프레소 1샷\n" +
                        "우유 150ml\n" +
                        "\n" +
                        "만드는 법:\n" +
                        "\n" +
                        "컵에 에스프레소를 넣는다\n" +
                        "따뜻하게 데운 우유를 넣는다\n" +
                        "(옵션) 우유 거품 살짝 추가");
                break;
            case 3: //바닐라 라떼 레시피
                System.out.println("재료:\n" +
                        "\n" +
                        "에스프레소 1샷\n" +
                        "우유 150ml\n" +
                        "바닐라 시럽 10~15ml\n" +
                        "\n" +
                        "만드는 법:\n" +
                        "\n" +
                        "바닐라 시럽을 컵에 넣는다\n" +
                        "에스프레소를 넣는다\n" +
                        "우유를 붓는다");
                break;
            case 4: // 카페 모카 레시피
                System.out.println("재료:\n" +
                        "\n" +
                        "에스프레소 1샷\n" +
                        "우유 150ml\n" +
                        "초콜릿 시럽 15ml\n" +
                        "(옵션) 휘핑크림\n" +
                        "\n" +
                        "만드는 법:\n" +
                        "\n" +
                        "초콜릿 시럽 + 에스프레소 섞기\n" +
                        "우유 넣기\n" +
                        "위에 휘핑크림 올리기");
                break;
            case 5: // 아이스 초코 레시피
                System.out.println("재료:\n" +
                        "\n" +
                        "초콜릿 파우더 20g (또는 시럽)\n" +
                        "우유 200ml\n" +
                        "얼음\n" +
                        "\n" +
                        "만드는 법:\n" +
                        "\n" +
                        "컵에 초코와 우유를 넣고 잘 섞는다\n" +
                        "얼음 넣기");
                break;
        }
    }
}
