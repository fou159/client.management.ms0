/*package com.banking.ensas.user;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Admin extends User {


    private String Address;

    @OneToMany(mappedBy = "admin")
    private List<Admin> managers;
    @ManyToOne
    private  Admin admin;


    public void addManagers(Admin managers){
        this.managers.add(managers);
    }
    public Boolean hasadmin() {
        if(this.getRoles().stream().anyMatch(rl->rl.getRoleName().equals("ADMIN")))return true;
        return (this.managers!=null && this.managers.size()>0);
    }

    public Admin(){
        super();
        managers=new ArrayList<>();
    }

    public Admin(String username, String firstName, String lastName, String password, String address) {
        super(username, firstName, lastName, password);
        Address = address;
    }


    public List<Admin> getManagers() {
        return managers;
    }

    public void setManagers(List<Admin> managers) {
        this.managers = managers;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin){
        this.admin=admin;
    }
}
*/