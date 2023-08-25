package Halime.Personel_Isci;

public class Runner {
    public static void main(String[] args) {
        UstaBasi ali=new UstaBasi();
        System.out.println("Usta ali: "+ali.statu);
        System.out.println("Usta ali: "+ali.imtiyaz);
        System.out.println("Usta ali: "+ali.yemekKrt);
        System.out.println();
        ali.maasHesapla();
        System.out.println();
       ali.mesai();
        System.out.println();

        Isci ali1=new UstaBasi();
        System.out.println("Isci ali: "+ali1.statu);
        System.out.println("Isci ali: "+ali1.imtiyaz);
        System.out.println("Isci ali: "+ali1.yemekKrt);
        System.out.println();

        Personel ali2=new UstaBasi();
        System.out.println("Personel Ali: "+ali2.statu);
        System.out.println("Personel Ali: "+ali2.imtiyaz);
        System.out.println("Personel Ali: "+ali2.yemekKrt);


    }
}
