package com.example.proba;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    private String accountNumber;
    private String accountType;
    private Double balance;
    private Double pastMonthTurnover;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;


    public Account(
                   String accountNumber,
                   String accountType,
                   Double balance,
                   Double pastMonthTurnover) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.pastMonthTurnover = pastMonthTurnover;
    }

    public Account() {

    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getPastMonthTurnover() {
        return pastMonthTurnover;
    }

    public void setPastMonthTurnover(Double pastMonthTurnover) {
        this.pastMonthTurnover = pastMonthTurnover;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", pastMonthTurnover=" + pastMonthTurnover +
                ", customer=" + customer +
                '}';
    }
}
