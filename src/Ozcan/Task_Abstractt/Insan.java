package Ozcan.Task_Abstractt;

public abstract class Insan {
    private String isim;
    private String soysim;

    public Insan(String isim, String soysim) {
        this.isim = isim;
        this.soysim = soysim;
    }


    public abstract void calis();


    public void Bilgilendirme() {
        System.out.println("İsim: " + isim);
        System.out.println("Soyisim: " + soysim);
    }

    public void isimDegistir(String yeniIsim, String yeniSoyisim) {
        this.isim = yeniIsim;
        this.soysim = yeniSoyisim;
        System.out.println("İsim değiştirildi.");
    }
}
