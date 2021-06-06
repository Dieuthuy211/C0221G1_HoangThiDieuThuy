package model.service.impl;

import model.bean.*;
import model.repository.ContractDetailRepository;
import model.repository.ContractRepository;
import model.service.IService;

import java.util.List;

public class ContractDetailImp implements IService<ContractDetail> {
    ContractDetailRepository contractDetailRepository = new ContractDetailRepository();

    @Override
    public void save(ContractDetail contractDetail) {
        contractDetailRepository.insertContract(contractDetail);
    }
    @Override
    public List<AttachService> selectAttachService() {
        return contractDetailRepository.listAttachService();
    }
    @Override
    public List<ContractDetail> findAll() {
        return null;
    }


    @Override
    public ContractDetail findById(int id) {
        return null;
    }

    @Override
    public boolean update(ContractDetail contractDetail) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public List<ContractDetail> search(String search) {
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


}
