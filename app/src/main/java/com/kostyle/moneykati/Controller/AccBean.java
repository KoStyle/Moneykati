package com.kostyle.moneykati.Controller;

/**
 * Created by Manu on 18/10/2015.
 */
public class AccBean {
    public AccBean(){
        this.id=0;
        this.name="";
        this.iniBal=0;
        this.bal=0;
        this.idMaster=0;
        this.status=Controller.ACC_STATUS.OPEN;
    }

    private double sysId;
    private double id;
    private String name;
    private double iniBal;
    private double bal;
    private double idMaster;
    private Controller.ACC_STATUS status;

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

    public Controller.ACC_STATUS getStatus() {
        return status;
    }

    public void setStatus(Controller.ACC_STATUS status) {
        this.status = status;
    }
}
