package Ozcan.PersonelI;

public class Runner {
    public static void main(String[] args) {
        UstaBasi ali=new UstaBasi();

        System.out.println("Ustabasi Ali ");
        System.out.println(ali.statu);
        System.out.println(ali.imtiyaz);
        System.out.println(ali.yemekKrt);
      ali.maasHesapla();
      ali.mesai();

        System.out.println("********");
        System.out.println("Isci Ali");
        Isci Ali=new UstaBasi();

        System.out.println(Ali.statu);
        System.out.println(Ali.imtiyaz);
        System.out.println(Ali.yemekKrt);
       Ali.maasHesapla();
        Ali.mesai();

        System.out.println("********");
        System.out.println("Personel Ali");
        Personel Alli = new UstaBasi();

        System.out.println(Alli.statu);
        System.out.println(Alli.imtiyaz);
        System.out.println(Alli.yemekKrt);
        Alli.maasHesapla();
        Alli.mesai();

    }
}
