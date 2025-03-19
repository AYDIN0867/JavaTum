package ders43_encapsulation;

public class C03_EncapsuleRapor {

    private int satisTutari=0;

    //baska classlardan deger atamsı yapılabilsin-write yetkisi-ok
    // ama atanmıs degerleri kimse görmesin-read yetkisi yassak
    //yazma isteği var görme yasak ise setter


    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;

        toplamSatisTutari+=satisTutari;
    }

    private int toplamSatisTutari=0;

    // baska classlardan deger ataması YAPILMASIN-write yetkisi yassak
    //ama atanmis degeri görebilsin -read yetkisi ok
    //görme isteği var yazma yasak ise getter kullanacağız


    public int getToplamSatisTutari() {

        return toplamSatisTutari;
    }
}
