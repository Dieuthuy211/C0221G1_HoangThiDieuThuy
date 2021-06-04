package model.service;

import model.bean.Customer;
import model.bean.Service;
import model.bean.ServiceType;

import java.util.List;

public interface IService<E> {
    List<E> findAll();

    void save(E e);

    E findById(int id);

   boolean update(E e);

    boolean remove(int id);
    List<E> search(String search);
    List<ServiceType> select();
}
