package com.qrmenu.qrmenuapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "table")
public class Table {

    @Id
    private UUID tableId;
    private Integer tableNumber;
    private String tablePosition;
    private String tableColor;
    private Date lastModifiedTime;
    private UUID lastModifiedBy;
    private Date timestamp;

    public Table(UUID tableId, Integer tableNumber, String tablePosition, String tableColor, Date lastModifiedTime, UUID lastModifiedBy, Date timestamp) {
        this.tableId = tableId;
        this.tableNumber = tableNumber;
        this.tablePosition = tablePosition;
        this.tableColor = tableColor;
        this.lastModifiedTime = lastModifiedTime;
        this.lastModifiedBy = lastModifiedBy;
        this.timestamp = timestamp;
    }

    public UUID getTableId() {
        return tableId;
    }

    public void setTableId(UUID tableId) {
        this.tableId = tableId;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getTablePosition() {
        return tablePosition;
    }

    public void setTablePosition(String tablePosition) {
        this.tablePosition = tablePosition;
    }

    public String getTableColor() {
        return tableColor;
    }

    public void setTableColor(String tableColor) {
        this.tableColor = tableColor;
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
        return "Table{" +
                "tableId=" + tableId +
                '}';
    }
}
