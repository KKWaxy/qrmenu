package com.qrmenu.qrmenuapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "menu")
public class Menu {

    @Id
    private UUID menuID;
    private String menuDescription;
    private boolean menuStatus;
    private Date lastModifiedTime;
    private UUID lastModifiedBy;
    private Date timestamp;

    public Menu() {
        this.menuID = UUID.randomUUID();
    }

    public Menu(String menuDescription) {
        this();
        this.menuDescription = menuDescription;
    }

    public Menu(String menuDescription, boolean menuStatus, UUID lastModifiedBy) {
        this();
        this.menuDescription = menuDescription;
        this.menuStatus = menuStatus;
        this.lastModifiedBy = lastModifiedBy;

    }

    public UUID getMenuID() {
        return menuID;
    }

    public void setMenuID(UUID menuID) {
        this.menuID = menuID;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public boolean isMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(boolean menuStatus) {
        this.menuStatus = menuStatus;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public UUID getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(UUID lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuID=" + menuID +
                '}';
    }
}
