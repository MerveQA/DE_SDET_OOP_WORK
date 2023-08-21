package Halime.Personel_Isci;

public class UstaBasi extends Isci{
    String statu="Usta basi";
    String imtiyaz="her ayin ilk cuma günü ögleden sonra tatil";
    int yemekKrt=3;

    @Override
    public void mesai() {
        super.mesai();
        System.out.println("Ustabasi acil durumda ek ucter almadan calisir.");
    }

    @Override
    public void maasHesapla() {
        super.maasHesapla();
        maas=this.calismaSaati*100;
        System.out.println("UstaBasi ucret= "+maas);
    }
}
