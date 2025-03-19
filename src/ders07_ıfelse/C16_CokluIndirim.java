package ders07_ıfelse;

import java.util.Scanner;

public class C16_CokluIndirim {

    public static void main(String[] args) {
        // Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Aldığınız ürün adedini ve fiyatını giriniz: ");
        System.out.print("ürün adedi");
        int adet =scanner.nextInt();
        System.out.print("ürün fiyatı :");
        double fiyat=scanner.nextDouble();
        System.out.println("müşteri kartınız var mı?  ");
        char kart=scanner.next().toUpperCase().charAt(0);

        if (kart=='E'&& adet>10){
            System.out.println("indirimli fiyat :"+ (fiyat*0.80));
        } else if (kart=='E') {

            System.out.println("indirimli fiyat :"+ (fiyat*0.85));

        } else if (kart=='H'&& adet>10) {
            System.out.println("indiriml iifyat:"+ (fiyat*0.85));
        }else if (kart=='H' ) {
            System.out.println("indiriml iifyat:" + (fiyat * 0.90));
        }

    }
}
