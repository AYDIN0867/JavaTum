package ders24_ArraysVeTekrarMethod;

public class C04_Array_Olusturma {
    public static void main(String[] args) {

     int [] arrayilk={1,2,3,};

        // 4 integer değer koyabileceğimiz sayılar arrayi oluşturun

int [] sayilar=new int[4]; //[0,0,0,0]

// 5 isim koyabileceğimiz bir array oluşturun

String [] isimler=new String[5];//[null,null,null,null,null]

//2 boolean değer koyabileceğimiz bir array oluşturun

int [] arr2={1,2,3,4};

int [] arr3={4,5};

        System.out.println(arr2.length);//3
// arr 2 deki ilk elemanını yazdırmak

        System.out.println(arr2[0]);//1
 // arr2 son elemanın

        System.out.println(arr2[3]);//4
        System.out.println(arr2[arr2.length-1]);//4

        //arraydeki elementlere yeni değer atamak için de indeks kullanabiliriz..

        arrayilk[0]=21;
        arrayilk[2]=19;

//ARARY İN UZUNLUĞU DEĞİŞTİRİLEMEZ ,OLUŞTURULMUŞ BİR
// ARRAYE YENİ ELEMENT EKLEYEMEZSİNİZ VEYA VAR OLAN BİR ELEMENTİ SİLEMEZSİNİZ
// ARRAYE ELEMAN EKLEMEK İHTİYACI OLUNCA YENİ BİR ARRAY TANIMLANIR VE TANIMLANMASI ZORUNLUDUR




    }
}
