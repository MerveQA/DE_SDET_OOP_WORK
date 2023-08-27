package Ozcan.Task_Abstractt;

public class Calisan extends Insan {
    private int calisanId;

    public Calisan(String isim, String soysim, int calisanId) {
        super(isim, soysim); // super classın constructorını çağırır
        this.calisanId = calisanId;
    }


    @Override
    public void calis() {

        if (calisanId == 0) {
            System.out.println("Çalışan değil");
            System.out.println("Id = " + calisanId);
        }

        else {
            System.out.println("Çalışanımız");
            System.out.println("Id = " + calisanId);
        }

    }
}

