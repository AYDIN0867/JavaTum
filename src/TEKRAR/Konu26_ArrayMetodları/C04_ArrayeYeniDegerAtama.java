package TEKRAR.Konu26_ArrayMetodları;

import java.util.Arrays;

public class C04_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        int [] sayilar={3,5,10};

        String [] isimler={"Ali","Hasan"};
        //sayilar arrayeine 4. deger olarak 8 ekleyin

        //sayilar[3]=8; //sayılar array inde 3. indeks olmamasına rağmen
        //java hata vermiyor çünkü compile time da java syntax e bakar içeriğe bakmaz...
        //ancak çaılştırıldıgında ise diyecekki;

       // System.out.println(Arrays.toString(sayilar));
//ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3 3. indeks yok ama sen atama yapmak istemisşşin
        //diyecektir...

//isimler array'ine 3. deger olarak "Can" ekleyin...


// sayilar arrayine {3, 5, 6, 8} arrayini atayın...

//sayilar={3, 5, 6, 8};

//bunu yapabilmek için;

int [] sayilarYeni={3, 5, 6, 8};

sayilar=sayilarYeni;
        System.out.println("sayilar aarray inin sonm hali "+Arrays.toString(sayilarYeni)); //sayilar aarray inin sonm hali [3, 5, 6, 8]


        //isismler array ine {"Ali", "Hasan", "Can"} arrayine atayın...

        String [] isimlerYeni =new String [isimler.length+1];
        isimlerYeni[0]=isimler[0];
        isimlerYeni[1]=isimler[1];
        isimlerYeni[2]="Can";

        isimler=isimlerYeni;

        System.out.println(Arrays.toString(isimler));//[Ali, Hasan, Can]


    }
}
