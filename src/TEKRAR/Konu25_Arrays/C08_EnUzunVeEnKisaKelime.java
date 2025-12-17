package TEKRAR.Konu25_Arrays;

public class C08_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {

        //verilen String bir array deki
        // en uzun ve en kısa kelimeleri yazdırın


        String [] isimler={"hamza","esra","serhat","ali","cansu"," ibrahimhkl","can","yasemin"};

        String enKısa=isimler[0];
        String enUzun=isimler[0];

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length()<enKısa.length()){

                enKısa=isimler[i];

            }

            if (isimler[i].length()>enUzun.length()){

                enUzun=isimler[i];
            }


        }

        System.out.println("en kısa :"+ enKısa + " en uzun :"+ enUzun);


    }

    // verilen string bir array deki
    // en uzun ve en kısa kelimeleri yazdıran bir method olusturun



    public static void enUzunEnKısaYazdır(String [] isimler){


        //String [] isimler={"hamza","esra","serhat","ali","cansu"," ibrahimhkl","can","yasemin"};

        String enKısa=isimler[0];
        String enUzun=isimler[0];

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length()<enKısa.length()){

                enKısa=isimler[i];

            }

            if (isimler[i].length()>enUzun.length()){

                enUzun=isimler[i];
            }


        }

        System.out.println("En kısa isim: " + enKısa);
        System.out.println("En uzun isim: " + enUzun);


    }
}
