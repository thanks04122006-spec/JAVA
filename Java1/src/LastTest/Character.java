package LastTest;

public class Character {
    String name;
    int hp;

    // 생성자
    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // 공통 메서드
    public void attack() {
        System.out.println(name + "이(가) 기본 공격을 합니다");
    }

    // 상태 출력 메서드
    public void showStatus() {
        System.out.println("[" + name + "] HP: " + hp);
    }
}
