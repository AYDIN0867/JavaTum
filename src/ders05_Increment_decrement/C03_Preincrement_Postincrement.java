package ders05_Increment_decrement;

public class C03_Preincrement_Postincrement {

    public static void main(String[] args) {

        int a=20;
        // a nin değerini oluşturduğunuz bir b variable'ina atayin
        // sonra a yi bir artırın

        int b=a;
        a++;

        System.out.println("14.satırda a :"+a+",b:"+b);



int c=20;

// önce c yi bir artırın
        // sonra c nin değerini d variableye atayın

        c++;
        int d=c;

        System.out.println("26.satırda c :"+c+",d:"+d);// ikiside 21 yazdırır

        // ayni işlemi ++ ile yapalım

        a=20;

        // a nıın değerini b variable'ine atayın
        // sonra ayı bir artırın

        b=a++;
        System.out.println("36.satırda a :"+a+",b:"+b);

c=20;
// önce c yi  1 artırın
        // sonra c nin değerini d variablesine atayın

        d=++c;
        System.out.println("43.satırda c :"+c+",d:"+d);// c:21, d:21



    }
}
