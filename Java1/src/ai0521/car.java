package ai0521;

public class car {
        private String product;
        private String name;
        private int displacement;
        private String color;
        private int Price;

//        생성자: 객체를 생성할 때 사용
//        생성자의 역할:객체가 생성될 떄 필드의 값을 초기화
//        기본 생성자(default constructor): 객체만 생성하고 필드의 값을 초기화시키지 않는다.

//        기본생성자
        public car() {
        }

//      일반적인 생성자

        public car(String product, String name, int displacement, String color, int price) {
                this.product = product;
                this.name = name;
                this.displacement = displacement;
                this.color = color;
                Price = price;
        }

//        getter 메소드: 필드에 저장된 값을 반환
//        setter 메소드: 필드에 값을 설정(저장)
        public String getProduct() {
                return product;
        }

        public void setProduct(String product) {
                this.product = product;
        }
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public int getDisplacement() {
                return displacement;
        }

        public void setDisplacement(int displacement) {
                this.displacement = displacement;
        }

        public int getPrice() {
                return Price;
        }

        public void setPrice(int price) {
                Price = price;
        }

        // car의 기능에 해당하는 메소드
        public void start(){
                System.out.println(name + "자동차에 시동을 건다");
        }

        public void off(){
                System.out.println(name + "자동차에 시동을 끈다");
        }

        public void drive(){
                System.out.println(name + "자동차가 주행을 시작한다");
        }

        public void stop(){
                System.out.println(name + "자동차가 멈춘다");
        }

        public  void forword(){
                System.out.println(name + "자동차가 전진한다");
        }

        public  void backword(){
                System.out.println(name + "자동차가 후진한다");
        }

        public  void rotate(String dirention){
                System.out.println(name + "자동차가"+ dirention +"한다");
        }

}


