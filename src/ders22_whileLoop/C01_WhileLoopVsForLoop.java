package ders22_whileLoop;

public class C01_WhileLoopVsForLoop {

    public static void main(String[] args) {

// eger baslangic ve bitis degerleri biliniyorsa
// veya bir işlemi kac kere tekrarlayacağımızi biliyorsak for Loop avantajlıdır.

        //cunku while Loop
        // baslangic degeri
        // bitis degeri
        // ve artis/azalis miktarını otomatik olarak bize vermez


      // 1'den 10'a kadar (1 ve 10 dahil) tum sayıları toplayın
int toplam=0;
        for (int i = 1; i <=10 ; i++) {

         toplam+=i ;
        }

        System.out.println(toplam);

     //aynısını while loop ile yapalım
     int sayi=1;
     toplam=0;
     while (sayi<=10) { //çalışamaya devam etme şartı daima kontrol edilemli ve
         // dğişim durumu kodlamaya eklenmeli
         // burada sayi++ kodunu bu nedenle yazdık

         toplam+=sayi;
         sayi++;// kontrol edilen variable için değişim unutulurasa sonsuz loop unutulur
     }


        System.out.println("while loop ile sonuç"+toplam);

        int carpım=1;
     //20 den 30 a kadar olan çift sayıların çarpımı
        for (int i = 20; i <=30 ; i++) {

            if (i%2==0) {

                carpım *= i;
            }
        }

        System.out.println("for loop ile 20 den 30 carpım"+ carpım);

sayi=20;
carpım=1;
     while (sayi<=30) {

         if (sayi%2==0) {

             carpım *= sayi;
         }

         sayi++;

     }

        System.out.println("while loop ile çarpım sonuç"+carpım);









    }
}
