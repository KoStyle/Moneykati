package com.kostyle.moneykati.DB;

/**
 * Created by Manu on 18/10/2015.
 */
public class AccBean {
    public AccBean(){}

    public double sysId;
    public double id;
    public String name;
    public double iniBal;
    public double bal;
    public double idMaster;
    public String status;

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

    public double getIniBal() {
        return iniBal;
    }

    public void setIniBal(double iniBal) {
        this.iniBal = iniBal;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getIdMaster() {
        return idMaster;
    }

    public void setIdMaster(double idMaster) {
        this.idMaster = idMaster;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
