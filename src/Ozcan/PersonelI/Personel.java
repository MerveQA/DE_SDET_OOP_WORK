package Ozcan.PersonelI;

public class Personel {
    String statu = "Personel";
    String imtiyaz = "Yillik izin 15 gün  hakki vardir";
    int yemekKrt = 1;



    public void mesai() {
        // personel 5 gun, gunde 8 saat çalışır
        System.out.println(statu + " olarak haftada " + (5 * 8) + " saat çalışır.");
    }

    public void maasHesapla() {
        // saatx40TL maaş alır
        System.out.println(statu+ " maas= "+(5 * 8) * 40);
    }

}
