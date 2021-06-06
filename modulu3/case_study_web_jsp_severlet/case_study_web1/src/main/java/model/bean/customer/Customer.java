package model.bean.customer;

public class Customer {
    private int id;
    private int idCustomerType;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String card;
    private String phone;
    private String email;
    private String address;


    public Customer() {
    }

    public Customer(int idCustomerType, String name, String gender, String dateOfBirth, String card, String phone, String email, String address) {
        this.idCustomerType = idCustomerType;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.card = card;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Customer(int id, int idCustomerType, String name, String gender, String dateOfBirth, String card, String phone, String email, String address) {
        this.id = id;
        this.idCustomerType = idCustomerType;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.card = card;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public int getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(int idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}