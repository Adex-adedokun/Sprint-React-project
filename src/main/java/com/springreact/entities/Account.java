package com.springreact.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String accountType;
    private Double balance;
    private Double initialBalance;

    public Account(String accountType, Double balance, Double initialBalance) {
        this.accountType = accountType;
        this.balance = balance;
        this.initialBalance = initialBalance;
    }

    public Account() {
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

    public Double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Double initialBalance) {
        this.initialBalance = initialBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountType, account.accountType) && Objects.equals(balance, account.balance) && Objects.equals(initialBalance, account.initialBalance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType, balance, initialBalance);
    }

    @Override
    public String toString() {
        return "Account {" +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", initialBalance=" + initialBalance +
                '}';
    }
}
