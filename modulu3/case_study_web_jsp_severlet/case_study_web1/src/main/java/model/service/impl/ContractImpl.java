package model.service.impl;

import model.bean.contract.AmountOfServicesIncluded;
import model.bean.contract.AttachService;
import model.bean.contract.ConTract;
import model.bean.customer.CustomerType;
import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Position;
import model.bean.service.RentType;
import model.bean.service.ServiceType;
import model.repository.ContractRepository;
import model.service.IService;

import java.util.List;

public class ContractImpl implements IService<ConTract> {
    ContractRepository contractRepository = new ContractRepository();

    @Override
    public List<ConTract> findAll() {
        return contractRepository.listContract();
    }

    @Override
    public void save(ConTract conTract) {
        contractRepository.insertContract(conTract);
    }
    @Override
    public boolean update(ConTract conTract) {
        return contractRepository.update(conTract);
    }
    @Override
    public ConTract findById(int id) {
        return contractRepository.selectContract(id);
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public List<ConTract> search(String search) {
        return null;
    }

    @Override
    public List<ServiceType> select() {
        return null;
    }

    @Override
    public List<CustomerType> selectCustomerType() {
        return null;
    }

    @Override
    public List<Position> selectPosition() {
        return null;
    }

    @Override
    public List<Division> selectDivision() {
        return null;
    }

    @Override
    public List<EducationDegree> selectEducationDegree() {
        return null;
    }


    @Override
    public List<RentType> selectRentType() {
        return null;
    }

    @Override
    public List<AttachService> selectAttachService() {
        return null;
    }

    @Override
    public List<AmountOfServicesIncluded> selectAmount() {
        return null;
    }
}
