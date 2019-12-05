package com.banking.ensas.user;

import com.banking.ensas.core.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends BaseEntity {

    @NotNull(message = "First name should not be null")
    @Size(min = 5,max = 25)
    private String firstName;
    @NotNull(message = "Last name should not be null")
    @Size(min = 5,max = 25)
    private String lastName;

    @NotNull
    @Size(min = 5,max = 25)
    @Column(nullable = false,unique = true)
    private String username;


    @JsonIgnore
    private String Password;
    @Transient
    private String RePassword;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Role> Roles;



    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }



    public void addRole(Role role) {
        this.Roles.add(role);
    }

    public List<Role> getRoles() {
        return Roles;
    }

    public void setRoles(List<Role> roles) {
        this.Roles = roles;
    }

    protected User(){
        super();
        Roles=new ArrayList<>();
    }

    public User(String username,String firstName, String lastName, String password) {
        this();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        BCryptPasswordEncoder Crypter = new BCryptPasswordEncoder(11);
        this.Password = Crypter.encode(password);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonIgnore
    public String getPassword() {
        return Password;
    }
    @JsonSetter
    public void setPassword(String password) {
        //BCryptPasswordEncoder Crypter = new BCryptPasswordEncoder(11);

        this.Password = password;
    //Crypter.encode(password);
    }
}
