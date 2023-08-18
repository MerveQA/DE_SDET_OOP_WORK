package Huseyin;

public class RentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    private int rent;


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

    public int kiraHesapla () {
        //int rent=0;
        if (this.roomCount == 0)      this.rent = 1400;
        else if (this.roomCount == 1) this.rent = 1700;
        else if (this.roomCount == 2) this.rent = 2200;
        else if (this.roomCount == 3) this.rent = 2700;

        return rent;
    }
    public int balkonVarmi() {
        //int rent = 0;
        if (this.balconyOrNo) {
            this.rent = 200;

        }
        return rent;

    }

    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
    }
}
