package bai_tap.quan_li_san_pham;

public class Product {
    private int id;
    private String namesp;
    private Double price;

    public Product() {
    }

    public Product(int id, String namesp, Double price) {
        this.id = id;
        this.namesp = namesp;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamesp() {
        return namesp;
    }

    public void setNamesp(String namesp) {
        this.namesp = namesp;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id : "+id +" tên sản phẩm : "+
                namesp +" sản phẩm có giá : "+
                price +"\n";
    }
}
