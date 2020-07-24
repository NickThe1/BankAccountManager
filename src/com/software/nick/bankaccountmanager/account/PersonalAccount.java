package com.software.nick.bankaccountmanager.account;

import com.software.nick.bankaccountmanager.utilities.Money;

import java.util.Set;

public class PersonalAccount extends AbstractAccount {

    private String companyName;


    public PersonalAccount(Set<Money> moneySet, int id, String firstName, String lastName, int expirationDate, String companyName) {
        super(moneySet, id, firstName, lastName, expirationDate);
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    protected void exchangeMoney() {

    }
}
