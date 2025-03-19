package ders20_Method_Sorular;

public class C05_MetniTerseCevirme {

    public static void main(String[] args) {

        // verilen metni tertesten yazısılışını DÖNDÜREN method oluşturun

        metnintersiniDondur("Ali Can");
        System.out.println(metnintersiniDondur("bu iyiymis"));//simyiyi uB
        // konsolde görülür ama sonra kullanılmaz

        String str=metnintersiniDondur("java candir"); //konsolde görünmez
        // ama sonrasında kullanılabilir


        System.out.println(str.toUpperCase());//
        System.out.println(str.substring(0, 6));

    }



    public static String metnintersiniDondur(String metin){

  String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin+=metin.charAt(i);
        }

      return tersMetin;

    }





}

