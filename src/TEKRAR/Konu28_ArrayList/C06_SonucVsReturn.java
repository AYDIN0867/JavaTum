package TEKRAR.Konu28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_SonucVsReturn {
    public static void main(String[] args) {


        List<Integer> sayilar=new ArrayList<>(Arrays.asList(4,6,1,9,3));
        List<String> isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Cemil","Ayşe","Fatma","Hatice"));


        System.out.println(sayilar);//[4, 6, 1, 9, 3]

        //sayilar listesinden 2. indeksdeki elementi 5 yapın...
        //sayilar.set(2,5);
        //System.out.println(sayilar); //[4, 6, 5, 9, 3] öncekinde 2. indekste 1 varken şimdi 5 oldu...
       //metod işlemi yapar delil yazdırmaktır...normalde böyle yapılır...

        System.out.println(sayilar.set(2, 5));//siline  elemeti gösterir [1]
        System.out.println(sayilar); //[4, 6, 5, 9, 3]


        //isimler listesinden Aliyi silin...
        System.out.println(isimler);//[Ali, Veli, Cemil, Ayşe, Fatma, Hatice]

        isimler.remove("Ali");
        System.out.println(isimler); //[Veli, Cemil, Ayşe, Fatma, Hatice]
        //deliline bakalım
        System.out.println(isimler.remove("Ali"));//false yokki sileiym diye false donuyor....


        //isimler listesinden 2. index deki elemeti silin

        System.out.println(isimler.remove(2));//delile ulaşacağız...//Ayşe
        System.out.println(isimler);//[Veli, Cemil, Fatma, Hatice] silindiğini görmüş olduk

        // sayılar listesinden 3 .indeksdeki elementi silin....
        System.out.println(sayilar.remove(3));//delilini gorelim //9
        System.out.println(sayilar);//bu komutlada silindiğini ispat ediyoruz ki [4, 6, 5, 3] yazıyor


        // sayilar listesinden 4 ü silin 4. indeksdeki eleemnti değil doğrudan
        // 4 ü silin dendiğinde obje oluştururuz

        Integer silinecekSayi=4;
        System.out.println(sayilar.remove(silinecekSayi));//true
        System.out.println(sayilar);//[6, 5, 3]


    }
}
