package com.banking.ensas.user;


import com.banking.ensas.core.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity {

    private String RoleName;

    public Role(){
        super();

    }

    public Role(String roleName) {
        this();
        RoleName = roleName;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "RoleName='" + RoleName + '\'' +
                '}';
    }
}
