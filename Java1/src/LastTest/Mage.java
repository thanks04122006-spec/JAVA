package LastTest;

public class Mage extends Character{
    int mp; // 마법사만의 고유 속성

    public Mage(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    // 부모의 attack() 메서드를 마법사에 맞게 재정의 (오버라이딩)
    @Override
    public void attack() {
        System.out.println(name + "이(가) 마법 지팡이로 원거리 평타를 날립니다!");
    }

    // 마법사만의 고유 메서드
    public void castSpell() {
        if (mp >= 10) {
            mp -= 10;
            System.out.println(name + "이(가) 파이어볼 마법을 시전했습니다!(남은 MP: " + mp + ")");
        } else {
            System.out.println(name + "의 마나가 부족합니다!");
        }
    }
}
