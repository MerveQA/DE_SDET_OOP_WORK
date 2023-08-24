package Huseyin.Abstract;

public class Runner {
    public static void main(String[] args) {
        Calisan ogrenci = new Calisan(1514);
        ogrenci.setCalisanId(1111);
        Calisan sekreter = new Calisan(4558);
        sekreter.setCalisanId(2222);
        Calisan danisman = new Calisan(9551);
        danisman.setCalisanId(3333);
        System.out.println("**************");
        ogrenci.setName("Leyla");
        ogrenci.setSurname("Demir");
        sekreter.setName("Lucia");
        sekreter.setSurname("Monaco");
        danisman.setName("Legolas");
        danisman.setSurname("Aragorn");
        System.out.println("**************");
        sekreter.calis();
        sekreter.bilgilendirme();
        sekreter.isimDegistir();
        System.out.println("**************");
        danisman.calis();
        danisman.isimDegistir();
        danisman.bilgilendirme();
        System.out.println("**************");
        ogrenci.calis();
        ogrenci.bilgilendirme();
        ogrenci.isimDegistir();
        System.out.println("**************");
        System.out.println("sekreter.getName() = " + sekreter.getName());
        System.out.println("sekreter.getSurname() = " + sekreter.getSurname());
        System.out.println("sekreter.getCalisanId() = " + sekreter.getCalisanId());
        System.out.println("**************");
        System.out.println("ogrenci.getName() = " + ogrenci.getName());
        System.out.println("ogrenci.getSurname() = " + ogrenci.getSurname());
        System.out.println("ogrenci.getCalisanId() = " + ogrenci.getCalisanId());
        System.out.println("**************");
        System.out.println("danisman.getName() = " + danisman.getName());
        System.out.println("danisman.getSurname() = " + danisman.getSurname());
        System.out.println("danisman.getCalisanId() = " + danisman.getCalisanId());


    }
}
