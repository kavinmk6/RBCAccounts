package com.example.rbcaccounts.Repository;

import com.rbc.rbcaccountlibrary.Account;
import com.rbc.rbcaccountlibrary.AccountType;

import java.util.ArrayList;
import java.util.Collections;

public class RepositoryPopulateData {
    public ArrayList<Account> accountArrayList = new ArrayList<>();

    public RepositoryPopulateData() {
        Collections.addAll(accountArrayList, new Account("kavin", "4372251", "3000 CAD", AccountType.CHEQUING),
                new Account("kavin Mohandass", "4372251", "3000 CAD", AccountType.CHEQUING),
                new Account("Ajith Kumar", "437228", "8000 CAD", AccountType.CREDIT_CARD),
                new Account("Joseph Vijay", "4372252", "7000 CAD", AccountType.LOAN),
                new Account("Surya Sivakumar", "4372257", "6500 CAD", AccountType.CHEQUING),
                new Account("Jhon Patrick", "4372259", "10000 CAD", AccountType.MORTGAGE),
                new Account("Nick Jonas", "4372253", "5000 CAD", AccountType.CREDIT_CARD),
                new Account("Salmon Rasool", "4372254", "7500 CAD", AccountType.MORTGAGE),
                new Account("Peter Bob", "4372256", "3500 CAD", AccountType.LOAN),
                new Account("Harish Kalyan", "4372250", "4000 CAD", AccountType.CHEQUING));
    }
}
