package com.timbuchalka.MainTutClass;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;


    //prve dve len volaju tretiu


    public VipCustomer(){
        this("Default name",100.00,"Default@email");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
