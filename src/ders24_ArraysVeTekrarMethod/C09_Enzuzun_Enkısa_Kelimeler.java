package ders24_ArraysVeTekrarMethod;

public class C09_Enzuzun_Enkısa_Kelimeler {

    public static void main(String[] args) {


       // Verilen String bir array’deki en uzun ve
        // en kisa kelimeleri yazdiran bir method olusturun.

        String [] isimler={"aysenur","emin","fadime","Haydar Turna","nihan","ramazan"};


        printEnkısaEnzuznKelime(isimler);








    }



    public static void printEnkısaEnzuznKelime(String[] kelimeler){

        String enKisaKelime=kelimeler[0];
        String enUzunKelime=kelimeler[0];

        for (int i = 0; i < kelimeler.length; i++) {


            if (kelimeler[i].length()<enKisaKelime.length()){

                enKisaKelime=kelimeler[i];
            }

            if (kelimeler[i].length()>enUzunKelime.length()){

                enUzunKelime=kelimeler[i];
            }

        }


        System.out.println(enKisaKelime);
        System.out.println(enUzunKelime);



    }



}
