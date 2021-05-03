package com.qrmenu.qrmenuapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "food")
public class Food {

    @Id
    private UUID foodId;
    private String foodDescription;
    private boolean foodStatus;
    private boolean foodType;
    private Date lastModifiedTime;
    private UUID lastModifiedBy;
    private Date timestamp;

    public Food(UUID foodId, String foodDescription, boolean foodStatus, boolean foodType, Date lastModifiedTime, UUID lastModifiedBy, Date timestamp) {
        this.foodId = foodId;
        this.foodDescription = foodDescription;
        this.foodStatus = foodStatus;
        this.foodType = foodType;
        this.lastModifiedTime = lastModifiedTime;
        this.lastModifiedBy = lastModifiedBy;
        this.timestamp = timestamp;
    }

    public UUID getFoodId() {
        return foodId;
    }

    public void setFoodId(UUID foodId) {
        this.foodId = foodId;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public boolean isFoodStatus() {
        return foodStatus;
    }

    public void setFoodStatus(boolean foodStatus) {
        this.foodStatus = foodStatus;
    }

    public boolean isFoodType() {
        return foodType;
    }

    public void setFoodType(boolean foodType) {
        this.foodType = foodType;
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
        return "Food{" +
                "foodId=" + foodId +
                '}';
    }
}
