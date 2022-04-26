package com.hui.xiaomi.pojo;

public class Customer {
    private Integer customerId;
    private String userName;
    private String password;

    public Customer() {
    }

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Customer(Integer customerId, String userName, String password) {
        this.customerId = customerId;
        this.userName = userName;
        this.password = password;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
