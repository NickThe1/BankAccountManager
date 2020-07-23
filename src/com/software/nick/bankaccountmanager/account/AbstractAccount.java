package com.software.nick.bankaccountmanager.account;

import com.software.nick.bankaccountmanager.utilities.Money;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractAccount {

    private Set<Money> moneySet = new HashSet<>();
    private int id;
    private String firstName;
    private String lastName;
    private int expirationDate;

    public AbstractAccount(){
    }

    public Set<Money> getMoneySet() {
        return moneySet;
    }

    public void setMoneySet(Set<Money> moneySet) {
        this.moneySet.addAll(moneySet);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    protected abstract void exchangeMoney();
}
