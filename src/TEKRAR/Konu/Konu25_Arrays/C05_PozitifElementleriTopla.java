package TEKRAR.Konu.Konu25_Arrays;

public class C05_PozitifElementleriTopla {
    public static void main(String[] args) {

        //verilen bir array'deki pozitif tamsayıların toplamını yazdırın...

        int[] arr = {-4, -6, 7, 2, 5, -1, 0, 4, -5, 3};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                toplam += arr[i];

            }


        }

        System.out.println("arr array indeki pozitif elementlerin toplamı :" + toplam);

        //verilen bir arraydeki pozitif tamsayıları toplayıp
        //sonucunu bize donduren bir metod yazdırın...


    }

    public static int pozitifSayılarıTopla(int[] arr) {


        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                toplam += arr[i];

            }


        }

        return toplam;
    }


}