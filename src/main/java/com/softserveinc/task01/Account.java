package com.softserveinc.task01;

public class Account {
    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount cannot be less than 0");
        } else {
            balance += amount;
        }
    }

    public void withdraw(long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount cannot be less than 0");
        } else {
            if (amount > balance) {
                throw new NotMoneyEnoughException("amount cannot be less than balance");
            } else {
                balance -= amount;
            }
        }
    }
}
