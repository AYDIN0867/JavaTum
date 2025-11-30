package TEKRAR.Konu20_MetodOlusturma;

public class C06_MetniTerstenYazdırma {
    public static void main(String[] args) {


//verilen metni tersten yazdıran bir metod uretin


        String metin1="kalem kelamı";

        metniTerstenYaz(metin1);

    }

    public static void metniTerstenYaz(String metin){

        for (int i = metin.length()-1; i >=0 ; i--) {

            System.out.print(metin.charAt(i));

        }


    }


}
