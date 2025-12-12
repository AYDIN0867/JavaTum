package TEKRAR.Konu23_DoWhileLoop;

import java.util.Scanner;

public class C06_KarekokBull {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	Ornek :  input : 16 (4*4) , output: true

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz....");
        int girilenSayi=scanner.nextInt();


        int karekokDegeri=1;

        do {

            if (karekokDegeri*karekokDegeri==girilenSayi) {
                System.out.println("girilensayı tamkaredir..");
                break;
            }
            karekokDegeri++;
            if (karekokDegeri*karekokDegeri>girilenSayi){

                System.out.println("tam kare değildir");
                break;
            }


        }while (karekokDegeri*karekokDegeri<=girilenSayi);







    }
}
