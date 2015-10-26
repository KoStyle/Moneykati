package com.kostyle.moneykati.Controller;

/**
 * Created by Manu on 18/10/2015.
 */
public class CatBean {

    public CatBean(){
        this.id=0;
        this.name="";
        this.type=Controller.CAT_TYPE.DEBIT;
        this.link=0;
    }

    private double sysId;
    private double id;
    private String name;
    private Controller.CAT_TYPE type;
    private double link;

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

    public Controller.CAT_TYPE getType() {
        return type;
    }

    public void setType(Controller.CAT_TYPE type) {
        this.type = type;
    }

    public double getLink() {
        return link;
    }

    public void setLink(double link) {
        this.link = link;
    }
}
