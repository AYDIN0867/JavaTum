package ders25_Arrays;

public class C09_EnUzunveEnKısaKelime {

    public static void main(String[] args) {

        //verilen String bir arraydeki en uzun ve en kısa
        //kelimeleri yazdırın

        String [] isimler={"hamza","esra","sedat","cansu","ibrahim","can","yasemin"};
        String enKısaKelime= isimler[0];
        String enUzunKelime=isimler[0];


        for (int i = 0; i < isimler.length; i++) {

            if ( isimler[i].length()<enKısaKelime.length()){

                enKısaKelime=isimler[i];
            }

           if (isimler[i].length()>enUzunKelime.length()){

               enUzunKelime=isimler[i];
           }
    }






    }

public static void enkısaEnuzunKelimeYazdir(String [] isimler){


    String enKısaKelime= isimler[0];
    String enUzunKelime=isimler[0];


    for (int i = 0; i < isimler.length; i++) {

        if ( isimler[i].length()<enKısaKelime.length()){

            enKısaKelime=isimler[i];
        }

        if (isimler[i].length()>enUzunKelime.length()){

            enUzunKelime=isimler[i];
        }
    }

    System.out.println("en uzun kelime "+enUzunKelime);
    System.out.println("en kısa kelime "+enKısaKelime);

}



}
