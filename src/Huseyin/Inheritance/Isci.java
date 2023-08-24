package Huseyin.Inheritance;

public class Isci extends Personel {

    String statu = "Mevsimlik";
    String imtiyaz = "Sendikalaşma hakkı";
    int yemekKrt = 2;
    int calismaSaati = 40;


    public void maasHesapla() {

        int maas = this.calismaSaati*60;
        System.out.println("İşçinin maaşı " +maas);
    }

    public void mesai() {

        System.out.println("İşciler haftada 40 saat çalışır.");
    }

    public Isci() {
    }

    @Override
    public String getStatu() {
        return statu;
    }

    @Override
    public void setStatu(String statu) {
        this.statu = statu;
    }

    @Override
    public String getImtiyaz() {
        return imtiyaz;
    }

    @Override
    public void setImtiyaz(String imtiyaz) {
        this.imtiyaz = imtiyaz;
    }

    @Override
    public int getYemekKrt() {
        return yemekKrt;
    }

    @Override
    public void setYemekKrt(int yemekKrt) {
        this.yemekKrt = yemekKrt;
    }

    @Override
    public int getCalismaSaati() {
        return calismaSaati;
    }

    @Override
    public void setCalismaSaati(int calismaSaati) {
        this.calismaSaati = calismaSaati;
    }
}
