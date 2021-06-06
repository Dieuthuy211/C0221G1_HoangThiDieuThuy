package model.bean.contract;

public class AmountOfServicesIncluded {
    private int contractId;
    private String attachServiceName;

    public AmountOfServicesIncluded() {
    }

    public AmountOfServicesIncluded(int contractId, String attachServiceName) {
        this.contractId = contractId;
        this.attachServiceName = attachServiceName;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }
}
