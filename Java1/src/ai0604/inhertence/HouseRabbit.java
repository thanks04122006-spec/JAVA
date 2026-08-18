package ai0604.inhertence;
// 상속은 자원(필드와 메소드)를 확장해서 사용하는 것을 의미한다
public class HouseRabbit extends Rabbit {
//    주인이름
    String masterName;

//    사료먹기
    public void eatFeed(String Feedname) {
        System.out.println("집토끼가 "+ masterName +" 주인이 주는 "+ Feedname + "사료를 먹는다");
    }

//    메소드 재정의: super 클래스에 정의된 메소드를 sub 클래스에서 다시 정의하는 것
//    울타리 x좌표가 0을 벗어나지 않고 10씩 감소라게

    @Override
    public void MoveLeft() {
        if (xpos >= 10) {
            super.MoveLeft();
        }
        else {
            System.out.println("울타리를 벗어날 수 없습니다");
        }
    }

//    울타리 x좌표가 500을 벗어나지 않고 10씩 증가하게
    @Override
    public void MoveRight() {
        if (xpos <= 490) {
            super.MoveRight();
        }
        else {
            System.out.println("울타리를 벗어날 수 없습니다");
        }
    }
}
