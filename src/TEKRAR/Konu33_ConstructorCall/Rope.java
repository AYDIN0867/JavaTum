package TEKRAR.Konu33_ConstructorCall;

public class Rope {

    public static void swing(){

        System.out.println("swing");
    }

    public  void climb(){
        System.out.println("climb");
    }

    public static void play(){

        swing();
      //  climb();//climb static değil static içine giremez... clim i yoruma alacağım
    }

    public static void main(String[] args) {

        Rope rope1=new Rope();
        rope1.play();//play zaten static sadece play() ile yapabilriz..
       // play();
        Rope rope2=null;//rope2 tamamı ile oluşturulmamış deger atanmamıştır
       //constructor çalışmadıgı için obje oluşturulmamış oldugundan java rope 2 yi görmezden gelir
        rope2.play();



    }


}
