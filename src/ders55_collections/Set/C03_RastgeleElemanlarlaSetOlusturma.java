package ders55_collections.Set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_RastgeleElemanlarlaSetOlusturma {
    public static void main(String[] args) {

      //içinde 20 den kucuk rast gele 7 adet pozitif tamsayinin olduğu
      //bir set olusturun

        Random random=new Random();
        Set<Integer> rastGelesayilarSet=new TreeSet<>();

        for (int i = 1; i <=7 ; i++) {

            rastGelesayilarSet.add(random.nextInt(20));

        }

        System.out.println(rastGelesayilarSet); //[1, 5, 6, 9, 13, 17, 18]
//[1, 5, 8, 13, 15, 16, 17] //[1, 10, 12, 16, 18, 19]

        // ayni sayilar geldiğinde set onlari yeni bir sayi gibi eklemez
        //biz 7 sayi ekliyoruz ama random sayinin 7 farkli deger ureteceğini garanti etmez

        Set<Integer> whileSet=new TreeSet<>();

        while (whileSet.size()<7){

            whileSet.add(random.nextInt(20));
        }

        System.out.println("while ile  oluşturulan set"+ whileSet);//while ile  oluşturulan set[3, 9, 10, 13, 14, 16, 17]
//burada 7 elelamlı oluşturuyoruz

    }
}
