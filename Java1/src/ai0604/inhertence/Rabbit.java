package ai0604.inhertence;

public class Rabbit {
//    super클래스의 필드 또는 메소드 앞에 private를 붙이는 sub클래스의 사용이 금지된다.
    //    JVM은 클래스내에 생성자가 하나도 없는 경우 기본생성자를 만들어서 사용한다.
//    그러나 클래스 내에 생성자가 선언 되어있다면 선언된 생성자만 사용할 수 있다.
//====================객체 생성=====================================
    public String shape; //토끼모양
    int xpos; // X 위치
    int ypos; // Y 위치


//===========================기본생성자=========================================

    public Rabbit() {
    }
    public Rabbit(String shape, int xpos, int ypos) {
        this.shape = shape;
        this.xpos = xpos;
        this.ypos = ypos;
    }
    //=============  getter setter 메소드=================================


    //  =================토끼의 좌표값을 설정하는 메소드 구현====================
    public void setlocation(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public Rabbit(String shape) {
        this.shape = shape;
    }

    public Rabbit(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }
    //    Call by Reference객체 주소값
    public void printinfo() {
        System.out.printf("%s 모양의 토끼는 (%d, %d)좌표에 위치하고 있다.\n", shape, xpos, ypos);
    }

    //    X축으로 10씩 오른쪽으로 이동하는 메소드
    public void MoveRight(){
        xpos += 10;
    }

    //    X축으로 10씩 왼쪽으로 이동하는 메소드
    public void MoveLeft(){
        xpos -= 10;
    }

}
