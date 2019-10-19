package com.timbuchalka.MainTutClass;

public class BankAcc {

    private String accountN;
    private String phoneN;
    private float balance; //zostatok na ucte
    private String customerName;
    private String email;
    private String password;

    public BankAcc(){
        this("Default accountN","Default phoneN",0,"Default name","Default email","Default pass");
        System.out.println("Empty constructor called");
    }

    public BankAcc(String accountN,String phoneN,float balance,String name,String email,String pass){
        this.accountN = accountN;
        this.phoneN = phoneN;
        this.balance = balance;
        this.customerName = name;
        this.email = email;
        this.password = pass;
    }

    public void deposit(float depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" made. \nNew balance is "+balance);
    }

    public void withdrawal(float withdrawalAmount){
        if (balance - withdrawalAmount <=0){
            System.out.println("Only " + balance + " avaible."+"\n Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" processed"+"\nRemaining balance is "+balance);
        }

    }

    public String getAccountN(){
        return this.accountN;
    }
    public String getPhoneN(){
        return this.phoneN;
    }
    public float getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }


}
