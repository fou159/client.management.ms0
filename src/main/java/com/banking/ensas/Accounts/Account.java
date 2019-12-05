package com.banking.ensas.Accounts;

import com.banking.ensas.core.BaseEntity;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.type.UUIDCharType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
public class Account extends BaseEntity implements Serializable {

    @Id
    @Column(unique = true)
    Integer accountNumber;

    Long accountBalance;

    public Account(){

    }

    public Account(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}
