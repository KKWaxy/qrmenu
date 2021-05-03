package com.qrmenu.qrmenuapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "ordertype")
public class OrderType {

    @Id
    private UUID orderTypeId;
    private String orderTypeDescription;
    private Date lastModifiedTime;
    private UUID lastModifiedBy;
    private Date timestamp;

    public OrderType(UUID orderTypeId, String orderTypeDescription, Date lastModifiedTime, UUID lastModifiedBy, Date timestamp) {
        this.orderTypeId = orderTypeId;
        this.orderTypeDescription = orderTypeDescription;
        this.lastModifiedTime = lastModifiedTime;
        this.lastModifiedBy = lastModifiedBy;
        this.timestamp = timestamp;
    }

    public UUID getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(UUID orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getOrderTypeDescription() {
        return orderTypeDescription;
    }

    public void setOrderTypeDescription(String orderTypeDescription) {
        this.orderTypeDescription = orderTypeDescription;
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
        return "OrderType{" +
                "orderTypeId=" + orderTypeId +
                '}';
    }
}
