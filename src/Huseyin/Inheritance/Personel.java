package Huseyin.Inheritance;

public class Personel {
    String statu = "Memur";
    String imtiyaz = "Senede 45 gün tatil";
    int yemekKrt = 1;
    int calismaSaati = 40;

    public void mesai() {

        System.out.println("Personel 5 gun, gunde 8 saat çalışır.");

    }

    public void maasHesapla() {

        int maas = this.calismaSaati * 40;
        System.out.println("Personelin maaşı " + maas);

    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getImtiyaz() {
        return imtiyaz;
    }

    public void setImtiyaz(String imtiyaz) {
        this.imtiyaz = imtiyaz;
    }

    public int getYemekKrt() {
        return yemekKrt;
    }

    public void setYemekKrt(int yemekKrt) {
        this.yemekKrt = yemekKrt;
    }

    public int getCalismaSaati() {
        return calismaSaati;
    }

    public void setCalismaSaati(int calismaSaati) {
        this.calismaSaati = calismaSaati;
    }
}


