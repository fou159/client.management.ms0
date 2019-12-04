package com.banking.ensas.Accounts;

import com.banking.ensas.Transaction.PrimaryTransaction;
import com.banking.ensas.user.Client;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

public class Primary_Account extends Account {

    @OneToMany(fetch = FetchType.LAZY)
    List<PrimaryTransaction> transactions;
    @OneToOne(fetch = FetchType.LAZY)
    Client owner;
    String NomOffre;


    public Primary_Account() {
        super();
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(PrimaryTransaction transaction){
        this.transactions.add(transaction);
    }


    public Primary_Account(Long accountBalance) {
        super(accountBalance);
    }


    public List<PrimaryTransaction> getTransactions() {
        return transactions;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public String getNomOffre() {
        return NomOffre;
    }

    public void setNomOffre(String nomOffre) {
        NomOffre = nomOffre;
    }
}
