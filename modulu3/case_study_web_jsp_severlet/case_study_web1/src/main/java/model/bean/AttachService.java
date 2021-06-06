package model.bean;

public class AttachService {
    private int attachServiceId;
    private String attachServiceName;
    private int attachServicePrice;
    private int attachServiceUntil;
    private String attachServiceStatus;

    public AttachService() {
    }

    public AttachService(int attachServiceId, String attachServiceName, int attachServicePrice, int attachServiceUntil, String attachServiceStatus) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.attachServicePrice = attachServicePrice;
        this.attachServiceUntil = attachServiceUntil;
        this.attachServiceStatus = attachServiceStatus;
    }

    public AttachService(String attachServiceName, int attachServicePrice, int attachServiceUntil, String attachServiceStatus) {
        this.attachServiceName = attachServiceName;
        this.attachServicePrice = attachServicePrice;
        this.attachServiceUntil = attachServiceUntil;
        this.attachServiceStatus = attachServiceStatus;
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public int getAttachServicePrice() {
        return attachServicePrice;
    }

    public void setAttachServicePrice(int attachServicePrice) {
        this.attachServicePrice = attachServicePrice;
    }

    public int getAttachServiceUntil() {
        return attachServiceUntil;
    }

    public void setAttachServiceUntil(int attachServiceUntil) {
        this.attachServiceUntil = attachServiceUntil;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }
}
