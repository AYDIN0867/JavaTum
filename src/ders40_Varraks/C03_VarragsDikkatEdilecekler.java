package ders40_Varraks;

public class C03_VarragsDikkatEdilecekler {
    public static void main(String[] args) {

        // argument olarak girilen sayilardan
        //sonuncusu hariç geriye kalanlari toplayıp
        //bulunan toplam değer ile ilk sayının carpımını yazdıran
        //bir method oluşturun

     islem(3,4,5);//35
        islem(2,3,5,6,8,7);//168
//islem();//parametre olarak kabul eder ancak boş bir array loop için hata oluşturur...

    }

    public static void islem(int...ilksayilar) {

        //son sayıyı varrags olarak ayırayoruz...
        //ilksayılardan son elementi ayırırız

        int toplam=0;

        for (int i = 0; i <= ilksayilar.length-2; i++) {

            toplam+=ilksayilar[i];

        }

        System.out.println("işlem sonucu :"+ toplam*ilksayilar[ilksayilar.length-1]);
    }





}
