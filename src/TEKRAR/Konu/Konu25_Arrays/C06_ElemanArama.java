package TEKRAR.Konu.Konu25_Arrays;

public class C06_ElemanArama {
    public static void main(String[] args) {

      //verilen bir array de istenen bir elemanın var olup olmadıgını
      // ve varsa kac kere kullanıldıgını yazdırın...

      String [] harfler ={"a","d","f","e","a","e","d","a","a","e","a"};
      String arananHarf="d";
      int sayac=0;


        for (int i = 0; i <harfler.length ; i++) {

            if (harfler[i]=="d"){

                sayac++;



            }


        }

        System.out.println("aranan "+arananHarf+" harfi "+sayac+" adet var ");

    }

    public static int harfAdetSayısıHesapla(String [] harfler,String arananHarf){



        int sayac=0;


        for (int i = 0; i <harfler.length ; i++) {

            if (harfler[i].equals(arananHarf)){

                sayac++;

            }


        }

        if (sayac==0){

            System.out.println("istenen harf arrayde yok...");
        }


   return sayac;

    }
}
