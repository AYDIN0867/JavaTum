package ders43_encapsulation;

public class C05_GetterSetterBirlikteKullanma {

    public int sayiPublic=10;




    private int sayiPrivate=100;



    public int getSayiPrivate() {
        return sayiPrivate;
    }

    public void setSayiPrivate(int sayiPrivate) {
        this.sayiPrivate = sayiPrivate;
    }
}
