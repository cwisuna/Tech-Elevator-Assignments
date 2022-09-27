package com.techelevator;

public class CreditCardAccount implements Accountable{
    //instance variables
    private String accountHolder;
    private String accountNumber;
    private int debt;

    //getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    //constructor
    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this. accountNumber = accountNumber;
        debt = 0;
    }

    public int pay(int amountToPay){

        return debt -=amountToPay;

    }

    public int charge(int amountToCharge){

        return debt+= amountToCharge;
    }


    @Override
    public int getBalance() {
        return -debt;
    }
}
