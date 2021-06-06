package model.bean;

public class CustomerService {
    private int contractId;
    private  int customerId;
    private String customerName;
    private String serviceName;
    private String attachServiceName;

    public CustomerService() {
    }

    public CustomerService(int contractId, int customerId, String customerName, String serviceName, String attachServiceName) {
        this.contractId = contractId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.attachServiceName = attachServiceName;
    }

    public CustomerService(int customerId, String customerName, String serviceName, String attachServiceName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.attachServiceName = attachServiceName;
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

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }
}
