package model.repository;

import model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "quat dieu hoa", 4270, "cong suat 100w", "Boss"));
        productMap.put(2, new Product(2, "may loc nuoc", 4429, "cong nghe loc RO", "Sunhouse"));
        productMap.put(3, new Product(3, "tivi", 3410, "24 inch", "Samsung"));
        productMap.put(4, new Product(4, "noi chien khong dau", 2990, "long noi chong dinh", "Philips"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : productMap.values()) {
            if (product.getNameProduct().contains(name)) {
                products.add(product);
            }
        }
        return products;
    }

    public void save(Product product) {
        productMap.put(product.getId(), product);

    }


    public Product findById(int id) {
        return productMap.get(id);
    }


    public void update(int id, Product product) {
        productMap.put(id, product);
    }


    public void remove(int id) {
productMap.remove(id);
    }
}
