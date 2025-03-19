package ders24_ArraysVeTekrarMethod;

public class C06_Arrays_Pozitif_Sayıların_Toplmaı {

    public static void main(String[] args) {
        int[] arr = {3,-4,6,-1,5,3,-4};

     //   Verilen bir array’deki pozitif tamsayilari toplayip
        //   sonucu bize donduren bir method yaziniz.   


        System.out.println(getpozitifSayilarınToplami(arr));//17

    }

    public static int getpozitifSayilarınToplami(int[]arr) {

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                toplam += arr[i];
            }

        }



    return toplam;

    }

}
