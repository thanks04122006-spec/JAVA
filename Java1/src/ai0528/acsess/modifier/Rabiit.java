package ai0528.acsess.modifier;

public class Rabiit {
//    private String shape;
//    private int x;
//    private int y;
    public String shape;
    public int x;
    public int y;

//    디폴트 제한자는 같은 패키지 내에서만 적용가능

//    public String getShape() {
//        return shape;
//    }
//
//    public void setShape(String shape) {
//        this.shape = shape;
//    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void printinfo() {
        System.out.printf("%s 모양의 토끼는 (%d, %d)좌표에 위치하고 있다.\n", shape, x, y);
    }

    public Rabiit(String shape) {
        this.shape = shape;
    }

    public Rabiit() {

    }
    public void setlocation(int xpos, int ypos) {
        this.x = xpos;
        this.y = ypos;
    }

}
