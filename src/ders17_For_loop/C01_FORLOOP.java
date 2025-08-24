package ders17_For_loop;

public class C01_FORLOOP {

    public static void main(String[] args) {

        //başlangıc ve btişdeğerleri tam sayı verildiğinde sınır değerlerini ve aralarındaki
       // tüm sayıları
       //aralarında bir boşluk bırakarak yazdırn

        //int baslangic=20;

        //int bitis=30;

       // for (int i = baslangic; i <=bitis ; i++) {

         //   System.out.print(i+" ");
       // }


        //başlangıc ve btişdeğerleri tam sayı verildiğinde sınır değerlerini ve aralarındaki
        // tüm sayıları toplayıp toplama işleminin sonucunu yazırın
        System.out.println("");

        int baslangic=10;
        int bitis=42;
        int toplam=0;
        for (int i = baslangic; i <=bitis ; i++) {

            toplam+=i;


        }

        System.out.println(toplam);//46


    // sınır değerinden başalayarak 3 er 3 er aratacak şekilde yazdırın
    //bitiş değeri artışa uygun sa bitiş degeride yazdırılacak

        for (int i = baslangic; i <bitis ; i+=3) {

            System.out.print(i+" ");


        }

        System.out.println("");

        // sınır değerleri dahil olarak 5 ile bölünebilen sayıları yazdırın

        for (int i = baslangic; i <bitis ; i++) {

            if (i%5==0){

                System.out.println(i+" ");
            }

        }

        System.out.println("");


     //    /başlangıc ve btişdeğerleri tam sayı verildiğinde sınır değerlerini ve aralarındaki sayılara dahilolarak
        //geriye doğru yazdırın


        for (int i = bitis; i >=baslangic ; i--) {

            System.out.print(i+" ");

        }

        System.out.println("");

     // sınır değerleri dahil olarak bitiş geriye doğru 4 er 4 er azalsın

        for (int i = baslangic; i >baslangic ; i-=4) {

            System.out.println(i+" ");

        }
        System.out.println("");


        // bitiş değerinden geriye doğru 3 ile bölüne bilen


        for (int i = bitis; i >baslangic ; i--) {

            if (i%3==0){

                System.out.println(i+" ");
            }

        }

    }
}
