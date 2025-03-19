package ders63_treeMapMethodlari;

import java.util.TreeMap;

public class C02_TreeMapMethodlari {
    public static void main(String[] args) {

        TreeMap<String,Integer> harfler=new TreeMap<>();
        harfler.put("A",20);
        harfler.put("B",40);
        harfler.put("T",25);
        harfler.put("R",30);
        harfler.put("Z",2);

        TreeMap<String,Integer> harfler2=new TreeMap<>();

        //TreeMap DOGAL SIRALI oldugunda
        //bir elemanın sirada onundekiler veya arkasındakiler ile ilgili
        //pekcok method vardir

        System.out.println(harfler); //{A=20, B=40, R=30, T=25, Z=2}
        //1- headMap verilen key  dahil, sonrasindaki Entry'leri verir
        //girdiğimiz bitis değeri oldugu için map e dahil olmaz
        System.out.println(harfler.headMap("R")); //{A=20, B=40}
//olmayan bir key verildiğinde mesela Y olsa idi nerde olurduyu kendi bulur ve o keyden oncesini basa dogru  verir
        System.out.println(harfler.headMap("Y"));//{A=20, B=40, R=30, T=25}

        System.out.println(harfler.headMap("R", true)); //{A=20, B=40, R=30}
        //eger ikinci parametre true girilirse girilen key herne kadar bitis de olsa dahil eder

        //2- tail Map: girilen key dahil , sonrasindeki Entryleri veiri

        System.out.println(harfler.tailMap("B"));
        //girilen key baslangıc oldugundan dahil olur
        System.out.println(harfler.tailMap("K"));
        System.out.println(harfler.tailMap("B",false)); //b zaten var olduğu için dahil etmedik...

        //{A=20, B=40, R=30, T=25, Z=2}

     //3-lowerkey

        System.out.println(harfler.lowerKey("R"));//B
        System.out.println(harfler.lowerKey("Y"));//T

//4-floorKey

        System.out.println(harfler.floorKey("R"));// R   kucuk esiti getirir yani yuvarlar varsa kendini yazdırır
        System.out.println(harfler.floorKey("Y"));// T


//higherKey

        System.out.println(harfler.higherKey("R"));//T
        System.out.println(harfler.higherKey("Y"));//Z



        System.out.println(harfler.ceilingKey("R"));// R
        System.out.println(harfler.ceilingKey("Y"));// Z


        //5- pollfirstEntry

        System.out.println(harfler.pollFirstEntry());//A=20

        System.out.println(harfler);//{B=40, R=30, T=25, Z=2}




        System.out.println(harfler.pollLastEntry());//Z=2

        System.out.println(harfler);//{B=40, R=30, T=25}


        System.out.println(harfler.descendingMap()); //{T=25, R=30, B=40}

        //tersten sıralanan map TreeMap kabul etmez...

        System.out.println(harfler.subMap("R", "T")); //{R=30} baslangıc dahil cıkıs dahil olmadıgı için T yi yazdırmadı


        System.out.println(harfler.subMap("B", false, "T", true)); //{R=30, T=25}git
    }
}
