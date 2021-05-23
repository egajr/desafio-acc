package com.desafioacc.model;

public class SendQuoteBuilder {

    private String email;
    private String phone;
    private String user;
    private String pass;
    private String comments;


    public SendQuoteBuilder email(String email) {
        this.email = email;
        return this;
    }

    public SendQuoteBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public SendQuoteBuilder user(String user) {
        this.user = user;
        return this;
    }

    public SendQuoteBuilder pass(String pass) {
        this.pass = pass;
        return this;
    }

    public SendQuoteBuilder comments(String comments) {
        this.comments = comments;
        return this;
    }

    public SendQuote build() {
        return new SendQuote(email, phone, user, pass, comments);
    }
}
