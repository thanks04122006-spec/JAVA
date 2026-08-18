package LastTest;

public class RunRPG {
    public static void main(String[] args) {
        // 전사와 마법사 객체 생성
        Warrior warrior = new Warrior("타이탄", 100, 50);
        Mage mage = new Mage("간달프", 60, 100);

        System.out.println("--- 캐릭터 생성 완료 ---");
        warrior.showStatus(); // 부모에게 물려받은 메서드 사용
        mage.showStatus();    // 부모에게 물려받은 메서드 사용
        System.out.println();

        System.out.println("--- 전투 시작 ---");
        // 오버라이딩된 각자의 공격 메서드 호출
        warrior.attack();
        mage.attack();
        System.out.println();

        System.out.println("--- 고유 스킬 사용 ---");
        // 각 자식 클래스만의 고유 메서드 호출
        warrior.defense();
        mage.castSpell();
    }
}
