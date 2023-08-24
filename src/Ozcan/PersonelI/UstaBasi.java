package Ozcan.PersonelI;

public class UstaBasi extends Isci {
    String statu="UstaBasi";
    String imtiyaz="Ayyda nirgün ek izin";
    int yemekKrt=3;

    @Override
    public void mesai() {
        System.out.println(statu + " Acil durumlarda ücretsiz ek mesai yapar");
    }

    @Override
    public void maasHesapla() {
        System.out.println(statu+"Ustabasi  maas"+(5 * 10)*100 );
    }
}
