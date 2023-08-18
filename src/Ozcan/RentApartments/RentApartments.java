package Ozcan.RentApartments;

public class RentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

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

    public int kiraHesabi() {
        int rent = 1400;
        for (int i = 1; i < roomCount; i++) {
            rent += 500;
        }
        return rent;
    }

    public int kirayaBalkonEkley() {
        int eRent = 0;
        if (balconyOrNo) {
            eRent = 200;
        }
        return eRent;
    }
}
