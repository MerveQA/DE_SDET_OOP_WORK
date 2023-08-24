package Ozcan.PersonelI;

public class Isci extends Personel {
    //String statu="isci";
    String imtiyaz="sendika uyeligi hakkina sahiptir";
    int yemekKrt=2;

    @Override // Personel sınıfının mesai methodunu override eder
    public void mesai() {
        // işçi 5 gun, gunde 10 saat çalışır
        System.out.println(statu + " olarak haftada " + (5 * 10) + " saat çalışıyorum.");
    }

    @Override
    public void maasHesapla() {
        System.out.println(statu+"isci maas"+(5 * 10)*80 );
    }


}
