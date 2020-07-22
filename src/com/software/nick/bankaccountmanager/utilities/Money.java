package com.software.nick.bankaccountmanager.utilities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public strictfp class Money implements IComparableCustom<Money> {

    public static final int DEFAULT_FACTOR_PART = 100;

    private static Set<String> currencyNames = new HashSet<>();

    private String currencyName;
    private long amount;
    private int transactionFee;

    public Money(String currencyName, long amount, int transactionFee) {
        this.currencyName = currencyName;
        this.amount = amount;
        this.transactionFee = transactionFee;
    }

    public static Set<String> getCurrencyNames() {
        return currencyNames;
    }

    public static void setCurrencyNames(Set<String> currencyNames) {
        Money.currencyNames.addAll(currencyNames);
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        if(currencyNames.contains(currencyName))  this.currencyName = currencyName;
        else System.out.println("Wrong currency type");
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(int transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount &&
                Objects.equals(currencyName, money.currencyName);
    }

    @Override
    public int hashCode() {
        return (int)(31 * amount + ((currencyName == null) ? 0 : currencyName.hashCode()));
    }

    @Override
    public String toString() {
        return "Money{" +
                "currencyName='" + currencyName + '\'' +
                ", amount=" + amount +
                '}';
    }

    public long add(long amount, String currencyName){
        if(this.currencyName == currencyName && currencyName != null) return this.amount += amount - transactionFee;
        else return this.amount;
    }

    public long subtract(long amount, String currencyName){
        if(this.currencyName == currencyName && currencyName != null) return this.amount -= amount - transactionFee;
        else return this.amount;
    }

    @Override
    public Long compareTo(Money o) {
        if(this.currencyName == o.currencyName && this.currencyName != null) return this.amount - o.amount;
        else return null;
    }
}
