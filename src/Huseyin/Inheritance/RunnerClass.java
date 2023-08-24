package Huseyin.Inheritance;

public class RunnerClass {
    public static void main(String[] args) {



        /*
        Personel pp = new Ustabasi();

        Yurkarıda ki obje oluşturmaya bakarsak, eğer biz Personel data tipinden ustabaşı constractor'ından bir variable'a ulaşmak istersek,
        Personel classında olan variable lara veya onun extend ettingi classdaki variable lara ulaşır. Ama metoda ulaşmak istersek, sadece
        Ustabaşı constructor'daki metotda ulaşırız.
         */

        Personel obje = new Ustabasi();
        System.out.println(obje.statu);
        System.out.println(obje.imtiyaz);
        System.out.println(obje.calismaSaati);
        System.out.println(obje.yemekKrt);


        System.out.println();
        Isci obje2 = new Ustabasi();
        System.out.println(obje2.statu);
        System.out.println(obje2.imtiyaz);
        System.out.println(obje2.calismaSaati);
        System.out.println(obje2.yemekKrt);
        System.out.println();


        Ustabasi obje3 = new Ustabasi();
        System.out.println(obje3.imtiyaz);
        System.out.println(obje3.statu);
        System.out.println(obje3.calismaSaati);
        System.out.println(obje3.yemekKrt);
        obje3.mesai();
        obje3.maasHesapla();


    }

}
