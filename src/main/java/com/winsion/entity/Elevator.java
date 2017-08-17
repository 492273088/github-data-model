package com.winsion.entity;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/10/10:20
 * 电梯 c_elevator
 **/
@Entity
@Table(name = "c_elevator")
@DynamicInsert
@DynamicUpdate
public class Elevator extends BaseEntity {

    /**
     * 设备编号
     * */
    @Column(name = "deviceno")
    private String deviceNo;

    /**
     * 区域id
     * */
    @Column(name = "areaid")
    private String areaId;

    /**
     * 运行状态
     * 1 上行  2下行 3停止 4故障 5警告
     * */
    @Column(name = "runstate")
    private Integer runState;

    /**
     * 电梯类型 0直梯 1扶梯
     * */
    @Column(name = "elevatortype")
    private Integer elevatorType;

    /**
     * 当前停靠楼层
     * */
    @Column(name = "stopfloor")
    private Integer stopFloor;

    /**
     * 目标楼层
     * */
    @Column(name = "targetfloor")
    private Integer targetfloor;

    /**
     * 警告信息
     * */
    @Column(name = "alarminfo")
    private String alarmInfo;

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getRunState() {
        return runState;
    }

    public void setRunState(Integer runState) {
        this.runState = runState;
    }

    public Integer getElevatorType() {
        return elevatorType;
    }

    public void setElevatorType(Integer elevatorType) {
        this.elevatorType = elevatorType;
    }

    public Integer getStopFloor() {
        return stopFloor;
    }

    public void setStopFloor(Integer stopFloor) {
        this.stopFloor = stopFloor;
    }

    public Integer getTargetfloor() {
        return targetfloor;
    }

    public void setTargetfloor(Integer targetfloor) {
        this.targetfloor = targetfloor;
    }

    public String getAlarmInfo() {
        return alarmInfo;
    }

    public void setAlarmInfo(String alarmInfo) {
        this.alarmInfo = alarmInfo;
    }

    @Override
    public String toString() {
        return "Elevator{" + "deviceNo='" + deviceNo + '\'' + ", areaId='" + areaId + '\'' + ", runState=" + runState + ", elevatorType=" + elevatorType + ", stopFloor=" + stopFloor + ", targetfloor='" + targetfloor + '\'' + ", alarmInfo='" + alarmInfo + '\'' + '}';
    }
}
