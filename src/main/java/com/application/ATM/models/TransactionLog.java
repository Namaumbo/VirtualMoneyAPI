package com.application.ATM.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "TransactionLog")
public class TransactionLog {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "transaction_date")
    private Date transactionDate;

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
