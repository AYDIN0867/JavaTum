package TEKRAR.Konu20_MetodOlusturma;

public class C12_MetodKullanma {
    public static void main(String[] args) {


        C06_MetniTerstenYazdırma.metniTerstenYaz("ramazan");
        System.out.println(" ");
        System.out.println(C07_IsmiDüzenle.isimDuzenle("ramazan", "saltık"));

        System.out.println(C08_TerstenYazdir.tersYazılısınıDondur("merkez"));

        System.out.println(C09_PalidromKontrol.isPalindrome("madam"));
        System.out.println(C09_PalidromKontrol.isPalindrome("samsun"));

    }
}
