package com.example.corporatewebsite.model;

public class Company {

    private String companyName;
    private String tagline;
    private String email;
    private String phone;
    private String address;

    public Company() {
    }

    public Company(String companyName,
                   String tagline,
                   String email,
                   String phone,
                   String address) {

        this.companyName = companyName;
        this.tagline = tagline;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}