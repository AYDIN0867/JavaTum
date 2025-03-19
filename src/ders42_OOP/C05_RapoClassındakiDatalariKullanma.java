package ders42_OOP;

public class C05_RapoClassındakiDatalariKullanma {

    public static void main(String[] args) {

        C04_Rapor obj1=new C04_Rapor();

        obj1.setSatisTutari(100);
        obj1.setSatisTutari(300);


        /*

        hiç bir şekilde satış tutarını yazdıramayız ama deger atayabiliriz



         */


        System.out.println(obj1.getToplamSatisTutari());//400.0




    }

}
