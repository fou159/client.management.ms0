package com.banking.ensas.Transaction;

import javax.persistence.ManyToOne;
import java.util.Date;

public class PrimaryTransaction {

    Float amount;
    Float availableBalance;
    Date  operationDate;
    String status;
    String description;


}
