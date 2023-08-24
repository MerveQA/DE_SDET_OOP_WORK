package Halime.Personel_Isci;

public class Personel {
    String statu="Personel";
    String imtiyaz="yillik izin";
    int yemekKrt=1;
    int calismaSaati=40;

    int maas;

   public void mesai(){
        this.calismaSaati=40;
       System.out.println("personel calisma saati="+this.calismaSaati);

    }
    public void maasHesapla(){
       maas=calismaSaati*40;
        System.out.println("personel ucret= "+maas);

    }

}
