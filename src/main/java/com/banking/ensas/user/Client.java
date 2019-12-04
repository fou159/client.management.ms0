package com.banking.ensas.user;

import javax.persistence.Entity;

@Entity
public class Client extends User {
    private String Address;
    private String phone;
    private String cin;
    private int Age;

    public Client() {

    }

    public Client(String username, String firstName, String lastName, String password, String address, String phone, String cin, int age) {
        super(username, firstName, lastName, password);
        Address = address;
        this.phone = phone;
        this.cin = cin;
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
