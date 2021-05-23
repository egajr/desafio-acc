package com.desafioacc.model;

public class SendQuote {

    private String email;
    private String phone;
    private String user;
    private String pass;
    private String comments;

    public SendQuote(String email, String phone, String user, String pass, String comments) {
        this.email = email;
        this.phone = phone;
        this.user = user;
        this.pass = pass;
        this.comments = comments;
    }

    public SendQuote() {
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
