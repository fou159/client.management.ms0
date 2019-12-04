package com.banking.ensas.Accounts;

import com.banking.ensas.core.BaseEntity;
import org.hibernate.type.UUIDCharType;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
public class Account extends BaseEntity {

    @Id
    @Column(columnDefinition = "uuid-char",unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUIDCharType accountNumber;

    Long accountBalance;

    public Account(){

    }

    public Account(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public UUIDCharType getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUIDCharType accountNumber) {
        this.accountNumber = accountNumber;
    }
}
