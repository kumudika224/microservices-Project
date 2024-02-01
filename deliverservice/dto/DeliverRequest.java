package com.sliit.mtit.microservice.deliverservice.dto;

public class DeliverRequest {

    private String fullName;
    private String address;
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
        return "DeliverRequest{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", itemName='" + itemName + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
