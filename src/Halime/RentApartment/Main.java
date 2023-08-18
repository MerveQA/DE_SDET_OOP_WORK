package Halime.RentApartment;

public class Main {
    public static void main(String[] args) {
    RenApartments objeR=new RenApartments();
    objeR.setName("Ali Kul");
    objeR.setRoomCount(3);
    objeR.setBalconyOrNo(true);

        objeR.room(objeR.getRoomCount());
        int kira=objeR.balkonluMu(objeR.isBalconyOrNo());
        System.out.println("Kira: "+kira);


    }
}
