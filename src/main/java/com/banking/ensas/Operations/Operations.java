package com.banking.ensas.Operations;

import com.banking.ensas.core.BaseEntity;

public class Operations extends BaseEntity {
    private String operationtitle;
    private String description;

    public String getDescription() {
        return description;
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
