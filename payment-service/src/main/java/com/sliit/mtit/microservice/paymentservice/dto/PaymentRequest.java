package com.sliit.mtit.microservice.paymentservice.dto;

public class PaymentRequest {

    private String fullName;
    private String address;
    private String paymentType;
    private String amount;
    private String itemName;
    private String qty;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", paymentType='" + paymentType + '\'' +
                ", amount='" + amount + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
