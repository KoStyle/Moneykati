package com.kostyle.moneykati.Controller;

import java.util.Date;

/**
 * Created by Manu on 18/10/2015.
 */
public class JouBean {

    public JouBean(){
        this.accId=0;
        this.amount =0;
        this.catId=0;
        this.debt=Controller.MYBOOL.FALSE;
        this.dStatus=Controller.DEBT_STATUS.CLOSED;
        this.ts= new Date();
        this.id=0;
        this.reptype=Controller.REP_TYPE.NONE;
        this.repspan=0;
        this.dContact="";
        this.obs="";
    }

    private double sysId;
    private double id;
    private double accId;
    private double catId;
    private Date ts;
    private double amount;
    private Controller.REP_TYPE reptype;
    private double repspan;
    private Controller.MYBOOL debt;
    private String dContact;
    private Controller.DEBT_STATUS dStatus;
    private String obs;

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Controller.REP_TYPE getReptype() {
        return reptype;
    }

    public void setReptype(Controller.REP_TYPE reptype) {
        this.reptype = reptype;
    }

    public double getRepspan() {
        return repspan;
    }

    public void setRepspan(double repspan) {
        this.repspan = repspan;
    }

    public Controller.MYBOOL getDebt() {
        return debt;
    }

    public void setDebt(Controller.MYBOOL debt) {
        this.debt = debt;
    }

    public String getdContact() {
        return dContact;
    }

    public void setdContact(String dContact) {
        this.dContact = dContact;
    }

    public Controller.DEBT_STATUS getdStatus() {
        return dStatus;
    }

    public void setdStatus(Controller.DEBT_STATUS dStatus) {
        this.dStatus = dStatus;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
