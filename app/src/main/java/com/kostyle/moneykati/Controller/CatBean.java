package com.kostyle.moneykati.Controller;

/**
 * Created by Manu on 18/10/2015.
 */
public class CatBean {

    public CatBean(){}

    public double sysId;
    public double id;
    public String name;
    public String type;
    public double link;

    public double getSysId() {
        return sysId;
    }

    public void setSysId(double sysId) {
        this.sysId = sysId;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLink() {
        return link;
    }

    public void setLink(double link) {
        this.link = link;
    }
}
