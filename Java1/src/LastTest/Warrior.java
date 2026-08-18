package LastTest;

public class Warrior extends Character{
    int shield; // 전사만의 고유 속성

    public Warrior(String name, int hp, int shield) {
        super(name, hp); // 부모 클래스의 생성자 호출
        this.shield = shield;
    }

    // 부모의 attack() 메서드를 전사에 맞게 재정의 (오버라이딩)
    @Override
    public void attack() {
        System.out.println(name + "이(가) 강력한 검으로 휘두르기 공격을 합니다!");
    }

    // 전사만의 고유 메서드
    public void defense() {
        System.out.println(name + "이(가) 방패로 방어 자세를 취합니다.(방어력: "+ shield + ")");
    }
}
