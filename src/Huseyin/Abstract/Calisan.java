package Huseyin.Abstract;

public class Calisan extends Insan{
    int calisanId;

    public Calisan(int calisanId) {
        if (calisanId == 0) {
            System.out.println("Çalışan değil");
            System.out.println("ID = 0");
        }
        else {
            System.out.println("Çalışanımız");
            this.calisanId = calisanId;
        }

    }

    @Override
    public void calis() {
        System.out.println("Calisan class'daki calis() metodu");

    }

    public int getCalisanId() {
        return calisanId;
    }

    public void setCalisanId(int calisanId) {
        this.calisanId = calisanId;
    }


}
