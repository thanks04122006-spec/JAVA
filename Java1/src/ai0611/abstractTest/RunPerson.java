package ai0611.abstractTest;

public class RunPerson {
    public static void main(String[] args) {
        Man man = new Man();
        man.name = "김폴리";
        man.height = 180;
        man.weight = 70;
        Woman woman = new Woman();
        woman.name = "박인순";
        woman.height = 170;
        woman.weight = 48;

        man.eat("김치찌개");
        man.study();
        man.sleep(8);

        woman.eat("파스타");
        woman.study();
        woman.sleep(10);
    }
}
