package ders19_Method;

public class C03_MethodTekrar {

    public static void main(String[] args) {

        String str ="Java Candir";

        int basIndex=2;
        int bitIndex=6;


        /*
        Kullanıcıdan alinan bir metinden
        kullanicinin girdigi baslangic ve bitis indexleri arasindaki kısmı yazıdırn

        Kurallar:
        1-eger baslangic veya bitis index i negatif veya metin sinirleri dısında ise hataverin
        2-baslangic index'i bitis index inden buyukse hata mesaji verin
        3-baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olamlıdır

         */


if(basIndex<0 || bitIndex<0 || basIndex>=str.length()||bitIndex>=str.length()) {

            System.out.println("girilen değerler gecersiz....");


        } else if (basIndex>bitIndex) {

    System.out.println("baslangıc indeksi bitis indeksinden buyuk olamaz");

}else{

    for (int i = basIndex; i <bitIndex ; i++) {

        System.out.print(str.charAt(i));

    }

}


        System.out.println(str.substring(basIndex, bitIndex));

    }


}
