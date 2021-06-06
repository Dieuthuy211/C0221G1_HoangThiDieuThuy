package model.service;

import model.bean.contract.AmountOfServicesIncluded;
import model.bean.contract.AttachService;
import model.bean.customer.CustomerType;
import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Position;
import model.bean.service.RentType;
import model.bean.service.ServiceType;

import java.util.List;

public interface IService<E> {
    List<E> findAll();

    void save(E e);

    E findById(int id);

   boolean update(E e);

    boolean remove(int id);
    List<E> search(String search);
    List<ServiceType> select();
    List<CustomerType> selectCustomerType();
    List<Position> selectPosition();
    List<Division> selectDivision();
    List<EducationDegree> selectEducationDegree();
    List<RentType> selectRentType();
    List<AttachService> selectAttachService();
    List<AmountOfServicesIncluded> selectAmount();


}
