package model.service.impl;

import model.bean.*;
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
    public ConTract findById(int id) {
        return null;
    }

    @Override
    public boolean update(ConTract conTract) {
        return false;
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
}
