package Halime.RentApartment;

public class RenApartments {

    private String name;
    private int roomCount;
    private boolean balconyOrNo;



    public int room(int roomCount) {
        int rent = 0;
        switch (roomCount) {
            case 0:
                rent = 1400;

                break;
            case 1:
                rent = 1700;
                break;
            case 2:
                rent = 2200;
                break;
            case 3:
                rent = 2700;
                break;
            default:

                    System.out.println(roomCount + " odali evimiz yoktur");


                break;

        }
        return rent;

    }
    public int balkonluMu(boolean balconyOrNo){
        int balkonEkle;
        if(balconyOrNo){
            balkonEkle=room(this.roomCount)+200;
        }else {
           balkonEkle= room(this.roomCount);
        }
        return balkonEkle;
    }

    @Override
    public String toString() {
        return "RenApartments{" +
                "name='" + name + '\'' +
                ", roomCount=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }


}
