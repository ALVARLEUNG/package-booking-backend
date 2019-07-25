package com.oocl.packagebooking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import java.util.Date;

@Entity
public class ExpressPackage {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String phoneNumber;

    private String status;

    private Double weight;

    private Date time;

    public ExpressPackage(Long id, String name, @Max(value = 11) String phoneNumber, String status, Double weight, Date time) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.weight = weight;
        this.time = time;
    }

    public ExpressPackage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
