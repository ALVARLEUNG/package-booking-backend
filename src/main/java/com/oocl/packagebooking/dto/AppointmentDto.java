package com.oocl.packagebooking.dto;

import java.util.Date;

public class AppointmentDto {
    private Long id;
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
