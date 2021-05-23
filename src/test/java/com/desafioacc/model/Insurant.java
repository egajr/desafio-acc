package com.desafioacc.model;

public class Insurant {

    private String fisrtName;
    private String lastName;
    private String dateBirth;
    private String gender;
    private String street;
    private String country;
    private int zipCode;
    private String city;
    private String occupation;
    private String hobbies;
    private String website;
    private String picture;


    public Insurant(String fisrtName, String lastName, String dateBirth, String gender,
                    String street, String country, int zipCode, String city, String occupation,
                    String hobbies, String website, String picture) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.gender = gender;
        this.street = street;
        this.country = country;
        this.zipCode = zipCode;
        this.city = city;
        this.occupation = occupation;
        this.hobbies = hobbies;
        this.website = website;
        this.picture = picture;
    }

    public Insurant(){
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
