package model.bean;

public class RentType {
    private int rentTypeId;
    private String rentTypeName;
    private String rentTypePrice;

    public RentType() {
    }

    public RentType(int rentTypeId, String rentTypeName, String rentTypePrice) {
        this.rentTypeId = rentTypeId;
        this.rentTypeName = rentTypeName;
        this.rentTypePrice = rentTypePrice;
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public String getRentTypePrice() {
        return rentTypePrice;
    }

    public void setRentTypePrice(String rentTypePrice) {
        this.rentTypePrice = rentTypePrice;
    }
}
