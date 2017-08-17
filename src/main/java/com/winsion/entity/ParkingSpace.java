package com.winsion.entity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

/**
 * 停车位实体
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "c_parkingspace")
public class ParkingSpace extends BaseEntity{

    @Column(name = "parkingid")
    private String parkingId;


    @Column(name = "spaceno")
    private String spaceNo;


    @Column(name = "carno")
    private String carNo;


    @Column(name = "spacestate")
    private Integer spaceState;


    /**
     * 上一次停车时间
     */
    @Column(name = "laststoptime")
    private Date lastStopTime;

    /**
     * 上一次离开时间
     */
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

    @Override
    public String toString() {
        return "ParkingSpace{" + "parkingId='" + parkingId + '\'' + ", spaceNo='" + spaceNo + '\'' + ", carNo='" + carNo + '\'' + ", spaceState=" + spaceState + ", lastStopTime=" + lastStopTime + ", lastLeaveTime=" + lastLeaveTime + ", frequency=" + frequency + '}';
    }
}
