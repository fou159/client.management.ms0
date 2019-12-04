package com.banking.ensas.Operations;

import com.banking.ensas.Embedded.Location;
import com.banking.ensas.core.BaseEntity;
import com.banking.ensas.user.Client;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Appointement extends BaseEntity {

    @Embedded
    Location location;
    Boolean Confirmed;
    String Description;
    Date appDate;
    @ManyToOne
    Client pointerClient;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Boolean getConfirmed() {
        return Confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        Confirmed = confirmed;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    public Client getPointerClient() {
        return pointerClient;
    }

    public void setPointerClient(Client pointerClient) {
        this.pointerClient = pointerClient;
    }

    public Appointement(Location location, Boolean confirmed, String description, Date appDate, Client pointerClient) {
        this.location = location;
        Confirmed = confirmed;
        Description = description;
        this.appDate = appDate;
        this.pointerClient = pointerClient;
    }
}
