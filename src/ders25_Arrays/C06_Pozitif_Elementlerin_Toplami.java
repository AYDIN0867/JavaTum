package ders25_Arrays;

public class C06_Pozitif_Elementlerin_Toplami {
    public static void main(String[] args) {

// verilen bir arraydeki pozitif tamsayıların toplamını yazdırın


        int [] barr={-4,-8,-9,5,6,-52};

       // System.out.println(arr = pozitifSayilariTopla(arr)); //[I@5f184fc6

    }

    public static int  pozitifSayilariTopla(int [] barr){

        int pozitifToplam=0;

        for (int i = 0; i <barr.length ; i++) {

            if (barr[i]>0){

                pozitifToplam+=barr[i];

            }

        }

        return pozitifToplam;
    }

}
