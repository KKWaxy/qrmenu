package com.qrmenu.qrmenuapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "drink")
public class Drink {

    @Id
    private UUID drinkId;
    private String drinkDescription;
    private boolean drinkStatus;
    private Date lastModifiedTime;
    private Date timestamp;

    public Drink(UUID drinkId, String drinkDescription, boolean drinkStatus, Date lastModifiedTime, Date timestamp) {
        this.drinkId = drinkId;
        this.drinkDescription = drinkDescription;
        this.drinkStatus = drinkStatus;
        this.lastModifiedTime = lastModifiedTime;
        this.timestamp = timestamp;
    }

    public UUID getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(UUID drinkId) {
        this.drinkId = drinkId;
    }

    public String getDrinkDescription() {
        return drinkDescription;
    }

    public void setDrinkDescription(String drinkDescription) {
        this.drinkDescription = drinkDescription;
    }

    public boolean isDrinkStatus() {
        return drinkStatus;
    }

    public void setDrinkStatus(boolean drinkStatus) {
        this.drinkStatus = drinkStatus;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkId=" + drinkId +
                '}';
    }
}
