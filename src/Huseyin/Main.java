package Huseyin;

public class Main {
    public static void main(String[] args) {


        RentApartments obje = new RentApartments("Hüseyin", 2, true);

        System.out.println(obje.getName() + " kullanıcısının kirası " + (obje.kiraHesapla()+ obje.balkonVarmi()));


    }

}
