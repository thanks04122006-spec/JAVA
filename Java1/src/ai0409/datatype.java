package ai0409;

//기본자료형:숫자형과 숫자가 아닌것으로 나눠진다
public class datatype {
    public static void main(String[] args) {
//        1.숫자형
        byte bt = -128; //-128 - 127
        short st = 300; //
        st = bt;
        int it= st;
        System.out.println(it);
        long lg = 700000000;
//        2.실수형
        float fl = 1000;
        fl = lg;
        fl =  1000.0f;

        double d1 = 20000;
        d1 = fl;
        d1 = bt;
        d1 = 207.999;

//       3.숫자가 아닌 형
        char c = 'a';
        System.out.println((char)(c+2)); //unicode값을 연산할 수 있다
        System.out.println((float) (c));

//       4.논리형
        boolean b = true;

        System.out.println(b);
        System.out.println(!b);

        System.out.println(bt == st);
    }
}
