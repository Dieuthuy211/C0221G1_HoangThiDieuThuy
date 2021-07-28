package model.bean;

public class Customer {
    private int customerID;
    private String customerCode;
    private  int customerTypeID;
    private String customerTypeName;
    private String customerName;
    private String customerGender;
    private String customerBirthday;
    private String customerIdCard;
    private String customerEmail;
    private String customerAddress;

    public Customer(int customerID, String customerCode, String customerTypeName, String customerName, String customerGender, String customerBirthday, String customerIdCard, String customerEmail, String customerAddress) {
        this.customerID = customerID;
        this.customerCode = customerCode;
        this.customerTypeName = customerTypeName;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerBirthday = customerBirthday;
        this.customerIdCard = customerIdCard;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public Customer(String customerCode, int customerTypeID, String customerName, String customerGender, String customerBirthday, String customerIdCard, String customerEmail, String customerAddress) {
        this.customerCode = customerCode;
        this.customerTypeID = customerTypeID;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerBirthday = customerBirthday;
        this.customerIdCard = customerIdCard;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public Customer(int customerID, String customerCode, int customerTypeID, String customerName, String customerGender, String customerBirthday, String customerIdCard, String customerEmail, String customerAddress) {
        this.customerID = customerID;
        this.customerCode = customerCode;
        this.customerTypeID = customerTypeID;
        this.customerName = customerName;
        this.customerGender = customerGender;
        this.customerBirthday = customerBirthday;
        this.customerIdCard = customerIdCard;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public int getCustomerTypeID() {
        return customerTypeID;
    }

    public void setCustomerTypeID(int customerTypeID) {
        this.customerTypeID = customerTypeID;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
