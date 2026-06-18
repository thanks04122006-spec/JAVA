package ai0618;

public class Tank implements Car , Cannon {
    @Override
    public void Fire() {
        System.out.println("대포 발사!");
    }

    @Override
    public void Move() {
        System.out.println("탱크가 이동한다.");
    }
}
