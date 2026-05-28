package ai0528.acsess.modifier;

public class RunRabbit {
    public static void main(String[] args) {
        Rabiit rabbit = new Rabiit();

//        rabbit.setShape("동그라미");
        rabbit.shape = "삼각형";
        rabbit.printinfo();
//        rabbit.setlocation(50,50);
        rabbit.x = 50;
        rabbit.y = 50;
        rabbit.printinfo();
    }
}
