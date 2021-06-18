package com.example.model.repository.impl;

import com.example.model.bean.Product;
import com.example.model.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Repository
public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> map = new TreeMap<>();

    static {
        map.put(1, new Product(1, "Samsung Galaxy S21", "17990", "3 camera sau", "samsung"));
        map.put(2, new Product(2, "iPhone 12", "21990", "3 camera sau", "apple"));
        map.put(3, new Product(3, "OPPO Reno5", "8690", "3 camera sau", "oppo"));
        map.put(4, new Product(4, "Samsung S21", "7990", "3 camera sau", "samsung"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public void save(Product product) {
        int idAutoIncrement=(int)(Math.random()*1000);
        product.setProductId(idAutoIncrement);
        map.put(product.getProductId(), product);
    }

    @Override
    public Product findById(int id) {
        return map.get(id);
    }

    @Override
    public void update(int id, Product product) {
        map.put(id, product);
    }

    @Override
    public void remove(int id) {
        map.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> list=findAll();
        List<Product> productList=new ArrayList<>();
        for (Product product:list){
            if(product.getProductName().contains(name)){
                productList.add(product);
            }
        }
        return productList;
    }
}
