package ai0611.abstractTest;

public class Man extends Person{
//    추상클래스를 상속 받으려면
//    추상 메소드를 구현하거나 현재클래스가 추상클래스여야 한다
    @Override
    public void study() {
        System.out.println("아들이 공부를 열심히 한다");
    }
}
