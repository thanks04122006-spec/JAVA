package ai0521.Rabbit;

public class rabbit {
//    JVM은 클래스내에 생성자가 하나도 없는 경우 기본생성자를 만들어서 사용한다.
//    그러나 클래스 내에 생성자가 선언 되어있다면 선언된 생성자만 사용할 수 있다.
//====================객체 생성=====================================
    private String shape; //토끼모양
    private int xpos; // X 위치
    private int ypos; // Y 위치


//===========================기본생성자=========================================

    public rabbit() {
    }
    public rabbit(String shape, int xpos, int ypos) {
        this.shape = shape;
        this.xpos = xpos;
        this.ypos = ypos;
    }
    //=============  getter setter 메소드=================================
    public String getshape() {
        return shape;
    }

    public void setshape(String shape) {
        this.shape = shape;
    }

    public int getxpos() {
        return xpos;
    }

    public void setxpos(int xpos) {
        this.xpos = xpos;
    }

    public int getypos() {
        return ypos;
    }

    public void setypos(int ypos) {
        this.ypos = ypos;
    }

//  =================토끼의 좌표값을 설정하는 메소드 구현====================
    public void setlocation(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public rabbit(String shape) {
        this.shape = shape;
    }

    public rabbit(int xpos, int ypos) {
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
