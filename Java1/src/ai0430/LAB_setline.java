package ai0430;

public class LAB_setline {
    public static void main(String[] args) {
        int fact = 1;
        int friend_num = 5;
        for (int i = 1; i <= friend_num; i++){
            fact = fact * i;
        }

        System.out.println("학생 다섯의 줄세우기 경우의 수 :" + fact);
    }
}
