package model;

public abstract class Services {
    private String id;
    private String ServiceName;
    private String areaUsed;
    private String rentalCosts;
    private String maximumPeople;
    private String rentalType;

    public Services() {
    }

    public Services(String id, String serviceName, String areaUsed, String rentalCosts, String maximumPeople, String rentalType) {
        this.id = id;
        ServiceName = serviceName;
        this.areaUsed = areaUsed;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public String getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(String areaUsed) {
        this.areaUsed = areaUsed;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(String maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", ServiceName='" + ServiceName + '\'' +
                ", areaUsed='" + areaUsed + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", maximumPeople='" + maximumPeople + '\'' +
                ", rentalType='" + rentalType + '\'' ;
    }

    public abstract void showInFor();
}
