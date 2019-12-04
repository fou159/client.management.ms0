package com.banking.ensas.Operations;

import com.banking.ensas.core.BaseEntity;
import com.banking.ensas.user.Client;

import javax.persistence.ManyToOne;

public class Operations extends BaseEntity {
    private String operationtitle;
    private String description;

    @ManyToOne
    private Client client;

    public Client getClient() {
        return client;
    }

    public String getDescription() {
        return description;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOperationtitle() {
        return operationtitle;
    }

    public void setOperationtitle(String operationtitle) {
        this.operationtitle = operationtitle;
    }

    public Operations(String operationtitle, String description) {
        this.operationtitle = operationtitle;
        this.description = description;
    }
}
