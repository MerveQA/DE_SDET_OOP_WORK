package Halime.Personel_Isci;

public class Isci extends Personel {
    String statu="isci";
    String imtiyaz="yilbasi ikramiyesi";
    int yemekKrt=2;



    @Override
    public void mesai() {
       super.mesai();
        System.out.println("isci calisma saati= "+this.calismaSaati);
    }

    @Override
    public void maasHesapla() {
        super.maasHesapla();
         maas=this.calismaSaati*60;
        System.out.println("isci ucret= "+maas);
    }
}
