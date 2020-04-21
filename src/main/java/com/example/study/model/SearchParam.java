package com.example.study.model;

public class SearchParam {

    private String account;
    private String email;
    private int page;

    // { "account" : "", "email" : "", "page" : 0 }   json 형태로 바꿔준다. 기본적으로 jackson 라이브러리가 내장되어 있음.

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
