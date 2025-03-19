package ders12_String_Manipulations;

public class C03_String_length {

    public static void main(String[] args) {

        String str="Ali Uzunkavaklaraltindayataruyumazoglu";
        //metnin son karakterini yazdırın

        System.out.println(str.length());//38
        System.out.println(str.charAt(38 - 1));//u

        // kodu dinamik yapmak demek bize verilen input ne olursa olsun kodun istenen işlemi yapmasıdır
        System.out.println(str.charAt(str.length()-1));//u

        // sondan beşinci karakteri
        System.out.println(str.charAt(str.length()-5));//z




    }
}
