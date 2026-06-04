package ai0604.inhertence;

public class RunRabbit {
    public static void main(String[] args) {
        HouseRabbit hr1 = new HouseRabbit();
        hr1.shape = "동그라미";
        hr1.setlocation(30, 50);
        hr1.MoveRight();
        hr1.printinfo();
        hr1.masterName = "폴리";
        hr1.eatFeed("좋은 ");

        System.out.println("++++++++++++++  /\\_/\\  ++++++++++++++\n" +
                "               ( o.o )\n" +
                "+++++++++++++++  > <  +++++++++++++++");

        MountinRabbit Mr1 = new MountinRabbit();
        Mr1.shape = "세모";
        Mr1.MoveLeft();
        Mr1.MoveLeft();
        Mr1.MountinName = "남산";
        Mr1.printinfo();
        Mr1.eatGrass("클로버");
    }
}
