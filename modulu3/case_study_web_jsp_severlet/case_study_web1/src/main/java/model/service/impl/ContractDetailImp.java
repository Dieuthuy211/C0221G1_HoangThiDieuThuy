package model.service.impl;

import model.bean.contract.AmountOfServicesIncluded;
import model.bean.contract.AttachService;
import model.bean.contract.ContractDetail;
import model.bean.customer.CustomerType;
import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Position;
import model.bean.service.RentType;
import model.bean.service.ServiceType;
import model.repository.ContractDetailRepository;
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
    public List<AmountOfServicesIncluded> selectAmount() {
        return null;
    }

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.listContractDetail();
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
