package com.software.nick.bankaccountmanager.utilities;

public strictfp class Transaction {


    public static void sendMoney(Money sender, Money reciever, long amount, String currencyName){
        sender.subtract(amount, currencyName);
        reciever.add(amount, currencyName);
    }

}
