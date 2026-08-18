package ai0430;

public class hap {
    public static void main(String[] args) {
        int hap = 0;

        for(int i = 1; i <= 10; i++){
            hap += i;

            if(i <10)
                System.out.printf(i + "+");
            else
                System.out.printf(i + "=");
        }
        System.out.printf("%d\n", hap);
        System.out.println("1부터 10까지의 합계:" + hap);
    }
}
