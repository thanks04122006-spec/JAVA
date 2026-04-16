package ai0416;

public class ReplaceAllTest {
    public static void main(String[] args) {
        String s1 = new String("한국 폴리텍             서울 정수 캠퍼스");
        String s2 = s1.replaceAll(" ","");

        System.out.println("원래 문자열: "+s1);
        System.out.println("바꾼 문자열: "+s2);

        s1 = "인공지능 소프트웨어학과 1학년";
        System.out.println("\"지능\"의 인덱스번호 : " + s1.indexOf("지능"));
        System.out.println("\"웨\"의 인덱스번호 : " + s1.indexOf("웨"));

        s1 = "한국에는 한국폴리텍대학이 한국 전체의 많은 곳에 위치해 있습니다";
        System.out.println("s1의 4번 위치부터 찾아서 한국이라는 문자열의 인덱스 번호:"+ s1.indexOf("한국",4));

        s1 = "서울정수";
        System.out.println("길이" + s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(3));

//        s1에서 "울정" 문자열만 반환 받아보세요
        System.out.println(s1.substring(1,3));

        s1 = "블랙핑크";
        System.out.println("길이" + s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(2));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println();
    }
}
