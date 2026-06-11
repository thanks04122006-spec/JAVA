package ai0611.abstractTest;

public abstract class Person {
    String name;
    int weight;
    int height;

    public void eat(String food) {
        System.out.println(food +"를 먹는다");
    }

    public void sleep(int hours) {
        System.out.println(hours + "시간 잔다");
    }

    public abstract void study();
}
