package ai0521;

public class RunCar {
    public static void main(String[] args) {
        car sonata = new car("현대자동차", "소나타", 1600, "은색", 4000);
//        sonata.setName("그랜저");

        System.out.println("================자동차 정보===============");
        System.out.println("제조사: " + sonata.getProduct());
        System.out.println("자동차모델: " + sonata.getName());
        System.out.println("배기량: " + sonata.getDisplacement());
        System.out.println("색상: " + sonata.getColor());
        System.out.println("가격: " + sonata.getPrice());

        sonata.start();
        sonata.drive();
        sonata.forword();
        sonata.rotate("좌회전");
        sonata.drive();

        car ev6 = new car();
        ev6.setProduct("기아자동차");
        ev6.setName("ev6");
        ev6.setDisplacement(1500);
        ev6.setColor("파랑");
        ev6.setPrice(5000);

        System.out.println("================자동차 정보===============");
        System.out.println("제조사: " + ev6.getProduct());
        System.out.println("자동차모델: " + ev6.getName());
        System.out.println("배기량: " + ev6.getDisplacement());
        System.out.println("색상: " + ev6.getColor());
        System.out.println("가격: " + ev6.getPrice());


    }
}
