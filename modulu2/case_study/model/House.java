package model;

public class House extends Services {
    private String standardRoom;
    private String OtherFacilitie;
    private String numberFloor;

    public House() {
    }

    public House(String standardRoom, String otherFacilitie, String numberFloor) {
        this.standardRoom = standardRoom;
        OtherFacilitie = otherFacilitie;
        this.numberFloor = numberFloor;
    }

    public House(String id, String serviceName, String areaUsed, String rentalCosts, String maximumPeople, String rentalType, String standardRoom, String otherFacilitie, String numberFloor) {
        super(id, serviceName, areaUsed, rentalCosts, maximumPeople, rentalType);
        this.standardRoom = standardRoom;
        OtherFacilitie = otherFacilitie;
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

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", OtherFacilitie='" + OtherFacilitie + '\'' +
                ", numberFloor='" + numberFloor + '\'' +
                '}';
    }

    @Override
    public void showInFor() {
        toString();
    }
}
