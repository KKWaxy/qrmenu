package com.qrmenu.qrmenuapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "menudetail")
public class MenuDetail {

    @Id
    private UUID menuDetailID;
    private UUID menuID;
    private UUID foodID;
    private UUID drinkID;
    private Date lastModifiedTime;
    private Date timestamp;

    public MenuDetail(UUID menuDetailID, UUID menuID, UUID foodID, UUID drinkID, Date lastModifiedTime, Date timestamp) {
        this.menuDetailID = menuDetailID;
        this.menuID = menuID;
        this.foodID = foodID;
        this.drinkID = drinkID;
        this.lastModifiedTime = lastModifiedTime;
        this.timestamp = timestamp;
    }

    public UUID getMenuDetailID() {
        return menuDetailID;
    }

    public void setMenuDetailID(UUID menuDetailID) {
        this.menuDetailID = menuDetailID;
    }

    public UUID getMenuID() {
        return menuID;
    }

    public void setMenuID(UUID menuID) {
        this.menuID = menuID;
    }

    public UUID getFoodID() {
        return foodID;
    }

    public void setFoodID(UUID foodID) {
        this.foodID = foodID;
    }

    public UUID getDrinkID() {
        return drinkID;
    }

    public void setDrinkID(UUID drinkID) {
        this.drinkID = drinkID;
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
        return "MenuDetail{" +
                "menuDetailID=" + menuDetailID +
                '}';
    }
}
