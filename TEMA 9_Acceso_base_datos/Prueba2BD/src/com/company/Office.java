package com.company;

public class Office {

    private final String officeCode;
    private final String city;
    private final String phone;
    private final String address;
    private final String postalCode;
    private final String country;

    public Office(String officeCode, String city, String phone, String address, String postalCode, String country) {
        this.officeCode = officeCode;
        this.city = city;
        this.phone = phone;
        this.address = address;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public String getCity() {
        return city;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }


    @Override
    public String toString() {
        return "Office{" +
                "officeCode='" + officeCode + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
