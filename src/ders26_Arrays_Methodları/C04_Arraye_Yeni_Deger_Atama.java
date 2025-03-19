package ders26_Arrays_Methodları;

import java.util.Arrays;

public class C04_Arraye_Yeni_Deger_Atama {

    public static void main(String[] args) {

int [] sayilar={3,5,10};

String [] isimler={"kemal","Hasan"};

// sayilar arrayine 4. değer olarak 8 ekleyin

        //sayilar[3]=8; // olamayan indekse yeni element atanamaz

  // isismler arrayine 3. deger olarak "Can" ekleyin

  // sayilar arrayine {3,5,10,8} arrayini atayın

       // sayilar={3,5,10,8};

        int [] sayilaryeni={3,5,10,8};
        sayilar=sayilaryeni;

        System.out.println(Arrays.toString(sayilar));

// eski hali={"Ali","Hasan"};
// isimler arrayine {"Ali,"Veli","Can"};

        String [] isimleryeni=new String[isimler.length+1]; //daha değer
        // tanmadığı için [null,null,null] yazar

        isimleryeni[0]=isimler[0];
        isimleryeni[1]=isimler[1];
        isimleryeni[2]="Can";
        isimler=isimleryeni;

        System.out.println("isimler arrayinin son hali "+Arrays.toString(isimler));




    }




}
