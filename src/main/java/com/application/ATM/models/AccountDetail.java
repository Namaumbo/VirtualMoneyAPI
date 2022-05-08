package com.application.ATM.models;

import javax.persistence.*;

@Entity
@Table(name = "Account_detail")
public class AccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "account_balance", nullable = false)
    private double accountBalance;

    @Column(name = "account_Number", nullable = false)
    private String accountNumber;

    public AccountDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
