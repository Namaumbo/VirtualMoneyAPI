package com.application.ATM.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Random;

@Entity
@Table(name = "Account_detail")
public class AccountDetail {

    @OneToOne(mappedBy = "accountDetail", cascade = CascadeType.ALL)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Acc_id;

    @Column(name = "account_balance", nullable = false)
    private double accountBalance;

    @Column(name = "account_Number", nullable = false)
    private String accountNumber;

    public AccountDetail() {
    }

    public int getId() {
        return Acc_id;
    }

    public void setId(int Acc_id) {
        this.Acc_id = Acc_id;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        Random random = new Random();
        int accountNumber = random.nextInt(999999);
        return ""+accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
