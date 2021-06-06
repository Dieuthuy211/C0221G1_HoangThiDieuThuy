package model.bean.customer;

public class CustomerUseService {
    private int contractId;
    private  int customerId;
    private String customerName;
    private String serviceName;
    private String contractStartDate;
    private String contractEndDate;

    public CustomerUseService() {
    }

    public CustomerUseService(int contractId, int customerId, String customerName, String serviceName, String contract_start_date, String contract_end_date) {
        this.contractId = contractId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.contractStartDate = contract_start_date;
        this.contractEndDate = contract_end_date;
    }

    public CustomerUseService(int customerId, String customerName, String serviceName, String contract_start_date, String contract_end_date) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.contractStartDate = contract_start_date;
        this.contractEndDate = contract_end_date;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String contractEndDate) {
        this.contractEndDate = contractEndDate;
    }
}
