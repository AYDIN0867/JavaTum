package TEKRAR.Konu20_MetodOlusturma;

public class C08_TerstenYazdir {
    public static void main(String[] args) {


        //verilen bir metni tersten yazılısını DONDUREN method olusturun...

    }

    public static String tersYazılısınıDondur(String metin){

String tersYaziliz="";

        for (int i =metin.length()-1 ; i >=0 ; i--) {

          tersYaziliz+=metin.charAt(i);

        }
        return tersYaziliz;
    }





}
