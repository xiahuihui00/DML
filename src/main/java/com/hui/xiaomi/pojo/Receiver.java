package com.hui.xiaomi.pojo;

public class Receiver {
    private Integer receiverId;
    private String receiverName;
    private String receiverTel;
    private String receiverAddress;

    public Receiver() {
    }

    public Receiver(String receiverName, String receiverTel, String receiverAddress) {
        this.receiverName = receiverName;
        this.receiverTel = receiverTel;
        this.receiverAddress = receiverAddress;
    }

    public Receiver(Integer receiverId, String receiverName, String receiverTel, String receiverAddress) {
        this.receiverId = receiverId;
        this.receiverName = receiverName;
        this.receiverTel = receiverTel;
        this.receiverAddress = receiverAddress;
    }

    public Integer getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    @Override
    public String toString() {
        return "receiver{" +
                "receiverId=" + receiverId +
                ", receiverName='" + receiverName + '\'' +
                ", receiverTel=" + receiverTel +
                ", receiverAddress='" + receiverAddress + '\'' +
                '}';
    }
}
