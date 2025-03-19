package ders05_Increment_decrement;

public class C01_Increment_Decrement {
    public static void main(String[] args) {


        int sayi=20;

        // sayının değerini iki katıma çıkarın
        sayi*=2;
        System.out.println("13.satırdaki sayı :"+sayi);//40

        // sayının değerini 5 azaltın
        sayi-=5;
        System.out.println("15.satırdaki sayının değeri :"+sayi);//35

// sayıyı  5 e bölüp sonucu sayı variablene atayın
       sayi/=5;
        System.out.println(sayi);

// sayi variable'inin degerini 1 artırın
        sayi=sayi+1;
        System.out.println(sayi);// 8 yazıdır

        sayi+=1;
        System.out.println(sayi);// 9 yazdırır

        sayi++;// kalıcı olarak 10 yazdırır







    }
}
