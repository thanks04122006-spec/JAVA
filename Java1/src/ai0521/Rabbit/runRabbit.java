package ai0521.Rabbit;

public class runRabbit {
    public static void main(String[] args) {
        rabbit Rabbit1 = new rabbit();
        rabbit Rabbit2 = new rabbit("좁은네모");

        Rabbit1.setlocation(50,50);
        Rabbit2.setlocation(150,70);

        Rabbit1.setshape("기본");

        Rabbit1.printinfo();
        Rabbit2.printinfo();
//        기본모양의 토끼를 다이아몬드 모양의 토끼로 변경, 위치는 현재 X좌표에서 오른쪽으로 60 이동, Y좌표는 아래쪽으로 20 이동한 후 출력
        Rabbit1.setshape("다이아몬드");
        Rabbit1.setxpos(Rabbit1.getxpos() + 60);
        Rabbit1.setypos(Rabbit1.getypos() - 20);

        Rabbit1.printinfo();

//        좁은 네모 모양의 토끼가 현재 위치에서 오른쪽으로 50만큼, 왼쪽으로 20만큼 이동
        Rabbit2.printinfo();
        for (int i = 0; i < 5; i++) {
            Rabbit2.MoveRight();
        }
        Rabbit2.printinfo();
        for (int i = 0; i < 2; i++) {
            Rabbit2.MoveLeft();
        }
        Rabbit2.printinfo();
    }
}
