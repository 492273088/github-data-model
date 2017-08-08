package com.winsion.entity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "c_parkingspace")
@DynamicInsert
@DynamicUpdate
public class ParkingSpace {

    @Id
    @Column(
            nullable = false,
            unique = true
    )
    private String id = UUID.randomUUID().toString().replace("-", "");

    @Version
    @Column
    private int ver;

    @Column
    private Timestamp ctime;

    @Column
    private Timestamp utime;
    @Column(name = "parkingid")
    private String parkingId;


    @Column(name = "spaceno")
    private String spaceNo;


    @Column(name = "carno")
    private String carNo;


    @Column(name = "spacestate")
    private Integer spaceState;


    @Column(name = "laststoptime")
    private Date lastStopTime;


    @Column(name = "lastleavetime")
    private Date lastLeaveTime;


    @Column(name = "frequency")
    private Integer frequency;


    public String getParkingId() {
        return parkingId;
    }

    public void setParkingId(String parkingId) {
        this.parkingId = parkingId;
    }

    public String getSpaceNo() {
        return spaceNo;
    }

    public void setSpaceNo(String spaceNo) {
        this.spaceNo = spaceNo;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public Integer getSpaceState() {
        return spaceState;
    }

    public void setSpaceState(Integer spaceState) {
        this.spaceState = spaceState;
    }

    public Date getLastStopTime() {
        return lastStopTime;
    }

    public void setLastStopTime(Date lastStopTime) {
        this.lastStopTime = lastStopTime;
    }

    public Date getLastLeaveTime() {
        return lastLeaveTime;
    }

    public void setLastLeaveTime(Date lastLeaveTime) {
        this.lastLeaveTime = lastLeaveTime;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVer() {
        return ver;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public void setCtime(Timestamp ctime) {
        this.ctime = ctime;
    }

    public Timestamp getUtime() {
        return utime;
    }

    public void setUtime(Timestamp utime) {
        this.utime = utime;
    }


}
