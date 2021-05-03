package com.qrmenu.qrmenuapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "order")
public class Order {

    @Id
    private UUID orderId;
    private UUID tableId;
    private UUID orderTypeId;
    private UUID waiterId;
    private UUID cookerId;
    private UUID employeeID;
    private Date lastModifiedTime;
    private Date timestamp;

    public Order(UUID orderId, UUID tableId, UUID orderTypeId, UUID waiterId, UUID cookerId, UUID employeeID, Date lastModifiedTime, Date timestamp) {
        this.orderId = orderId;
        this.tableId = tableId;
        this.orderTypeId = orderTypeId;
        this.waiterId = waiterId;
        this.cookerId = cookerId;
        this.employeeID = employeeID;
        this.lastModifiedTime = lastModifiedTime;
        this.timestamp = timestamp;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getTableId() {
        return tableId;
    }

    public void setTableId(UUID tableId) {
        this.tableId = tableId;
    }

    public UUID getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(UUID orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public UUID getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(UUID waiterId) {
        this.waiterId = waiterId;
    }

    public UUID getCookerId() {
        return cookerId;
    }

    public void setCookerId(UUID cookerId) {
        this.cookerId = cookerId;
    }

    public UUID getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(UUID employeeID) {
        this.employeeID = employeeID;
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
        return "Order{" +
                "orderId=" + orderId +
                '}';
    }
}
