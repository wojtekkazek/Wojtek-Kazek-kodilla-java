package com.kodilla.good.patterns.challenges.product_order;

public class Address {

    private String city;
    private int postCode;
    private String street;
    private int houseNo;
    private int flatNo;

    public Address(String city, int postCode, String street, int houseNo, int flatNo) {
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.houseNo = houseNo;
        this.flatNo = flatNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postCode=" + postCode +
                ", street='" + street + '\'' +
                ", houseNo=" + houseNo +
                ", flatNo=" + flatNo +
                '}';
    }
}
