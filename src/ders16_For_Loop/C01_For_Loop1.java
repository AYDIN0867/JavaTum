package ders16_For_Loop;

public class C01_For_Loop1 {

    public static void main(String[] args) {

     //1 den baslayip, 50'ye kadar (50 dahil) tek sayıları yazdırın


        for (int i = 1; i <=50 ; i+=2) {

            System.out.print(i+" ");

        }
//207 den başalayıp 5 er artırarak, 400'den kucuk olan sayıları yazdırın


        for (int i = 207; i < 400; i+=5) {


            System.out.print(i+" ");
        }

        System.out.print("");


//2 basamaklı çift sayıların toplamı kaçtır?
// toplamı dediği için vir variable oluştururuz

        int toplam=0;
        for (int i = 10; i <100 ; i+=2) {

            toplam+=i;

        }

        System.out.print(toplam);//2430

//40 sayısını bölebilen pozitif tamsayıları yazdırın

        for (int i = 1; i <=40 ; i++) {

            if (40%i==0){
                System.out.print(i+" ");
            }

        }
        System.out.println("");

        // 1000 den geriye doğru 3 basamaklı 37 ile bölünebilen sayıları yazdırn

        for (int i = 1000; i >=100 ; i--) {

           if (i%37==0){

               System.out.print(i+" ");
           }

        }

        System.out.println("");

    // verilen









    }
}
