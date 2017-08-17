package com.winsion.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author XiaoLei-Guo
 * @Date 2017/8/11/14:26
 **/
@Entity
@Table(name = "c_watertap")
@DynamicInsert
@DynamicUpdate
public class WaterTap extends BaseEntity{

    /**
     * 设备编号
     * */
    @Column(name = "deviceno")
    private String deviceNo;

    /**
     * 运行状态
     * 0 关闭  1开启 2故障
     * */
    @Column(name = "runstate")
    private Integer runState;

    /**
     * 区域id
     * */
    @Column(name = "areaid")
    private String areaId;

    /**
     * 阀门类型
     * 0 总阀  1 区域阀门  2区域子阀门
     * */
    @Column(name = "devicetype")
    private Integer deviceType;

    /**
     * 父阀门id
     * */
    @Column(name = "parentid")
    private String parentId;


    @Column(name = "devicevalue")
    private Double deviceValue;

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public Integer getRunState() {
        return runState;
    }

    public void setRunState(Integer runState) {
        this.runState = runState;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Double getDeviceValue() {
        return deviceValue;
    }

    public void setDeviceValue(Double deviceValue) {
        this.deviceValue = deviceValue;
    }
}
