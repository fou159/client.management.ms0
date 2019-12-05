package com.banking.ensas.Transaction;

import com.banking.ensas.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class PrimaryTransaction extends BaseEntity {

    Float amount;
    Float availableBalance;
    Date  operationDate;
    String status;
    String description;


}
