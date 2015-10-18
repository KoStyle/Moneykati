package com.kostyle.moneykati.DB;

import java.util.Date;

/**
 * Created by Manu on 18/10/2015.
 */
public class JouBean {

    public JouBean(){}

    public double sysId;
    public double id;
    public double accId;
    public double catId;
    public Date ts;
    public double ammount;
    public String reptype;
    public double repspan;
    public String debt;
    public String dContact;
    public String dStatus;
    public String obs;

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

    public double getAccId() {
        return accId;
    }

    public void setAccId(double accId) {
        this.accId = accId;
    }

    public double getCatId() {
        return catId;
    }

    public void setCatId(double catId) {
        this.catId = catId;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public String getReptype() {
        return reptype;
    }

    public void setReptype(String reptype) {
        this.reptype = reptype;
    }

    public double getRepspan() {
        return repspan;
    }

    public void setRepspan(double repspan) {
        this.repspan = repspan;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }

    public String getdContact() {
        return dContact;
    }

    public void setdContact(String dContact) {
        this.dContact = dContact;
    }

    public String getdStatus() {
        return dStatus;
    }

    public void setdStatus(String dStatus) {
        this.dStatus = dStatus;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
