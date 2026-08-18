package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArratTest2 {
    public static void main(String[] args) {
        String[] subject = {"프로그래밍언어실습","데이터베이스","융합 UI실습"};

        System.out.println(" 현재 배열의 길이 : "+ subject.length);
        System.out.println(" 현재 배열의 내용: ");

        for(String subjects : subject){
            System.out.println(subject + " ");
        }
        System.out.println();

        subject = Arrays.copyOf(subject , subject.length + 2);
        subject[subject.length-2] = "인공지능처리";
        subject[subject.length-1] = "직업과 경력개발";

        System.out.println("새로운 배열의 길이 "+ subject.length);
        for(String subjects : subject){
            System.out.println(subject + " ");
        }
        System.out.println();
    }
}
