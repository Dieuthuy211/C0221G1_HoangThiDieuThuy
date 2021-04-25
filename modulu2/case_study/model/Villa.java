package model;

public class Villa extends Services {
    private String standardRoom;
    private String OtherFacilitie;
    private String poolArea;
    private String numberFloor;

    public Villa() {
    }

    public Villa(String standardRoom, String otherFacilitie, String poolArea, String numberFloor) {
        this.standardRoom = standardRoom;
        OtherFacilitie = otherFacilitie;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public Villa(String id, String serviceName, String areaUsed, String rentalCosts, String maximumPeople, String rentalType, String standardRoom, String otherFacilitie, String poolArea, String numberFloor) {
        super(id, serviceName, areaUsed, rentalCosts, maximumPeople, rentalType);
        this.standardRoom = standardRoom;
        OtherFacilitie = otherFacilitie;
        this.poolArea = poolArea;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherFacilitie() {
        return OtherFacilitie;
    }

    public void setOtherFacilitie(String otherFacilitie) {
        OtherFacilitie = otherFacilitie;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa {"+
                super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", OtherFacilitie='" + OtherFacilitie + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberFloor='" + numberFloor + '\'' +"}";
    }

    @Override
    public void showInFor() {
        toString();
    }
}
