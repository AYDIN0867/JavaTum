package ders25_Arrays;

public class C07_ElemanArama {

    public static void main(String[] args) {

  // verilen String bir array'de istenen bir elemanın var olup olmadığını
  // ve varsa kaç kere kullanıldığını yazdırın


  String [] harfler={"a","d","f","e","d","a","a","e","a"};
  String arananHarf="k";



    }

    public static void elemanArama(String [] harfler,String arananHarf){

        int sayac=0;

        for (int i = 0; i < harfler.length; i++) {

            if (  harfler[i].equals(arananHarf)){

                sayac++;
            }

        }

        if (sayac==0){

            System.out.println("istenen harf array de yoktur");
        }else {

            System.out.println("istenen harf arreyde "+sayac+"defa kullanılmış");
        }


        System.out.println(sayac);
    }




}
