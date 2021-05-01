package com.qrmenu.qrmenuapp.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "orderdetail")
public class OrderDetail {

    @Id
    private UUID orderDetailId;
    private UUID orderId;
    private UUID menuDetailId;
    private Date lastModifiedTime;
    private UUID lastModifiedBy;
    private Date timestamp;

    public OrderDetail(UUID orderDetailId, UUID orderId, UUID menuDetailId, Date lastModifiedTime, UUID lastModifiedBy, Date timestamp) {
        this.orderDetailId = orderDetailId;
        this.orderId = orderId;
        this.menuDetailId = menuDetailId;
        this.lastModifiedTime = lastModifiedTime;
        this.lastModifiedBy = lastModifiedBy;
        this.timestamp = timestamp;
    }

    public UUID getMenuDetailId() {
        return menuDetailId;
    }

    public void setMenuDetailId(UUID menuDetailId) {
        this.menuDetailId = menuDetailId;
    }
    public UUID getOrderDetailId() {
        return orderDetailId;
    }
    public void setOrderDetailId(UUID orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
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
        return "OrderDetail{" +
                "orderDetailId=" + orderDetailId +
                '}';
    }
}
