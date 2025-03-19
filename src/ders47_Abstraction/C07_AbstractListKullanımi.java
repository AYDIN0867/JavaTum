package ders47_Abstraction;

import java.util.ArrayList;
import java.util.List;

public class C07_AbstractListKullanımi {


    public static void main(String[] args) {


       // List<String> isimler1=new List<String>();
//List' is abstract; cannot be instantiated
//List abstract bir yapı olduğundan
//obje olan chillde olan ARRAYlisti constructor ı kullanırız
        //arrayList parente olan listtedki abstract tüm methodları bodyli (abstract olmayan ==>concrete hale getirmiştir)



        List<String> isimler2=new ArrayList<>();
        System.out.println(isimler2.size());//0


    }




}
