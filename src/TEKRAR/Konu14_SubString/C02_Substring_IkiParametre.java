package TEKRAR.Konu14_SubString;

public class C02_Substring_IkiParametre {
    public static void main(String[] args) {


        String str="giden gitmiştir gittiği gün bitmiştir";

        //ilk kelime hariç yazdırın...

        System.out.println(str.substring(5));

//sadece 3. harfi String olarak başka bir variableye kaydeddin

        String harfAtama=str.substring(2,3); //charAT char getireceği
        // için Stringe atanamaz bu nedenle substring i kullandık

//7 .indeksteki harfi büyük harfi yazdırın dense

        System.out.println(str.substring(7, 8).toUpperCase());

//başlangıc ve bitiş indeksleri aynı olursa

        System.out.println(str.substring(2, 2));//hiçlik verir

// başlangıc indeksi bitiş indeksinden büuük olursa

       // System.out.println(str.substring(8, 5));//hata verir outofBoundsException

  //Baştan 10. karakteri yazdırırken 2 adet yöntemi de kullanalım

        System.out.println(str.charAt(9));
        System.out.println(str.substring(9, 10));

 //15. index ten başlayıp 8 karakter yazdirin

        System.out.println(str.substring(15, 23));

 // baştan 3 .karakterden başlayıp,
 // sondan 3. karaktere kadar (dahil) olan bolumu yazdırın

        System.out.println(str.substring(2, str.length() - 2));


    }
}
