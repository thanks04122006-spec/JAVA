package ai0409;

public class stringtest {
    public static void main(String[] args) {
        String s ="난처자바";
//        int len = s.length();
        System.out.println("내용:"+s);
        System.out.println("내용:"+ s.length());

        s = "wlqdPrkrhtLvekd";
        System.out.println("대문자로 출력:" + s.toUpperCase());
        System.out.println("원래 문자열:" + s);
        System.out.println("소문자로 출력:" + s.toLowerCase());
        System.out.println("원래 문자열:" + s);

        s = "    jshfkj sh  fk";
        System.out.println("trim 전의 문자:" + s);
        System.out.println("trim 후의 문자:" + s.trim());

    }
}
