package Huseyin;

public class RentApartments {
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    private boolean esyaVarMi;
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

    public boolean isEsyaVarMi() {
        return esyaVarMi;
    }
    public void setEsyaVarMi(boolean esyaVarMi) {
        this.esyaVarMi = esyaVarMi;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int kiraHesapla () {

        if (this.roomCount == 0)      this.rent = 1400;
        else if (this.roomCount == 1) this.rent = 1700;
        else if (this.roomCount == 2) this.rent = 2200;
        else if (this.roomCount == 3) this.rent = 2700;

        return rent;
    }
    public int  balkonVarmi() {

        if (this.balconyOrNo) {
            this.rent = 200;

        }else this.rent = 0;
        return rent;


    }
    public int esyaliMi () {

        if (this.esyaVarMi) {
            this.rent = 200;

        }else this.rent = 0;
        return rent;


    }

    public RentApartments(String name, int roomCount, boolean balconyOrNo, boolean esyaVarMi) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;
        this.esyaVarMi = esyaVarMi;
    }
}
