package Ozcan.Task_Abstractt;

public class Runner {
    public static void main(String[] args) {
        Calisan ogrenci = new Calisan("Ahmet", "Yılmaz", 0);
        ogrenci.Bilgilendirme();
        ogrenci.calis();


        Calisan sekreter = new Calisan("Mehmet", "Kaya", 333);
        sekreter.Bilgilendirme();
        sekreter.calis();


        Calisan danisman = new Calisan("Mehmet", "Özdemir", 555);
        danisman.Bilgilendirme();
        danisman.calis();


        danisman.isimDegistir("Ahmet", "Demir");
        danisman.Bilgilendirme();
        danisman.isimDegistir("Mehmet", "Kim");
        danisman.Bilgilendirme();
    }
}
