package com.banking.ensas.Operations;

import com.banking.ensas.core.BaseEntity;
import com.banking.ensas.user.Client;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Recipient extends BaseEntity {


    String description;
    @ManyToOne
    Client sender;
    @ManyToOne
    Client receiver;

    public Recipient(String description, Client sender, Client receiver) {
        this.description = description;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getSender() {
        return sender;
    }

    public void setSender(Client sender) {
        this.sender = sender;
    }

    public Client getReceiver() {
        return receiver;
    }

    public void setReceiver(Client receiver) {
        this.receiver = receiver;
    }
}
