package com.desafioacc.model;

public class InsurantBuilder {

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

    public InsurantBuilder fisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
        return this;
    }
    public InsurantBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public InsurantBuilder dateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
        return this;
    }
    public InsurantBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }
    public InsurantBuilder street(String street) {
        this.street = street;
        return this;
    }
    public InsurantBuilder country(String country) {
        this.country = country;
        return this;
    }
    public InsurantBuilder city(String city) {
        this.city = city;
        return this;
    }
    public InsurantBuilder zipCode(int zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    public InsurantBuilder occupation(String occupation) {
        this.occupation = occupation;
        return this;
    }
    public InsurantBuilder hobbies(String hobbies) {
        this.hobbies = hobbies;
        return this;
    }
    public InsurantBuilder website(String website) {
        this.website = website;
        return this;
    }
    public InsurantBuilder picture(String picture) {
        this.picture = picture;
        return this;
    }

    public Insurant build() {
        return new Insurant(fisrtName, lastName, dateBirth, gender, street, country, zipCode, city,
                 occupation, hobbies, website, picture);
    }
}
