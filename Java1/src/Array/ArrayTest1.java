package Array;

import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
//        5개의 성적을 입력 받아서 저장 할 수 있는 1차원 배열 객체를 생성
        int[] score = new int[5];
        String[] subject = {"프로그래밍언어실습","데이터베이스","융합 UI실습","인공지능 개론","직업과 경력개발"};

//        콘솔창에서 키보드로 입력한 성적을 가져와서 배열에 저장
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < score.length; i++) {
            System.out.println(" -"+ subject[i] +" 성적 입력(정수값): ");
            score[i] = s.nextInt();
        }

//        배열에 저장된 성적들을 한줄에 출력하고
//        그 다음줄에 성적의 전체 합계가 출력되게 하세요
        int Sum = 0;

//        for (int i = 0; i < score.length; i++) {
//            System.out.printf("| 성적 %d번:%d | ", i+1 ,score[i]);
//            Sum += score[i];
//        }

//        enhanced for문
        for(int i = 0; i < score.length; i++){
            System.out.printf(subject[i] + score[i] + "  " );
            Sum += score[i];
            i++;
        }

        System.out.printf("\n 합계는 %d이다\n", Sum);
        System.out.println("평균은 " + Sum / score.length);

        s.close();
    }
}
