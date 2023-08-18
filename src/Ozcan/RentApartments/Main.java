package Ozcan.RentApartments;

public class Main {
    public static void main(String[] args) {
        RentApartments apartment1 = new RentApartments();
        apartment1.setName("Hasan");
       apartment1.setRoomCount(2);
       apartment1.setBalconyOrNo(true);

        String userName = apartment1.getName();
        int amountOfRent = apartment1.kiraHesabi() + apartment1.kirayaBalkonEkley();//Ayrica belirtmeyince toplami yapmiyor

        System.out.println(userName + " rent is " + amountOfRent);


        RentApartments apartment2 = new RentApartments();
        apartment2.setName("Veli");
        apartment2.setRoomCount(3);
        apartment2.setBalconyOrNo(false);

         userName = apartment2.getName();
         amountOfRent = apartment2.kiraHesabi() + apartment2.kirayaBalkonEkley();

        System.out.println(userName + " rent is " + amountOfRent);


    }
    }

