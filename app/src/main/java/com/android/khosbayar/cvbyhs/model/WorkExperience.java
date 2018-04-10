package com.android.khosbayar.cvbyhs.model;

/**
 * Created by khosbayar on 4/9/18.
 */

public class WorkExperience {
    private String companyName;
    private int from;
    private int to;
    private String where;
    private String title;
    private int companyImg;

    public WorkExperience(String companyName, int from, int to, String where, String title, int companyImg) {
        this.companyName = companyName;
        this.from = from;
        this.to = to;
        this.where = where;
        this.title = title;
        this.companyImg = companyImg;
    }

    public int getCompanyImg() {
        return companyImg;
    }

    public void setCompanyImg(int companyImg) {
        this.companyImg = companyImg;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getFromTo() {
        return from+" - "+to;
    }

    public String getWhere() {
        return where;
    }

    public String getTitle() {
        return title;
    }
}
