package Sibel;

public class Ustabasi extends Isci {
    String statu = "Ustabasi";
    String imtiyaz = "Yilda 10 gün ekstra izin";
    int yemekKarti = 3;

    public static void main(String[] args) {
        Ustabasi Ali = new Ustabasi();
        System.out.println(Ali.imtiyaz);
        Ali.mesai();
        Ali.maas();

    }


}
