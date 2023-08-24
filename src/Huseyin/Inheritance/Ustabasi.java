package Huseyin.Inheritance;

public class Ustabasi extends Isci {
    String statu = "Şef";
    String imtiyaz = "Az çalışma, rahat ortam";
    int yemekKrt = 3;
    int calismaSaati = 40;



    public void mesai() {

        System.out.println("Ustabaşı - acil durumlarda ek ücret almadan calişir.");
    }
    public void maasHesapla () {

        int maas = this.calismaSaati * 100;
        System.out.println("Ustabaşının maaşı " +maas);

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
