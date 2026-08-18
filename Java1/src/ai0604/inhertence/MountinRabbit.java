package ai0604.inhertence;

public class MountinRabbit extends Rabbit {
    //    산이름
    String MountinName;

    //    풀먹기
    public void eatGrass(String Grasstype) {
        System.out.println("산토끼가 "+ MountinName +" 에서 "+ Grasstype + "풀을 먹는다");
    }
}
