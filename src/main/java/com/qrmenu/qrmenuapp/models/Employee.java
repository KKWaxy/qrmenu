package com.qrmenu.qrmenuapp.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document(collection = "employee")
public class Employee {

    @Id
    private UUID employeeId;
    private String employeeName;
    private String employeePhoneNo;
    private String employeeEmail;
    private String employeeAddress;
    private String employeeNationality;
    private String employeeIdCarNo;
    private String employeePassword;
    private boolean employeeStatus;
    private String employeeRole;
    private Date lastModifiedDate;
    private Date timestamp;

    public Employee(UUID employeeId, String employeeName, String employeePhoneNo, String employeeEmail, String employeeAddress, String employeeNationality, String employeeIdCarNo, String employeePassword, boolean employeeStatus, String employeeRole, Date lastModifiedDate, Date timestamp) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhoneNo = employeePhoneNo;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.employeeNationality = employeeNationality;
        this.employeeIdCarNo = employeeIdCarNo;
        this.employeePassword = employeePassword;
        this.employeeStatus = employeeStatus;
        this.employeeRole = employeeRole;
        this.lastModifiedDate = lastModifiedDate;
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                '}';
    }
}
