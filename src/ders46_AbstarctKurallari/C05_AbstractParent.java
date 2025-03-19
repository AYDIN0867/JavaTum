package ders46_AbstarctKurallari;

public abstract   class C05_AbstractParent extends C04_AbstaractGP {
 //Class 'C05_AbstractParent' must either be declared
    // abstract or implement abstract method 'method3()' in 'C04_AbstaractGP'



    /*
    kural 5: abstract claslların abstract child clasları
    parent class daki abstract methodları
    implement etmek ZORUNDA DEĞILDIR

    kural6:Abstract Parentların abstract childi olan classlar
    -Parent class daki abstract methodlari isterse implement edebilir
    -Parent classdakilerin dışında yeni abstract metthodlari olabilir
    -





     */

    public void method2(){}


    public abstract void method7();
    public abstract String method8();




}
/*

zaten abstract bir class olan abstract grandParent classinin
child class i olarak yine bir class secmemeizin 2 sebebi olabilir

1- GrandParent class inda abstract olan methodu implement edip concreteleştriebilriz

2-  GrandParent class indaki abstract methodlara ilave olarak yeni abstract methodlar olustrurlabilir



 */