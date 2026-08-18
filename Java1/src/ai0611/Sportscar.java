package ai0611;

public class Sportscar extends Car {
    @Override
    public void upSpeed(int speed) {
        this.speed += speed;

        if (this.speed > 200) {
            this.speed = 200;
        }
    }
}