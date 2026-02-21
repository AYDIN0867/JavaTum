package TEKRAR.Konu38_Varrags;

public class C03_VarragsDikkatEdilecekler {
    public static void main(String[] args) {

        // argument olarak girilen sayılardan
        // sonuncusu hariç geriye kalanları toplayıp
        // bulunan toplam deger ile son sayının çarpımını yazdırın
        //bir metod olusturun

        carpımYazdirVarrags(3,4,5); //işlem sonucu :35
    }

    public static void carpımYazdirVarrags(int...bastakiSayilar){

//metodlarda varrags hep son parametre olmalıdır aksi durumda hata verecektir...
//son sayıyı parametre olarak ayramadık ama
        //tum sayılar arrayinden son eleemnti ayırabilşriz

        int toplam=0;

        for (int i = 0; i <=bastakiSayilar.length-2 ; i++) {

            toplam+=bastakiSayilar[i];


        }

        System.out.println("işlem sonucu :" +toplam*bastakiSayilar[bastakiSayilar.length-1]);

    }


}
