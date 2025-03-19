package ders35_ConstructorCall;

public class Rope {

    public static void swing(){

        System.out.println("swing");
    }

    public void climb(){

        System.out.println("climb");
    }

    public static void play(){

        swing();
       // climb(); //Non-static method 'climb()' cannot be referenced from a static context
    }

    public static void main(String[] args) {

        Rope rope=new Rope();
rope.play(); //Static member 'ders35_ConstructorCall. Rope. play()' accessed via instance reference
        Rope rope2=null;
       rope.play();//play() methodu static olduğundan objeye ihtiyaç yok java rope2 yi yok sayiyor...
       //Static member 'ders35_ConstructorCall. Rope. play()' accessed via instance reference

    }


}
